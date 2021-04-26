package com.ktyoung.chickenstock.view.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0018B-\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u00a2\u0006\u0002\u0010\bJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u001c\u0010\u0010\u001a\u00020\u00062\n\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u000fH\u0016J\u001c\u0010\u0013\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000fH\u0016J\u0014\u0010\u0017\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\fR\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n\u00a8\u0006\u0019"}, d2 = {"Lcom/ktyoung/chickenstock/view/adapter/AddAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/ktyoung/chickenstock/view/adapter/AddAdapter$ViewHolder;", "settingClick", "Lkotlin/Function1;", "Lcom/ktyoung/chickenstock/database/model/KeywordModel;", "", "deleteClick", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getDeleteClick", "()Lkotlin/jvm/functions/Function1;", "keywordModels", "", "getSettingClick", "getItemCount", "", "onBindViewHolder", "viewHolder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "i", "setContacts", "ViewHolder", "app_debug"})
public final class AddAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.ktyoung.chickenstock.view.adapter.AddAdapter.ViewHolder> {
    private java.util.List<com.ktyoung.chickenstock.database.model.KeywordModel> keywordModels;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<com.ktyoung.chickenstock.database.model.KeywordModel, kotlin.Unit> settingClick = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<com.ktyoung.chickenstock.database.model.KeywordModel, kotlin.Unit> deleteClick = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.ktyoung.chickenstock.view.adapter.AddAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int i) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.ktyoung.chickenstock.view.adapter.AddAdapter.ViewHolder viewHolder, int position) {
    }
    
    public final void setContacts(@org.jetbrains.annotations.NotNull()
    java.util.List<com.ktyoung.chickenstock.database.model.KeywordModel> keywordModels) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<com.ktyoung.chickenstock.database.model.KeywordModel, kotlin.Unit> getSettingClick() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<com.ktyoung.chickenstock.database.model.KeywordModel, kotlin.Unit> getDeleteClick() {
        return null;
    }
    
    public AddAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.ktyoung.chickenstock.database.model.KeywordModel, kotlin.Unit> settingClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.ktyoung.chickenstock.database.model.KeywordModel, kotlin.Unit> deleteClick) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0007*\u0004\u0018\u00010\t0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\t0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/ktyoung/chickenstock/view/adapter/AddAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/ktyoung/chickenstock/view/adapter/AddAdapter;Landroid/view/View;)V", "deleteBtn", "Landroid/widget/Button;", "kotlin.jvm.PlatformType", "nameTv", "Landroid/widget/TextView;", "numberTv", "settingBtn", "bind", "", "keywordModel", "Lcom/ktyoung/chickenstock/database/model/KeywordModel;", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final android.widget.TextView nameTv = null;
        private final android.widget.TextView numberTv = null;
        private final android.widget.Button deleteBtn = null;
        private final android.widget.Button settingBtn = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.ktyoung.chickenstock.database.model.KeywordModel keywordModel) {
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
}