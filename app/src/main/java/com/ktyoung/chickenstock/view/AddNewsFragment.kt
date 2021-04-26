package com.ktyoung.chickenstock.view

import android.annotation.SuppressLint
import android.content.res.ColorStateList
import android.os.Bundle
import android.view.*
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs
import com.ktyoung.chickenstock.R
import com.ktyoung.chickenstock.databinding.FragmentAddNewsBinding
import com.ktyoung.chickenstock.viewmodel.AddNewsViewModel
import kotlinx.android.synthetic.main.fragment_add_news.*
import kotlinx.coroutines.*


class AddNewsFragment : Fragment() {
    private lateinit var viewModel: AddNewsViewModel

    private var and = 0
    private var or = 0
    private var not = 0

    val args: AddFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentAddNewsBinding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_add_news,
            container,
            false
        )
        viewModel = ViewModelProvider(this).get(AddNewsViewModel::class.java)

        binding.viewmodel = viewModel
        binding.lifecycleOwner = this

        viewModel.andKeyword.observe(viewLifecycleOwner, { t ->
            if (and <= t.size) {
                if (t.size - and >= 2) {
                    for (s in t) {
                        onDynamicButton(add_layout, s)
                    }
                } else {
                    onDynamicButton(add_layout, t.last())
                }
                and = t.size
                et_add_and.text = null
            }
        })

        viewModel.orKeyword.observe(viewLifecycleOwner, { t ->
            if (or <= t.size) {
                if (t.size - or >= 2) {
                    for (s in t) {
                        onDynamicButton(or_layout, s)
                    }
                } else {
                    onDynamicButton(or_layout, t.last())
                }
                or = t.size
                et_add_or.text = null
            }

        })

        viewModel.notKeyword.observe(viewLifecycleOwner, { t ->
            if (not <= t.size) {
                if (t.size - or >= 2) {
                    for (s in t) {
                        onDynamicButton(not_layout, s)
                    }
                } else {
                    onDynamicButton(not_layout, t.last())
                }
                not = t.size
                et_add_not.text = null
            }

        })

        viewModel.error.observe(viewLifecycleOwner, Observer {
            Toast.makeText(context, it, Toast.LENGTH_SHORT).show()
        })

        setHasOptionsMenu(true)

        return binding.root
    }

    override fun onResume() {
        super.onResume()
        requireActivity().invalidateOptionsMenu()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (args.id != -1){
            val arr = args.keyword1!!.split(" +")
            for (s in arr) {
                if (!s.equals("")) {
                    viewModel.getAndKeyword1(s)
                }
            }

            viewModel.setTitle(args.title.toString())
            viewModel.id = args.id
        } else viewModel.id = args.id

        viewModel.navController = view.findNavController()
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    fun onDynamicButton(layout: LinearLayout, t: String) {
        val button = Button(context)
        button.text = t
        button.layoutParams = LinearLayout.LayoutParams(
            ViewGroup.LayoutParams.WRAP_CONTENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )
        val img = requireContext().resources.getDrawable(R.drawable.ic_baseline_add_circle_24)
        img.setBounds(0, 0, 60, 60)
        button.setCompoundDrawables(null, null, img, null)
        button.backgroundTintList = ColorStateList.valueOf(resources.getColor(R.color.navy_light))
        button.setTextColor(resources.getColor(R.color.white))
        layout.addView(button)

        button.setOnClickListener {
            viewModel.onDelAndClick(button.text.toString())
            layout.removeView(button)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.actionbar_button, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.action_save -> context?.let { viewModel.onSaveClick(it) }
        }
        return super.onOptionsItemSelected(item)
    }
}