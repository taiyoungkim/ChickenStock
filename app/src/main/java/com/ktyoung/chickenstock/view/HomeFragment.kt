package com.ktyoung.chickenstock.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ktyoung.chickenstock.R
import com.ktyoung.chickenstock.database.KeywordDatabase
import com.ktyoung.chickenstock.database.model.KeywordModel
import com.ktyoung.chickenstock.view.adapter.ViewPagerAdapter
import com.ktyoung.chickenstock.viewmodel.HomeRepository
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view = inflater.inflate(R.layout.fragment_home, container, false)
        val dao = KeywordDatabase.getInstance(view.context).keywordDao()
        val repository = HomeRepository.newInstance(dao)
//        repository.keywordInsert(KeywordModel(0, "test2"," +삼성전자 +윈도우"," "," -애플",0))

        repository.keywords.observe(viewLifecycleOwner, { t ->
            val viewPagerAdapter = ViewPagerAdapter(childFragmentManager, t)
            if (t.isEmpty()) {
                empty_view.visibility = View.VISIBLE
                tabs.visibility = View.GONE
            } else {
                empty_view.visibility = View.GONE
                tabs.visibility = View.VISIBLE
            }

            view_pager.adapter = viewPagerAdapter

            tabs.setupWithViewPager(view_pager)
        })
        return view
    }

    companion object {
    }
}