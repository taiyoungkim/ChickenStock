package com.ktyoung.chickenstock.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.ktyoung.chickenstock.api.model.NewsApiModel
import com.ktyoung.chickenstock.api.model.NewsModel
import com.ktyoung.chickenstock.retrofit.RetrofitManager
import com.ktyoung.chickenstock.retrofit.RetrofitService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class NewsRepository(
    val newsList: MutableLiveData<ArrayList<NewsModel>>
) {
    var retrofit: RetrofitManager

    companion object{
        fun newInstance(
            newsList: MutableLiveData<ArrayList<NewsModel>>
        ) = NewsRepository(newsList)
    }

    init {
        Log.d(this.javaClass.name, "NewsRepository init step")
        retrofit = RetrofitService.getInstance(0)
    }

    fun getNewsList(query: String, display: Int, start: Int, sort: String, add: Boolean) {
        retrofit.getNews(query, display, start, sort).enqueue(object : Callback<NewsApiModel> {
            override fun onResponse(call: Call<NewsApiModel>, response: Response<NewsApiModel>) {
                val model = response.body()?.items
                if (model != null) {

                    val loading = NewsModel(" ","","","","")
                    model.add(loading)

                    if (add) {
                        newsList.value!!.removeAt(newsList.value!!.lastIndex)
                        newsList.value!!.addAll(model)
                        newsList.postValue(newsList.value)
                    }
                    else
                        newsList.postValue(model)

                    Log.d(this.javaClass.name, "NewsRepository get NewsList success")
                }
            }

            override fun onFailure(call: Call<NewsApiModel>, t: Throwable) {
                Log.d(this.javaClass.name, "NewsRepository get NewsList failed")
                t.stackTrace
            }
        })
    }
}