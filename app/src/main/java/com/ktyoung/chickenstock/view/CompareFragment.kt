package com.ktyoung.chickenstock.view

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.*
import com.ktyoung.chickenstock.R
import com.ktyoung.chickenstock.databinding.FragmentCompareBinding
import com.ktyoung.chickenstock.util.SettingDialog
import com.ktyoung.chickenstock.util.YearPickerDialog
import com.ktyoung.chickenstock.view.adapter.CorpAdapter
import com.ktyoung.chickenstock.view.adapter.MultiAcntAdapter
import com.ktyoung.chickenstock.viewmodel.MultiAcntViewModel
import kotlinx.android.synthetic.main.fragment_compare.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class CompareFragment : Fragment() {

    init {
        lifecycleScope.launch {
            whenStarted {
                Log.d(this.javaClass.name, "MultiAcntFragment init setp~~~~(started)")
            }

            whenResumed {
                Log.d(this.javaClass.name, "MultiAcntFragment init setp~~~~(resumed)")
            }
        }
    }

    private lateinit var viewModel: MultiAcntViewModel

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentCompareBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_compare, container, false)
        viewModel = ViewModelProvider(this).get(MultiAcntViewModel::class.java)

        binding.viewmodel = viewModel
        binding.lifecycleOwner = this

        GlobalScope.launch(Dispatchers.IO) {
            viewModel.getCorp(resources)
        }

        viewModel.corpList.observe(viewLifecycleOwner, Observer {
            it?.let {
                val adapter = CorpAdapter(requireContext(), android.R.layout.simple_list_item_1, it)
                binding.autoCompleteTextView.setAdapter(adapter)
                binding.autoCompleteTextView2.setAdapter(adapter)
            }
        })

        viewModel.selectedCorp.observe(viewLifecycleOwner, Observer {
            viewModel.selectedText.postValue(it.corp_name)
        })

        viewModel.selectedCorp2.observe(viewLifecycleOwner, Observer {
            viewModel.selectedText2.postValue(it.corp_name)
        })

        viewModel.error.observe(viewLifecycleOwner, Observer {
            Toast.makeText(context, it, Toast.LENGTH_SHORT).show()
        })

        binding.yearPicker.setOnClickListener {
            val newFragment = YearPickerDialog()
            newFragment.show(requireFragmentManager(), "DatePicker")
            newFragment.setListener { view, year, month, dayOfMonth ->
                viewModel.selectedYear.value = year.toString()
            }
        }

        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewLifecycleOwner.lifecycleScope.launch {
            val adapter = MultiAcntAdapter()
            adapter.setHasStableIds(true)
            rvItems.adapter = adapter
        }
    }
}