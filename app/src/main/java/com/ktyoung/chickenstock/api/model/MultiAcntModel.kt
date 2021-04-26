package com.ktyoung.chickenstock.api.model

data class MultiAcntModel(
        var rcept_no: String,
        var bsns_year: String,
        var corp_code: String,
        var stock_code: String,
        var reprt_code: String,
        var account_nm: String,
        var fs_div: String,
        var fs_nm: String,
        var sj_div: String,
        var sj_nm: String,
        var thstrm_nm: String,
        var thstrm_dt: String,
        var thstrm_amount: String,
        var thstrm_amount2: String,
        var thstrm_add_amount: String,
        var frmtrm_nm: String,
        var frmtrm_dt: String,
        var frmtrm_amount: String,
        var frmtrm_add_amount: String,
        var bfefrmtrm_nm: String,
        var bfefrmtrm_dt: String,
        var bfefrmtrm_amount: String,
        var ord: Int
)
