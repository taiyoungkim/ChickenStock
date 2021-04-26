package com.ktyoung.chickenstock.view.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u001f !B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0013\u001a\u00020\u0007H\u0016J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0007H\u0016J\u0010\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0007H\u0016J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0007H\u0016J\u0018\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0007H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082D\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR0\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u00a8\u0006\""}, d2 = {"Lcom/ktyoung/chickenstock/view/adapter/NewsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "clickListener", "Lcom/ktyoung/chickenstock/view/adapter/NewsAdapter$ItemClickListener;", "(Lcom/ktyoung/chickenstock/view/adapter/NewsAdapter$ItemClickListener;)V", "VIEW_TYPE_ITEM", "", "VIEW_TYPE_LOADING", "getClickListener", "()Lcom/ktyoung/chickenstock/view/adapter/NewsAdapter$ItemClickListener;", "value", "Ljava/util/ArrayList;", "Lcom/ktyoung/chickenstock/api/model/NewsModel;", "items", "getItems", "()Ljava/util/ArrayList;", "setItems", "(Ljava/util/ArrayList;)V", "getItemCount", "getItemId", "", "position", "getItemViewType", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ItemClickListener", "LoadingHolder", "NewsHolder", "app_debug"})
public final class NewsAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    private final int VIEW_TYPE_ITEM = 0;
    private final int VIEW_TYPE_LOADING = 1;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.ktyoung.chickenstock.api.model.NewsModel> items;
    @org.jetbrains.annotations.NotNull()
    private final com.ktyoung.chickenstock.view.adapter.NewsAdapter.ItemClickListener clickListener = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.ktyoung.chickenstock.api.model.NewsModel> getItems() {
        return null;
    }
    
    public final void setItems(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.ktyoung.chickenstock.api.model.NewsModel> value) {
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public long getItemId(int position) {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ktyoung.chickenstock.view.adapter.NewsAdapter.ItemClickListener getClickListener() {
        return null;
    }
    
    public NewsAdapter(@org.jetbrains.annotations.NotNull()
    com.ktyoung.chickenstock.view.adapter.NewsAdapter.ItemClickListener clickListener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B(\u0012!\u0010\u0002\u001a\u001d\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003\u00a2\u0006\u0002\u0010\tJ\u000e\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004R,\u0010\u0002\u001a\u001d\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\r"}, d2 = {"Lcom/ktyoung/chickenstock/view/adapter/NewsAdapter$ItemClickListener;", "", "clickListener", "Lkotlin/Function1;", "Lcom/ktyoung/chickenstock/api/model/NewsModel;", "Lkotlin/ParameterName;", "name", "newsModel", "", "(Lkotlin/jvm/functions/Function1;)V", "getClickListener", "()Lkotlin/jvm/functions/Function1;", "onClick", "app_debug"})
    public static final class ItemClickListener {
        @org.jetbrains.annotations.NotNull()
        private final kotlin.jvm.functions.Function1<com.ktyoung.chickenstock.api.model.NewsModel, kotlin.Unit> clickListener = null;
        
        public final void onClick(@org.jetbrains.annotations.NotNull()
        com.ktyoung.chickenstock.api.model.NewsModel newsModel) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function1<com.ktyoung.chickenstock.api.model.NewsModel, kotlin.Unit> getClickListener() {
            return null;
        }
        
        public ItemClickListener(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super com.ktyoung.chickenstock.api.model.NewsModel, kotlin.Unit> clickListener) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u0011"}, d2 = {"Lcom/ktyoung/chickenstock/view/adapter/NewsAdapter$NewsHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/ktyoung/chickenstock/view/adapter/NewsAdapter;Landroid/view/View;)V", "binding", "Lcom/ktyoung/chickenstock/databinding/ItemNewsPreviewBinding;", "getBinding", "()Lcom/ktyoung/chickenstock/databinding/ItemNewsPreviewBinding;", "setBinding", "(Lcom/ktyoung/chickenstock/databinding/ItemNewsPreviewBinding;)V", "bind", "", "item", "Lcom/ktyoung/chickenstock/api/model/NewsModel;", "clickListener", "Lcom/ktyoung/chickenstock/view/adapter/NewsAdapter$ItemClickListener;", "app_debug"})
    public final class NewsHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.Nullable()
        private com.ktyoung.chickenstock.databinding.ItemNewsPreviewBinding binding;
        
        @org.jetbrains.annotations.Nullable()
        public final com.ktyoung.chickenstock.databinding.ItemNewsPreviewBinding getBinding() {
            return null;
        }
        
        public final void setBinding(@org.jetbrains.annotations.Nullable()
        com.ktyoung.chickenstock.databinding.ItemNewsPreviewBinding p0) {
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.ktyoung.chickenstock.api.model.NewsModel item, @org.jetbrains.annotations.NotNull()
        com.ktyoung.chickenstock.view.adapter.NewsAdapter.ItemClickListener clickListener) {
        }
        
        public NewsHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u000f"}, d2 = {"Lcom/ktyoung/chickenstock/view/adapter/NewsAdapter$LoadingHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/ktyoung/chickenstock/view/adapter/NewsAdapter;Landroid/view/View;)V", "binding", "Lcom/ktyoung/chickenstock/databinding/ItemLoadingBinding;", "getBinding", "()Lcom/ktyoung/chickenstock/databinding/ItemLoadingBinding;", "setBinding", "(Lcom/ktyoung/chickenstock/databinding/ItemLoadingBinding;)V", "bind", "", "item", "Lcom/ktyoung/chickenstock/api/model/NewsModel;", "app_debug"})
    public final class LoadingHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.Nullable()
        private com.ktyoung.chickenstock.databinding.ItemLoadingBinding binding;
        
        @org.jetbrains.annotations.Nullable()
        public final com.ktyoung.chickenstock.databinding.ItemLoadingBinding getBinding() {
            return null;
        }
        
        public final void setBinding(@org.jetbrains.annotations.Nullable()
        com.ktyoung.chickenstock.databinding.ItemLoadingBinding p0) {
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.ktyoung.chickenstock.api.model.NewsModel item) {
        }
        
        public LoadingHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
}