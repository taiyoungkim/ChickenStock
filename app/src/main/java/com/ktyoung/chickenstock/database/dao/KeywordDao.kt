package com.ktyoung.chickenstock.database.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.ktyoung.chickenstock.database.model.KeywordModel

@Dao
interface KeywordDao {

    @Query("SELECT * FROM keyword_table ORDER BY id ASC")
    fun getKeywords() : LiveData<List<KeywordModel>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun keywordInsert(keywordModel: KeywordModel)

    @Delete
    fun deleteKeyword (keywordModel: KeywordModel)

    @Query("DELETE FROM keyword_table")
    fun deleteAll ()

    @Update
    fun updateKeyword (keywordModel: KeywordModel)
}