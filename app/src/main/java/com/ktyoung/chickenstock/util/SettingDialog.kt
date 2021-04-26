package com.ktyoung.chickenstock.util

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.ktyoung.chickenstock.R
import kotlinx.android.synthetic.main.dialog_setting.*
import kotlinx.android.synthetic.main.dialog_setting.view.*

class SettingDialog : DialogFragment(), View.OnClickListener {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.dialog_setting, container, false)
        view.apply {
            this.tv_question.text = question
            this.tv_yes.setOnClickListener {
                yesClick(true)
                dismiss()
            }
            this.tv_no.setOnClickListener {
                dismiss()
            }
        }
        return view
    }

    companion object {
        lateinit var yesClick: (Boolean) -> Unit
        lateinit var question: String
        fun getInstance(yesClick: (Boolean) -> Unit, question: String): SettingDialog {
            this.yesClick = yesClick
            this.question = question
            return SettingDialog()
        }
    }

    override fun onClick(p0: View?) {
        dismiss()
    }

}