package com.ktyoung.chickenstock.view.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.ktyoung.chickenstock.database.model.KeywordModel
import com.ktyoung.chickenstock.view.NewsFragment

class ViewPagerAdapter(fragmentManager: FragmentManager, private val keywords: List<KeywordModel>) :
    FragmentStatePagerAdapter(fragmentManager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT){

    override fun getItem(position: Int): Fragment {
        return NewsFragment.newInstance(keywords?.get(position)?.keyword1!!+keywords?.get(position)?.keyword2!!+keywords?.get(position)?.keyword3!!)
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return keywords?.get(position)?.title
    }

    override fun getCount(): Int {
        return keywords!!.size
    }
}