package com.ktyoung.chickenstock.retrofit;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J6\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\u0006H\'J6\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0001\u0010\f\u001a\u00020\u00062\b\b\u0001\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\u0010\u001a\u00020\u0006H\'\u00a8\u0006\u0011"}, d2 = {"Lcom/ktyoung/chickenstock/retrofit/RetrofitManager;", "", "getMultiAcnt", "Lretrofit2/Call;", "Lcom/ktyoung/chickenstock/api/model/MultiAcntApiModel;", "crtfc_key", "", "corp_code", "bsns_year", "reprt_code", "getNews", "Lcom/ktyoung/chickenstock/api/model/NewsApiModel;", "query", "display", "", "start", "sort", "app_debug"})
public abstract interface RetrofitManager {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "search/news")
    public abstract retrofit2.Call<com.ktyoung.chickenstock.api.model.NewsApiModel> getNews(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "query")
    java.lang.String query, @retrofit2.http.Query(value = "display")
    int display, @retrofit2.http.Query(value = "start")
    int start, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "sort")
    java.lang.String sort);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "api/fnlttMultiAcnt.json")
    public abstract retrofit2.Call<com.ktyoung.chickenstock.api.model.MultiAcntApiModel> getMultiAcnt(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "crtfc_key")
    java.lang.String crtfc_key, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "corp_code")
    java.lang.String corp_code, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "bsns_year")
    java.lang.String bsns_year, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "reprt_code")
    java.lang.String reprt_code);
}