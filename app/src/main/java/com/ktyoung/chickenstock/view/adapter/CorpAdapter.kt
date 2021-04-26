package com.ktyoung.chickenstock.view.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Filter
import android.widget.Filterable
import android.widget.TextView
import androidx.annotation.LayoutRes
import com.ktyoung.chickenstock.api.model.CorpModel

class CorpAdapter(context: Context, @LayoutRes private val layoutResource: Int, private val allCorp: List<CorpModel>):
        ArrayAdapter<CorpModel>(context, layoutResource, allCorp),
        Filterable {
    private var mCorp: List<CorpModel> = allCorp

    override fun getCount(): Int {
        return mCorp.size
    }

    override fun getItem(p0: Int): CorpModel? {
        return mCorp.get(p0)
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view: TextView = convertView as TextView? ?: LayoutInflater.from(context).inflate(layoutResource, parent, false) as TextView
        view.text = "${mCorp[position].corp_name}"
        return view
    }

    override fun getFilter(): Filter {
        return object : Filter() {
            override fun publishResults(charSequence: CharSequence?, filterResults: Filter.FilterResults) {
                mCorp = filterResults.values as List<CorpModel>
                notifyDataSetChanged()
            }

            override fun performFiltering(charSequence: CharSequence?): Filter.FilterResults {
                val queryString = charSequence?.toString()?.toUpperCase()

                val filterResults = Filter.FilterResults()
                filterResults.values = if (queryString==null || queryString.isEmpty())
                    allCorp
                else
                    allCorp.filter {
                        it.corp_name.toUpperCase().contains(queryString) ||
                                it.corp_code.toUpperCase().contains(queryString)
                    }
                return filterResults
            }
        }
    }
}