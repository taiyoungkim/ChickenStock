package com.ktyoung.chickenstock.util

import androidx.databinding.BindingAdapter
import androidx.databinding.BindingConversion
import androidx.lifecycle.LiveData
import androidx.recyclerview.widget.RecyclerView
import com.ktyoung.chickenstock.api.model.MultiAcntModel
import com.ktyoung.chickenstock.api.model.NewsModel
import com.ktyoung.chickenstock.view.adapter.MultiAcntAdapter
import com.ktyoung.chickenstock.view.adapter.NewsAdapter
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList

object BindingManagers {

    // 해당 클래스 내부에서 관리하는것이 나을지 아니면 별도로 관리하는게 나을지
    @JvmStatic
    @BindingAdapter("items")
    fun setBindItem(view: RecyclerView, items: LiveData<ArrayList<NewsModel>>) {
        view.adapter?.run {
            if (this is NewsAdapter) {
                if (items.value != null)
                    this.items = items.value!!
                else this.items = ArrayList<NewsModel>()

                this.notifyDataSetChanged()
            }
        }
    }

    @JvmStatic
    @BindingAdapter("items2")
    fun setBindItem2(view: RecyclerView, items: LiveData<ArrayList<MultiAcntModel>>) {
        view.adapter?.run {
            if (this is MultiAcntAdapter) {
                if (items.value != null)
                    this.items = items.value!!
                else this.items = ArrayList<MultiAcntModel>()

                this.notifyDataSetChanged()
            }
        }
    }

    @JvmStatic
    @BindingConversion
    fun toSimpleString(date: Date) : String {
        val format = SimpleDateFormat("yyyy/MM/dd")
        return format.format(date)
    }

    @JvmStatic
    @BindingConversion
    fun double2String(number: Double): String = "$number"
}