package com.ktyoung.chickenstock.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.findNavController
import com.ktyoung.chickenstock.R
import com.ktyoung.chickenstock.database.KeywordDatabase
import com.ktyoung.chickenstock.database.model.KeywordModel
import com.ktyoung.chickenstock.util.SettingDialog
import com.ktyoung.chickenstock.util.ViewModelFactory
import com.ktyoung.chickenstock.view.adapter.AddAdapter
import com.ktyoung.chickenstock.viewmodel.HomeRepository
import com.ktyoung.chickenstock.viewmodel.HomeViewModel
import kotlinx.android.synthetic.main.fragment_add.*

class AddFragment : Fragment() {

    private lateinit var viewModel: HomeViewModel

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_add, container, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val dao = KeywordDatabase.getInstance(view.context).keywordDao()
        val repository = HomeRepository.newInstance(dao)
        val factory = ViewModelFactory(repository)

        val adapter = AddAdapter( { keywordModel ->
            findNavController().navigate(AddFragmentDirections.actionAddFragmentToAddNewsFragment(keywordModel.id, keywordModel.title, keywordModel.keyword1, keywordModel.keyword2, keywordModel.keyword3))
        } , { keywordModel ->
            val dialog =
                SettingDialog.getInstance(yesClick = {
                    if (it) repository.keywordDelete(keywordModel)
                }, question = "정말 삭제 하시겠습니까?")
            dialog.show(requireFragmentManager(), dialog.tag)
        })

        repository.keywords.observe(viewLifecycleOwner, { t ->
            btn_add_news.setOnClickListener {
                if (t.size < 3)
                    findNavController().navigate(AddFragmentDirections.actionAddFragmentToAddNewsFragment(-1, "", "", "", ""))
                else
                    Toast.makeText(context, "뉴스는 최대 3개까지 설정 가능합니다.", Toast.LENGTH_LONG).show()
            }
        })

        rvItems.adapter = adapter
        rvItems.setHasFixedSize(true)

        viewModel = ViewModelProviders.of(this, factory).get(HomeViewModel::class.java)
//        viewModel = ViewModelProvider(this).get(HomeViewModel::class.java)

        viewModel.keywords.observe(viewLifecycleOwner, Observer<List<KeywordModel>> { keywords ->
            adapter.setContacts(keywords)
        })
    }


}