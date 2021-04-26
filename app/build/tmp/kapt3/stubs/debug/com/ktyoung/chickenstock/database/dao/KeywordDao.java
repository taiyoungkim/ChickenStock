package com.ktyoung.chickenstock.database.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\t0\bH\'J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\f"}, d2 = {"Lcom/ktyoung/chickenstock/database/dao/KeywordDao;", "", "deleteAll", "", "deleteKeyword", "keywordModel", "Lcom/ktyoung/chickenstock/database/model/KeywordModel;", "getKeywords", "Landroidx/lifecycle/LiveData;", "", "keywordInsert", "updateKeyword", "app_debug"})
public abstract interface KeywordDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM keyword_table ORDER BY id ASC")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.ktyoung.chickenstock.database.model.KeywordModel>> getKeywords();
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void keywordInsert(@org.jetbrains.annotations.NotNull()
    com.ktyoung.chickenstock.database.model.KeywordModel keywordModel);
    
    @androidx.room.Delete()
    public abstract void deleteKeyword(@org.jetbrains.annotations.NotNull()
    com.ktyoung.chickenstock.database.model.KeywordModel keywordModel);
    
    @androidx.room.Query(value = "DELETE FROM keyword_table")
    public abstract void deleteAll();
    
    @androidx.room.Update()
    public abstract void updateKeyword(@org.jetbrains.annotations.NotNull()
    com.ktyoung.chickenstock.database.model.KeywordModel keywordModel);
}