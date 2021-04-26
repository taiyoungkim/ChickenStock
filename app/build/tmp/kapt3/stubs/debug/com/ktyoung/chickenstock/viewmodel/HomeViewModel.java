package com.ktyoung.chickenstock.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001e\u0010\u0010\u001a\u00020\u00112\u0016\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\u000bJ\u0006\u0010\f\u001a\u00020\u0011J\u000e\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\bR\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R0\u0010\t\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\u000b0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0015"}, d2 = {"Lcom/ktyoung/chickenstock/viewmodel/HomeViewModel;", "Lcom/ktyoung/chickenstock/util/BaseViewModel;", "homeRepository", "Lcom/ktyoung/chickenstock/viewmodel/HomeRepository;", "(Lcom/ktyoung/chickenstock/viewmodel/HomeRepository;)V", "_keywords", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/ArrayList;", "Lcom/ktyoung/chickenstock/database/model/KeywordModel;", "keywords", "Landroidx/lifecycle/LiveData;", "Lkotlin/collections/ArrayList;", "getKeywords", "()Landroidx/lifecycle/LiveData;", "setKeywords", "(Landroidx/lifecycle/LiveData;)V", "changeItsValue", "", "someValue", "insertKeywords", "keywordModel", "app_debug"})
public final class HomeViewModel extends com.ktyoung.chickenstock.util.BaseViewModel {
    private androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.ktyoung.chickenstock.database.model.KeywordModel>> _keywords;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.LiveData<java.util.ArrayList<com.ktyoung.chickenstock.database.model.KeywordModel>> keywords;
    private com.ktyoung.chickenstock.viewmodel.HomeRepository homeRepository;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.ArrayList<com.ktyoung.chickenstock.database.model.KeywordModel>> getKeywords() {
        return null;
    }
    
    public final void setKeywords(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.util.ArrayList<com.ktyoung.chickenstock.database.model.KeywordModel>> p0) {
    }
    
    public final void getKeywords() {
    }
    
    public final void insertKeywords(@org.jetbrains.annotations.NotNull()
    com.ktyoung.chickenstock.database.model.KeywordModel keywordModel) {
    }
    
    public final void changeItsValue(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.ktyoung.chickenstock.database.model.KeywordModel> someValue) {
    }
    
    public HomeViewModel(@org.jetbrains.annotations.NotNull()
    com.ktyoung.chickenstock.viewmodel.HomeRepository homeRepository) {
        super();
    }
}