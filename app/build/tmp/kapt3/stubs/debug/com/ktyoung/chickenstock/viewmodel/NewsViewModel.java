package com.ktyoung.chickenstock.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001*B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020\u000fJ\u000e\u0010(\u001a\u00020&2\u0006\u0010\'\u001a\u00020\u000fJ\u0006\u0010)\u001a\u00020&R\u001e\u0010\u0003\u001a\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004R\u00020\u0000X\u0082\u000e\u00a2\u0006\u0002\n\u0000R(\u0010\u0007\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R0\u0010\u0014\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00160\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u001c\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020 X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$\u00a8\u0006+"}, d2 = {"Lcom/ktyoung/chickenstock/viewmodel/NewsViewModel;", "Lcom/ktyoung/chickenstock/util/BaseViewModel;", "()V", "_newsList", "Lcom/ktyoung/chickenstock/viewmodel/NewsViewModel$SearchNewsLiveData;", "Ljava/util/ArrayList;", "Lcom/ktyoung/chickenstock/api/model/NewsModel;", "isLoading", "Landroidx/lifecycle/MutableLiveData;", "", "kotlin.jvm.PlatformType", "()Landroidx/lifecycle/MutableLiveData;", "setLoading", "(Landroidx/lifecycle/MutableLiveData;)V", "keyword", "", "getKeyword", "()Ljava/lang/String;", "setKeyword", "(Ljava/lang/String;)V", "newsList", "Landroidx/lifecycle/LiveData;", "Lkotlin/collections/ArrayList;", "getNewsList", "()Landroidx/lifecycle/LiveData;", "setNewsList", "(Landroidx/lifecycle/LiveData;)V", "repo", "Lcom/ktyoung/chickenstock/viewmodel/NewsRepository;", "getRepo", "()Lcom/ktyoung/chickenstock/viewmodel/NewsRepository;", "start", "", "getStart", "()I", "setStart", "(I)V", "addQuery", "", "query", "getQuery", "onRefresh", "SearchNewsLiveData", "app_debug"})
public final class NewsViewModel extends com.ktyoung.chickenstock.util.BaseViewModel {
    private com.ktyoung.chickenstock.viewmodel.NewsViewModel.SearchNewsLiveData<java.util.ArrayList<com.ktyoung.chickenstock.api.model.NewsModel>> _newsList;
    @org.jetbrains.annotations.NotNull()
    private final com.ktyoung.chickenstock.viewmodel.NewsRepository repo = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.LiveData<java.util.ArrayList<com.ktyoung.chickenstock.api.model.NewsModel>> newsList;
    private int start = 1;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String keyword = "";
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLoading;
    
    @org.jetbrains.annotations.NotNull()
    public final com.ktyoung.chickenstock.viewmodel.NewsRepository getRepo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.ArrayList<com.ktyoung.chickenstock.api.model.NewsModel>> getNewsList() {
        return null;
    }
    
    public final void setNewsList(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.util.ArrayList<com.ktyoung.chickenstock.api.model.NewsModel>> p0) {
    }
    
    public final int getStart() {
        return 0;
    }
    
    public final void setStart(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getKeyword() {
        return null;
    }
    
    public final void setKeyword(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLoading() {
        return null;
    }
    
    public final void setLoading(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    public final void getQuery(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
    }
    
    public final void addQuery(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
    }
    
    public final void onRefresh() {
    }
    
    public NewsViewModel() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0014\u00a8\u0006\u0006"}, d2 = {"Lcom/ktyoung/chickenstock/viewmodel/NewsViewModel$SearchNewsLiveData;", "T", "Landroidx/lifecycle/MutableLiveData;", "(Lcom/ktyoung/chickenstock/viewmodel/NewsViewModel;)V", "onActive", "", "app_debug"})
    public final class SearchNewsLiveData<T extends java.lang.Object> extends androidx.lifecycle.MutableLiveData<T> {
        
        @java.lang.Override()
        protected void onActive() {
        }
        
        public SearchNewsLiveData() {
            super(null);
        }
    }
}