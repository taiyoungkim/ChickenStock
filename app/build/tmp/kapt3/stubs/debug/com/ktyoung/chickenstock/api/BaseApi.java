package com.ktyoung.chickenstock.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0016\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b\u00a8\u0006\u001d"}, d2 = {"Lcom/ktyoung/chickenstock/api/BaseApi;", "", "message", "", "errorModel", "Lcom/ktyoung/chickenstock/api/model/ErrorModel;", "total_count", "", "incomplete_results", "", "(Ljava/lang/String;Lcom/ktyoung/chickenstock/api/model/ErrorModel;Ljava/lang/Integer;Ljava/lang/Boolean;)V", "getErrorModel", "()Lcom/ktyoung/chickenstock/api/model/ErrorModel;", "setErrorModel", "(Lcom/ktyoung/chickenstock/api/model/ErrorModel;)V", "getIncomplete_results", "()Ljava/lang/Boolean;", "setIncomplete_results", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "getTotal_count", "()Ljava/lang/Integer;", "setTotal_count", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "app_debug"})
public class BaseApi {
    @org.jetbrains.annotations.Nullable()
    private java.lang.String message;
    @org.jetbrains.annotations.Nullable()
    private com.ktyoung.chickenstock.api.model.ErrorModel errorModel;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer total_count;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean incomplete_results;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMessage() {
        return null;
    }
    
    public final void setMessage(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.ktyoung.chickenstock.api.model.ErrorModel getErrorModel() {
        return null;
    }
    
    public final void setErrorModel(@org.jetbrains.annotations.Nullable()
    com.ktyoung.chickenstock.api.model.ErrorModel p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getTotal_count() {
        return null;
    }
    
    public final void setTotal_count(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getIncomplete_results() {
        return null;
    }
    
    public final void setIncomplete_results(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    public BaseApi(@org.jetbrains.annotations.Nullable()
    java.lang.String message, @org.jetbrains.annotations.Nullable()
    com.ktyoung.chickenstock.api.model.ErrorModel errorModel, @org.jetbrains.annotations.Nullable()
    java.lang.Integer total_count, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean incomplete_results) {
        super();
    }
    
    public BaseApi() {
        super();
    }
}