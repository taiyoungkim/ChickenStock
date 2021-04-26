package com.ktyoung.chickenstock.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.ktyoung.chickenstock.api.model.NewsModel
import com.ktyoung.chickenstock.util.BaseViewModel
import kotlinx.coroutines.launch

class NewsViewModel : BaseViewModel() {
    private var _newsList = SearchNewsLiveData<ArrayList<NewsModel>>()

    val repo = NewsRepository.newInstance(_newsList)

    var newsList: LiveData<ArrayList<NewsModel>> = _newsList

    var start = 1
    var keyword = ""
    var isLoading = MutableLiveData(false)

    init {
        viewModelScope.launch {
            Log.d(this.javaClass.name, "NewsViewModel >> init setp~~~~")
        }
    }

    fun getQuery(query: String) {
        if (query.isNotEmpty()) {
            keyword = query
            repo.getNewsList(query, 10, start, "date", false)
        }
    }

    fun addQuery(query: String) {
        if (query.isNotEmpty()) {
            keyword = query
            repo.getNewsList(query, 10, start * 10 + 1, "date", true)
            start++
        }
    }

    fun onRefresh() {
        isLoading.value = true
        repo.getNewsList(keyword, 10, start, "date", false)
        isLoading.value = false
    }

    inner class SearchNewsLiveData<T>() : MutableLiveData<T>() {
        override fun onActive() {
            super.onActive()

        }
    }
}