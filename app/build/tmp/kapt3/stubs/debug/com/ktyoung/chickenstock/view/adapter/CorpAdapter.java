package com.ktyoung.chickenstock.view.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B%\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010\f\u001a\u00020\u0007H\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0010\u001a\u00020\u0007H\u0016J\"\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/ktyoung/chickenstock/view/adapter/CorpAdapter;", "Landroid/widget/ArrayAdapter;", "Lcom/ktyoung/chickenstock/api/model/CorpModel;", "Landroid/widget/Filterable;", "context", "Landroid/content/Context;", "layoutResource", "", "allCorp", "", "(Landroid/content/Context;ILjava/util/List;)V", "mCorp", "getCount", "getFilter", "Landroid/widget/Filter;", "getItem", "p0", "getView", "Landroid/view/View;", "position", "convertView", "parent", "Landroid/view/ViewGroup;", "app_debug"})
public final class CorpAdapter extends android.widget.ArrayAdapter<com.ktyoung.chickenstock.api.model.CorpModel> implements android.widget.Filterable {
    private java.util.List<com.ktyoung.chickenstock.api.model.CorpModel> mCorp;
    private final int layoutResource = 0;
    private final java.util.List<com.ktyoung.chickenstock.api.model.CorpModel> allCorp = null;
    
    @java.lang.Override()
    public int getCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.ktyoung.chickenstock.api.model.CorpModel getItem(int p0) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View getView(int position, @org.jetbrains.annotations.Nullable()
    android.view.View convertView, @org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.widget.Filter getFilter() {
        return null;
    }
    
    public CorpAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @androidx.annotation.LayoutRes()
    int layoutResource, @org.jetbrains.annotations.NotNull()
    java.util.List<com.ktyoung.chickenstock.api.model.CorpModel> allCorp) {
        super(null, 0);
    }
}