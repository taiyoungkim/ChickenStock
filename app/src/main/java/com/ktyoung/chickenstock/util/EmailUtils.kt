package com.ktyoung.chickenstock.util

import android.content.Context
import android.content.Intent
import android.os.Build
import com.ktyoung.chickenstock.BuildConfig

class EmailUtils {
    fun sendEmailToAdmin(context: Context, title: String?, receivers: Array<String?>?) {
        val email = Intent(Intent.ACTION_SEND)
        email.putExtra(Intent.EXTRA_SUBJECT, title)
        email.putExtra(Intent.EXTRA_EMAIL, receivers)
        email.putExtra(Intent.EXTRA_TEXT, java.lang.String.format("App Version : %s\nAndroid(SDK) : %d(%s)\n내용 : ", BuildConfig.VERSION_NAME, Build.VERSION.SDK_INT, Build.VERSION.RELEASE))
        email.type = "message/rfc822"
        context.startActivity(email)
    }
}