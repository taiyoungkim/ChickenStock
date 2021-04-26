package com.ktyoung.chickenstock.api.model

data class MultiAcntApiModel(
        var status: String,
        var message: String,
        var list: ArrayList<MultiAcntModel>? = null
)
