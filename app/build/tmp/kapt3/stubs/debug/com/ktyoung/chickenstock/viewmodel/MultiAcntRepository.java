package com.ktyoung.chickenstock.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 %2\u00020\u0001:\u0001%BO\u0012\u001c\u0010\u0002\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00060\u0003\u0012\u001c\u0010\u0007\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\b0\u0004j\b\u0012\u0004\u0012\u00020\b`\u00060\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u00a2\u0006\u0002\u0010\u000bJ\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eJ.\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\n2\u0006\u0010!\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\n2\u0006\u0010#\u001a\u00020\n2\u0006\u0010$\u001a\u00020\nR\'\u0010\u0002\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00060\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\'\u0010\u0007\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\b0\u0004j\b\u0012\u0004\u0012\u00020\b`\u00060\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\rR\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u00a8\u0006&"}, d2 = {"Lcom/ktyoung/chickenstock/viewmodel/MultiAcntRepository;", "", "acntList", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/ArrayList;", "Lcom/ktyoung/chickenstock/api/model/MultiAcntModel;", "Lkotlin/collections/ArrayList;", "corpList", "Lcom/ktyoung/chickenstock/api/model/CorpModel;", "error", "", "(Landroidx/lifecycle/MutableLiveData;Landroidx/lifecycle/MutableLiveData;Landroidx/lifecycle/MutableLiveData;)V", "getAcntList", "()Landroidx/lifecycle/MutableLiveData;", "arr", "getArr", "()Ljava/util/ArrayList;", "setArr", "(Ljava/util/ArrayList;)V", "getCorpList", "getError", "retrofit", "Lcom/ktyoung/chickenstock/retrofit/RetrofitManager;", "getRetrofit", "()Lcom/ktyoung/chickenstock/retrofit/RetrofitManager;", "setRetrofit", "(Lcom/ktyoung/chickenstock/retrofit/RetrofitManager;)V", "getCorp", "", "resources", "Landroid/content/res/Resources;", "getMultiAcntList", "crtfc_key", "corp_code", "bsns_year", "reprt_code", "fs_div", "Companion", "app_debug"})
public final class MultiAcntRepository {
    @org.jetbrains.annotations.NotNull()
    private com.ktyoung.chickenstock.retrofit.RetrofitManager retrofit;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.ktyoung.chickenstock.api.model.CorpModel> arr;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.ktyoung.chickenstock.api.model.MultiAcntModel>> acntList = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.ktyoung.chickenstock.api.model.CorpModel>> corpList = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> error = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.ktyoung.chickenstock.viewmodel.MultiAcntRepository.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.ktyoung.chickenstock.retrofit.RetrofitManager getRetrofit() {
        return null;
    }
    
    public final void setRetrofit(@org.jetbrains.annotations.NotNull()
    com.ktyoung.chickenstock.retrofit.RetrofitManager p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.ktyoung.chickenstock.api.model.CorpModel> getArr() {
        return null;
    }
    
    public final void setArr(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.ktyoung.chickenstock.api.model.CorpModel> p0) {
    }
    
    public final void getMultiAcntList(@org.jetbrains.annotations.NotNull()
    java.lang.String crtfc_key, @org.jetbrains.annotations.NotNull()
    java.lang.String corp_code, @org.jetbrains.annotations.NotNull()
    java.lang.String bsns_year, @org.jetbrains.annotations.NotNull()
    java.lang.String reprt_code, @org.jetbrains.annotations.NotNull()
    java.lang.String fs_div) {
    }
    
    public final void getCorp(@org.jetbrains.annotations.NotNull()
    android.content.res.Resources resources) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.ktyoung.chickenstock.api.model.MultiAcntModel>> getAcntList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.ktyoung.chickenstock.api.model.CorpModel>> getCorpList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getError() {
        return null;
    }
    
    public MultiAcntRepository(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.ktyoung.chickenstock.api.model.MultiAcntModel>> acntList, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.ktyoung.chickenstock.api.model.CorpModel>> corpList, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> error) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002JP\u0010\u0003\u001a\u00020\u00042\u001c\u0010\u0005\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t0\u00062\u001c\u0010\n\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000b0\u0007j\b\u0012\u0004\u0012\u00020\u000b`\t0\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0006\u00a8\u0006\u000e"}, d2 = {"Lcom/ktyoung/chickenstock/viewmodel/MultiAcntRepository$Companion;", "", "()V", "newInstance", "Lcom/ktyoung/chickenstock/viewmodel/MultiAcntRepository;", "acntList", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/ArrayList;", "Lcom/ktyoung/chickenstock/api/model/MultiAcntModel;", "Lkotlin/collections/ArrayList;", "corpList", "Lcom/ktyoung/chickenstock/api/model/CorpModel;", "error", "", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.ktyoung.chickenstock.viewmodel.MultiAcntRepository newInstance(@org.jetbrains.annotations.NotNull()
        androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.ktyoung.chickenstock.api.model.MultiAcntModel>> acntList, @org.jetbrains.annotations.NotNull()
        androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.ktyoung.chickenstock.api.model.CorpModel>> corpList, @org.jetbrains.annotations.NotNull()
        androidx.lifecycle.MutableLiveData<java.lang.String> error) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}