package com.ktyoung.chickenstock.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006J\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\bJ\u000e\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\bJ\u000e\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\u0015"}, d2 = {"Lcom/ktyoung/chickenstock/viewmodel/HomeRepository;", "", "keywordDao", "Lcom/ktyoung/chickenstock/database/dao/KeywordDao;", "(Lcom/ktyoung/chickenstock/database/dao/KeywordDao;)V", "keywords", "Landroidx/lifecycle/LiveData;", "", "Lcom/ktyoung/chickenstock/database/model/KeywordModel;", "getKeywords", "()Landroidx/lifecycle/LiveData;", "setKeywords", "(Landroidx/lifecycle/LiveData;)V", "getAllKeywords", "keywordAllDelete", "", "keywordDelete", "keywordModel", "keywordInsert", "updateKeyword", "Companion", "app_debug"})
public final class HomeRepository {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.LiveData<java.util.List<com.ktyoung.chickenstock.database.model.KeywordModel>> keywords;
    private final com.ktyoung.chickenstock.database.dao.KeywordDao keywordDao = null;
    private static volatile com.ktyoung.chickenstock.viewmodel.HomeRepository instance;
    @org.jetbrains.annotations.NotNull()
    public static final com.ktyoung.chickenstock.viewmodel.HomeRepository.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.ktyoung.chickenstock.database.model.KeywordModel>> getAllKeywords() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.ktyoung.chickenstock.database.model.KeywordModel>> getKeywords() {
        return null;
    }
    
    public final void setKeywords(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.util.List<com.ktyoung.chickenstock.database.model.KeywordModel>> p0) {
    }
    
    public final void updateKeyword(@org.jetbrains.annotations.NotNull()
    com.ktyoung.chickenstock.database.model.KeywordModel keywordModel) {
    }
    
    public final void keywordDelete(@org.jetbrains.annotations.NotNull()
    com.ktyoung.chickenstock.database.model.KeywordModel keywordModel) {
    }
    
    public final void keywordInsert(@org.jetbrains.annotations.NotNull()
    com.ktyoung.chickenstock.database.model.KeywordModel keywordModel) {
    }
    
    public final void keywordAllDelete() {
    }
    
    private HomeRepository(com.ktyoung.chickenstock.database.dao.KeywordDao keywordDao) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/ktyoung/chickenstock/viewmodel/HomeRepository$Companion;", "", "()V", "instance", "Lcom/ktyoung/chickenstock/viewmodel/HomeRepository;", "newInstance", "keywordDao", "Lcom/ktyoung/chickenstock/database/dao/KeywordDao;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.ktyoung.chickenstock.viewmodel.HomeRepository newInstance(@org.jetbrains.annotations.NotNull()
        com.ktyoung.chickenstock.database.dao.KeywordDao keywordDao) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}