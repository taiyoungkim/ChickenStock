package com.ktyoung.chickenstock.viewmodel

import android.content.res.Resources
import android.util.Log
import android.widget.AdapterView
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.ktyoung.chickenstock.api.model.CorpModel
import com.ktyoung.chickenstock.api.model.MultiAcntModel
import com.ktyoung.chickenstock.util.BaseViewModel
import kotlinx.coroutines.launch
import java.util.*
import kotlin.collections.ArrayList

class MultiAcntViewModel  : BaseViewModel() {
    private var _acntList = SearchMultiAcntLiveData<ArrayList<MultiAcntModel>>()
    private var _corpList = SearchMultiAcntLiveData<ArrayList<CorpModel>>()
    private var _error = SearchMultiAcntLiveData<String>()

    val repo = MultiAcntRepository(_acntList, _corpList, _error)

    var acntList: LiveData<ArrayList<MultiAcntModel>> = _acntList
    var corpList: LiveData<ArrayList<CorpModel>> = _corpList
    var error: LiveData<String> = _error

    var selectedCorp = MutableLiveData<CorpModel>(CorpModel("",""))
    var selectedCorp2 = MutableLiveData<CorpModel>(CorpModel("",""))
    var selectedText = MutableLiveData<String>("")
    var selectedText2 = MutableLiveData<String>("")
    var selectedYear = MutableLiveData<String>(Calendar.getInstance().get(Calendar.YEAR).toString())

    init {
        viewModelScope.launch {
            Log.d(this.javaClass.name, "NewsViewModel >> init setp~~~~")
        }
    }

    fun getAcnt(crtfc_key: String, corp_code: String, bsns_year: String, reprt_code: String, fs_div: String) {
        if (corp_code.isNotEmpty()) {
            repo.getMultiAcntList(crtfc_key, corp_code, bsns_year, reprt_code, fs_div)
        }
    }

    fun getCorp(resources: Resources) {
        repo.getCorp(resources)
    }

    fun onItemClick(parent: AdapterView<*>, position: Int) {
        selectedCorp.postValue(parent.adapter.getItem(position) as CorpModel?)
    }

    fun onItemClick2(parent: AdapterView<*>, position: Int) {
        selectedCorp2.postValue(parent.adapter.getItem(position) as CorpModel?)
    }

    fun onCompare(key: String) {
        val corp_code = selectedCorp.value?.corp_code + "," + selectedCorp2.value?.corp_code
        val report_code = when(reposrtSelectedPosition.value) {
            0 -> "11013"
            1 -> "11012"
            2 -> "11014"
            else -> "11011"
        }

        val statement = when(spinnerSelectedPosition.value) {
            0 -> "CFS"
            else -> "OFS"
        }

//        00126380 삼성전자 005930
//        00401731 LG전자 066570

        getAcnt(key, corp_code, selectedYear.value.toString(), report_code, statement)
    }

    inner class SearchMultiAcntLiveData<T>() : MutableLiveData<T>() {
        override fun onActive() {
            super.onActive()
        }
    }

    val spinnerSelectedPosition = MutableLiveData<Int>() // This gets updated once spinner item selection changes
    val reposrtSelectedPosition = MutableLiveData<Int>(3) // This gets updated once spinner item selection changes
}
