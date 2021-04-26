package com.ktyoung.chickenstock.viewmodel

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.ktyoung.chickenstock.api.model.NewsModel
import com.ktyoung.chickenstock.database.model.KeywordModel
import com.ktyoung.chickenstock.util.BaseViewModel

class HomeViewModel(
    private var homeRepository: HomeRepository
) : BaseViewModel() {
    private var _keywords = MutableLiveData<ArrayList<KeywordModel>>()

//    var keywords: LiveData<ArrayList<KeywordModel>> = _keywords
    var keywords: LiveData<ArrayList<KeywordModel>> = homeRepository.getAllKeywords() as LiveData<ArrayList<KeywordModel>>

    fun getKeywords() {
//        _keywords = homeRepository.getAllKeywords()
    }

    fun insertKeywords(keywordModel: KeywordModel) {
        homeRepository.keywordInsert(keywordModel)
    }

    fun changeItsValue(someValue: ArrayList<KeywordModel>) {
        (keywords as? MutableLiveData)?.value = someValue
    }

//    inner class SearchNewsLiveData<T>() : MutableLiveData<T>() {
//        override fun onActive() {
//            super.onActive()
//            _keywords = homeRepository.getAllKeywords() as SearchNewsLiveData<ArrayList<KeywordModel>>
//        }
//    }
}