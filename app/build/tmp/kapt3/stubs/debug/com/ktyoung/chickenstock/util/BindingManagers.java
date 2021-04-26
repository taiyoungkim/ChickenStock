package com.ktyoung.chickenstock.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J.\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u001c\u0010\u000b\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f0\fH\u0007J.\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u001c\u0010\u000b\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00110\rj\b\u0012\u0004\u0012\u00020\u0011`\u000f0\fH\u0007J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0014H\u0007\u00a8\u0006\u0015"}, d2 = {"Lcom/ktyoung/chickenstock/util/BindingManagers;", "", "()V", "double2String", "", "number", "", "setBindItem", "", "view", "Landroidx/recyclerview/widget/RecyclerView;", "items", "Landroidx/lifecycle/LiveData;", "Ljava/util/ArrayList;", "Lcom/ktyoung/chickenstock/api/model/NewsModel;", "Lkotlin/collections/ArrayList;", "setBindItem2", "Lcom/ktyoung/chickenstock/api/model/MultiAcntModel;", "toSimpleString", "date", "Ljava/util/Date;", "app_debug"})
public final class BindingManagers {
    @org.jetbrains.annotations.NotNull()
    public static final com.ktyoung.chickenstock.util.BindingManagers INSTANCE = null;
    
    @androidx.databinding.BindingAdapter(value = {"items"})
    public static final void setBindItem(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView view, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.util.ArrayList<com.ktyoung.chickenstock.api.model.NewsModel>> items) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"items2"})
    public static final void setBindItem2(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView view, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.util.ArrayList<com.ktyoung.chickenstock.api.model.MultiAcntModel>> items) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.databinding.BindingConversion()
    public static final java.lang.String toSimpleString(@org.jetbrains.annotations.NotNull()
    java.util.Date date) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.databinding.BindingConversion()
    public static final java.lang.String double2String(double number) {
        return null;
    }
    
    private BindingManagers() {
        super();
    }
}