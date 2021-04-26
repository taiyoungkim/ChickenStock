package com.ktyoung.chickenstock.api.model

import com.ktyoung.chickenstock.api.BaseApi
import java.util.*
import kotlin.collections.ArrayList

data class NewsApiModel(
    var lastBuildDate: Date,
    var total: Int,
    var start: Int,
    var display: Int,
    var items: ArrayList<NewsModel>? = null
): BaseApi()
