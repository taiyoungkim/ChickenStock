package com.ktyoung.chickenstock.api

import com.ktyoung.chickenstock.api.model.ErrorModel

open class BaseApi (
    var message: String? = null,
    var errorModel: ErrorModel? = null,
    var total_count: Int? = null,
    var incomplete_results: Boolean? = null
)