package com.ktyoung.chickenstock.viewmodel

import androidx.lifecycle.MutableLiveData
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class AddNewsRepository(
        private val andKeyword: MutableLiveData<ArrayList<String>>,
        private val orKeyword: MutableLiveData<ArrayList<String>>,
        private val notKeyword: MutableLiveData<ArrayList<String>>
) {
    companion object {
        fun newInstance(
                andKeyword: MutableLiveData<ArrayList<String>>,
                orKeyword: MutableLiveData<ArrayList<String>>,
                notKeyword: MutableLiveData<ArrayList<String>>
        ) = AddNewsRepository(andKeyword, orKeyword, notKeyword)
    }

    fun getAndKeyword(arr: ArrayList<String>) {
        andKeyword.postValue(arr)
//        andKeyword.postValue(andKeyword.value.add(s))
    }

    fun deleteAndKeyword(s: String) {
        andKeyword.value!!.remove(s)
        andKeyword.postValue(andKeyword.value)
    }

    fun getOrKeyword(arr: ArrayList<String>) {
        orKeyword.postValue(arr)
//        andKeyword.postValue(andKeyword.value.add(s))
    }

    fun deleteOrKeyword(s: String) {
        orKeyword.value!!.remove(s)
        orKeyword.postValue(orKeyword.value)
    }

    fun getNotKeyword(arr: ArrayList<String>) {
        notKeyword.postValue(arr)
//        andKeyword.postValue(andKeyword.value.add(s))
    }

    fun deleteNotKeyword(s: String) {
        notKeyword.value!!.remove(s)
        notKeyword.postValue(notKeyword.value)
    }
}