package com.ktyoung.chickenstock.viewmodel

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.navigation.NavController
import com.ktyoung.chickenstock.database.KeywordDatabase
import com.ktyoung.chickenstock.database.model.KeywordModel
import com.ktyoung.chickenstock.util.BaseViewModel

class AddNewsViewModel : BaseViewModel() {
    private var _andKeyword = SearchNickLiveData<ArrayList<String>>()
    private var _orKeyword = SearchNickLiveData<ArrayList<String>>()
    private var _notKeyword = SearchNickLiveData<ArrayList<String>>()

    val repo = AddNewsRepository.newInstance(_andKeyword, _orKeyword, _notKeyword)

    var andKeyword: LiveData<ArrayList<String>> = _andKeyword
    var orKeyword: LiveData<ArrayList<String>> = _orKeyword
    var notKeyword: LiveData<ArrayList<String>> = _notKeyword

    private var andArr: ArrayList<String> = ArrayList()
    private var orArr: ArrayList<String> = ArrayList()
    private var notArr: ArrayList<String> = ArrayList()
    var id: Int = 0
    lateinit var navController: NavController

    var etAnd = MutableLiveData<String>("")
    var etOr = MutableLiveData<String>("")
    var etNot = MutableLiveData<String>("")
    var etTitle = MutableLiveData<String>("")

    var error = MutableLiveData<String>()

    fun getAndKeyword() {
        val keyword = etAnd.value.let { it.toString() }
        if (keyword.isNotEmpty()) {
            andArr.add(keyword)
            repo.getAndKeyword(andArr)
        }
    }

    fun getAndKeyword1(s: String) {
        if (s.isNotEmpty()) {
            andArr.add(s)
            repo.getAndKeyword(andArr)
        }
    }

    fun getOrKeyword() {
        val keyword = etOr.value.let { it.toString() }
        if (keyword.isNotEmpty()) {
            orArr.add(keyword)
            repo.getOrKeyword(orArr)
        }
    }

    fun getNotKeyword() {
        val keyword = etNot.value.let { it.toString() }
        if (keyword.isNotEmpty()) {
            notArr.add(keyword)
            repo.getNotKeyword(notArr)
        }
    }

    fun setTitle(s: String) {
        etTitle.value = s
    }

    fun onAddAndClick() {
        getAndKeyword()
    }

    fun onAddOrClick() {
        getOrKeyword()
    }

    fun onAddNotClick() {
        getNotKeyword()
    }

    fun onDelAndClick(s: String) {
        repo.deleteAndKeyword(s)
    }

    fun onDelOrClick(s: String) {
        repo.deleteOrKeyword(s)
    }

    fun onDelNotClick(s: String) {
        repo.deleteNotKeyword(s)
    }

    fun onSaveClick(context: Context) {
        val title = etTitle.value.let { it.toString() }

        if (title.isEmpty() || andArr.isEmpty()) {
            error.value = "키워드나 제목을 설정해주세요."
        } else {
            val dao = KeywordDatabase.getInstance(context).keywordDao()
            val repository = HomeRepository.newInstance(dao)
            var andSum = ""
            for (s in andArr) {
                andSum += " +$s"
            }
            var orSum = ""
            for (s in orArr) {
                orSum += " |$s"
            }
            var notSum = ""
            for (s in notArr) {
                notSum += " -$s"
            }

            if (id.equals(-1)) repository.keywordInsert(KeywordModel(0, title, andSum, orSum, notSum, 0))
            else repository.updateKeyword(KeywordModel(id, title, andSum, orSum, notSum, 0))

            navController.popBackStack()
        }
    }

    inner class SearchNickLiveData<T>() : MutableLiveData<T>() {
        override fun onActive() {
            super.onActive()

            getAndKeyword()
        }
    }
}