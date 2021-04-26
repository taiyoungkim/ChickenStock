package com.ktyoung.chickenstock.viewmodel

import com.ktyoung.chickenstock.database.dao.KeywordDao
import com.ktyoung.chickenstock.database.model.KeywordModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class HomeRepository private constructor(private val keywordDao: KeywordDao){
    fun getAllKeywords() = keywordDao.getKeywords()

    var keywords = getAllKeywords()

    companion object{

        @Volatile
        private var instance: HomeRepository? = null

        fun newInstance(keywordDao: KeywordDao) =
            instance ?: synchronized(this) {
                instance ?: HomeRepository(keywordDao).also { instance = it }
            }
    }

//    fun initializeDB(context: Context) : KeywordDatabase {
//        return KeywordDatabase.getInstance(context)
//    }

//    fun getAllKeyword(context: Context) : List<KeywordModel> {
//        keywordDatabase = initializeDB(context)
//        GlobalScope.launch(Dispatchers.IO) {
//            keywords = keywordDatabase!!.keywordDao().getKeywords()
//        }
//        return keywords
//    }

    fun updateKeyword(keywordModel: KeywordModel) {
        GlobalScope.launch(Dispatchers.IO) {
            keywordDao.updateKeyword(keywordModel)
        }
    }

    fun keywordDelete(keywordModel: KeywordModel) {
        GlobalScope.launch(Dispatchers.IO) {
            keywordDao.deleteKeyword(keywordModel)
        }
    }

    fun keywordInsert(keywordModel: KeywordModel) {
        GlobalScope.launch(Dispatchers.IO) {
            keywordDao.keywordInsert(keywordModel)
        }
    }

    fun keywordAllDelete() {
        GlobalScope.launch(Dispatchers.IO) {
            keywordDao.deleteAll()
        }
    }
}