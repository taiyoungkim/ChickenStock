package com.ktyoung.chickenstock.view.adapter

import android.text.Html
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ktyoung.chickenstock.R
import com.ktyoung.chickenstock.database.model.KeywordModel

class AddAdapter(val settingClick: (KeywordModel) -> Unit, val deleteClick: (KeywordModel) -> Unit)
    : RecyclerView.Adapter<AddAdapter.ViewHolder>() {
    private var keywordModels: List<KeywordModel> = listOf()

    override fun onCreateViewHolder(parent: ViewGroup, i: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_news_setting, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return keywordModels.size
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        viewHolder.bind(keywordModels[position])
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        private val nameTv = itemView.findViewById<TextView>(R.id.title)
        private val numberTv = itemView.findViewById<TextView>(R.id.keywords)
        private val deleteBtn = itemView.findViewById<Button>(R.id.btn_news_delete)
        private val settingBtn = itemView.findViewById<Button>(R.id.btn_news_setting)

        fun bind(keywordModel: KeywordModel) {
            nameTv.text = keywordModel.title
            val keywordSum = keywordModel.keyword1!!.replace(" +", " ")
            numberTv.text = Html.fromHtml("<font color=\"#2a7de2\"><b>$keywordSum </b></font>모두 동시 포함")

            settingBtn.setOnClickListener {
                settingClick(keywordModel)
            }

            deleteBtn.setOnClickListener {
                deleteClick(keywordModel)
            }
        }
    }

    fun setContacts(keywordModels: List<KeywordModel>) {
        this.keywordModels = keywordModels
        notifyDataSetChanged()
    }

}
