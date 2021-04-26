package com.ktyoung.chickenstock.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B#\u0012\u001c\u0010\u0002\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00060\u0003\u00a2\u0006\u0002\u0010\u0007J.\u0010\b\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0018R\'\u0010\u0002\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00060\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001a"}, d2 = {"Lcom/ktyoung/chickenstock/viewmodel/NewsRepository;", "", "newsList", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/ArrayList;", "Lcom/ktyoung/chickenstock/api/model/NewsModel;", "Lkotlin/collections/ArrayList;", "(Landroidx/lifecycle/MutableLiveData;)V", "getNewsList", "()Landroidx/lifecycle/MutableLiveData;", "retrofit", "Lcom/ktyoung/chickenstock/retrofit/RetrofitManager;", "getRetrofit", "()Lcom/ktyoung/chickenstock/retrofit/RetrofitManager;", "setRetrofit", "(Lcom/ktyoung/chickenstock/retrofit/RetrofitManager;)V", "", "query", "", "display", "", "start", "sort", "add", "", "Companion", "app_debug"})
public final class NewsRepository {
    @org.jetbrains.annotations.NotNull()
    private com.ktyoung.chickenstock.retrofit.RetrofitManager retrofit;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.ktyoung.chickenstock.api.model.NewsModel>> newsList = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.ktyoung.chickenstock.viewmodel.NewsRepository.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.ktyoung.chickenstock.retrofit.RetrofitManager getRetrofit() {
        return null;
    }
    
    public final void setRetrofit(@org.jetbrains.annotations.NotNull()
    com.ktyoung.chickenstock.retrofit.RetrofitManager p0) {
    }
    
    public final void getNewsList(@org.jetbrains.annotations.NotNull()
    java.lang.String query, int display, int start, @org.jetbrains.annotations.NotNull()
    java.lang.String sort, boolean add) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.ktyoung.chickenstock.api.model.NewsModel>> getNewsList() {
        return null;
    }
    
    public NewsRepository(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.ktyoung.chickenstock.api.model.NewsModel>> newsList) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\u00020\u00042\u001c\u0010\u0005\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t0\u0006\u00a8\u0006\n"}, d2 = {"Lcom/ktyoung/chickenstock/viewmodel/NewsRepository$Companion;", "", "()V", "newInstance", "Lcom/ktyoung/chickenstock/viewmodel/NewsRepository;", "newsList", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/ArrayList;", "Lcom/ktyoung/chickenstock/api/model/NewsModel;", "Lkotlin/collections/ArrayList;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.ktyoung.chickenstock.viewmodel.NewsRepository newInstance(@org.jetbrains.annotations.NotNull()
        androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.ktyoung.chickenstock.api.model.NewsModel>> newsList) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}