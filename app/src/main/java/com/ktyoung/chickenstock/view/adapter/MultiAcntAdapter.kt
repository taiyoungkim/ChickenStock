package com.ktyoung.chickenstock.view.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.ktyoung.chickenstock.R
import com.ktyoung.chickenstock.api.model.MultiAcntModel
import com.ktyoung.chickenstock.databinding.ItemAcntBinding
import androidx.databinding.library.baseAdapters.BR

class MultiAcntAdapter  : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    var items = ArrayList<MultiAcntModel>()
        set(value) {
            items.clear()
            items.addAll(value)
        }

    inner class MultiAcntHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var binding: ItemAcntBinding? = null

        init {
            binding = DataBindingUtil.bind(itemView)
        }

        fun bind(item: MultiAcntModel) {
            binding?.setVariable(BR.multiAcntItem, item)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_acnt, parent, false)
        return MultiAcntHolder(view)
    }

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if(holder is MultiAcntHolder) {
            holder.bind(items[position])
        }
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }
}