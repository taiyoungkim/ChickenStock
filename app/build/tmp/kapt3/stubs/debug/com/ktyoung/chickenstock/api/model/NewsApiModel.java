package com.ktyoung.chickenstock.api.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u001c\b\u0002\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\n\u0018\u00010\tj\n\u0012\u0004\u0012\u00020\n\u0018\u0001`\u000b\u00a2\u0006\u0002\u0010\fJ\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0005H\u00c6\u0003J\t\u0010 \u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010!\u001a\u0016\u0012\u0004\u0012\u00020\n\u0018\u00010\tj\n\u0012\u0004\u0012\u00020\n\u0018\u0001`\u000bH\u00c6\u0003JO\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\u001c\b\u0002\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\n\u0018\u00010\tj\n\u0012\u0004\u0012\u00020\n\u0018\u0001`\u000bH\u00c6\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&H\u00d6\u0003J\t\u0010\'\u001a\u00020\u0005H\u00d6\u0001J\t\u0010(\u001a\u00020)H\u00d6\u0001R\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R.\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\n\u0018\u00010\tj\n\u0012\u0004\u0012\u00020\n\u0018\u0001`\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010\u00a8\u0006*"}, d2 = {"Lcom/ktyoung/chickenstock/api/model/NewsApiModel;", "Lcom/ktyoung/chickenstock/api/BaseApi;", "lastBuildDate", "Ljava/util/Date;", "total", "", "start", "display", "items", "Ljava/util/ArrayList;", "Lcom/ktyoung/chickenstock/api/model/NewsModel;", "Lkotlin/collections/ArrayList;", "(Ljava/util/Date;IIILjava/util/ArrayList;)V", "getDisplay", "()I", "setDisplay", "(I)V", "getItems", "()Ljava/util/ArrayList;", "setItems", "(Ljava/util/ArrayList;)V", "getLastBuildDate", "()Ljava/util/Date;", "setLastBuildDate", "(Ljava/util/Date;)V", "getStart", "setStart", "getTotal", "setTotal", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "toString", "", "app_debug"})
public final class NewsApiModel extends com.ktyoung.chickenstock.api.BaseApi {
    @org.jetbrains.annotations.NotNull()
    private java.util.Date lastBuildDate;
    private int total;
    private int start;
    private int display;
    @org.jetbrains.annotations.Nullable()
    private java.util.ArrayList<com.ktyoung.chickenstock.api.model.NewsModel> items;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date getLastBuildDate() {
        return null;
    }
    
    public final void setLastBuildDate(@org.jetbrains.annotations.NotNull()
    java.util.Date p0) {
    }
    
    public final int getTotal() {
        return 0;
    }
    
    public final void setTotal(int p0) {
    }
    
    public final int getStart() {
        return 0;
    }
    
    public final void setStart(int p0) {
    }
    
    public final int getDisplay() {
        return 0;
    }
    
    public final void setDisplay(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<com.ktyoung.chickenstock.api.model.NewsModel> getItems() {
        return null;
    }
    
    public final void setItems(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.ktyoung.chickenstock.api.model.NewsModel> p0) {
    }
    
    public NewsApiModel(@org.jetbrains.annotations.NotNull()
    java.util.Date lastBuildDate, int total, int start, int display, @org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.ktyoung.chickenstock.api.model.NewsModel> items) {
        super(null, null, null, null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date component1() {
        return null;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int component3() {
        return 0;
    }
    
    public final int component4() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<com.ktyoung.chickenstock.api.model.NewsModel> component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ktyoung.chickenstock.api.model.NewsApiModel copy(@org.jetbrains.annotations.NotNull()
    java.util.Date lastBuildDate, int total, int start, int display, @org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.ktyoung.chickenstock.api.model.NewsModel> items) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}