package com.ktyoung.chickenstock.retrofit

import com.ktyoung.chickenstock.api.model.MultiAcntApiModel
import com.ktyoung.chickenstock.api.model.NewsApiModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface RetrofitManager {
    @GET("search/news")
    fun getNews(
        @Query("query") query: String,
        @Query("display") display: Int,
        @Query("start") start: Int,
        @Query("sort") sort: String
    ): Call<NewsApiModel>

    @GET("api/fnlttMultiAcnt.json")
    fun getMultiAcnt(
            @Query("crtfc_key") crtfc_key: String,
            @Query("corp_code") corp_code: String,
            @Query("bsns_year") bsns_year: String,
            @Query("reprt_code") reprt_code: String
    ): Call<MultiAcntApiModel>
}