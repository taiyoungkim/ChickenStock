package com.ktyoung.chickenstock.util

import android.annotation.SuppressLint
import android.app.DatePickerDialog.OnDateSetListener
import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import android.text.Html
import android.view.LayoutInflater
import android.view.View
import android.widget.NumberPicker
import androidx.fragment.app.DialogFragment
import androidx.lifecycle.ViewModelProvider
import com.ktyoung.chickenstock.R
import com.ktyoung.chickenstock.viewmodel.MultiAcntViewModel
import java.util.*


class YearPickerDialog() : DialogFragment() {
    private var listener: OnDateSetListener? = null

    fun setListener(listener: OnDateSetListener?) {
        this.listener = listener
    }

    @SuppressLint("ResourceAsColor")
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val builder: android.app.AlertDialog.Builder = android.app.AlertDialog.Builder(getActivity(), R.style.Theme_AppCompat_Light_Dialog_Alert)
        val inflater: LayoutInflater = requireActivity().getLayoutInflater()
        val cal: Calendar = Calendar.getInstance()
        val dialog: View = inflater.inflate(R.layout.year_picker_dialog, null)
        val monthPicker = dialog.findViewById(R.id.picker_month) as NumberPicker
        val yearPicker = dialog.findViewById(R.id.picker_year) as NumberPicker

        monthPicker.minValue = 1
        monthPicker.maxValue = 12
        monthPicker.value = cal.get(Calendar.MONTH) + 1

        val year: Int = cal.get(Calendar.YEAR)
        yearPicker.minValue = year - 20
        yearPicker.maxValue = year
        val viewModel = ViewModelProvider(this).get(MultiAcntViewModel::class.java)
        yearPicker.value = viewModel.selectedYear.value!!.toInt()

        builder.setView(dialog).setPositiveButton(Html.fromHtml(
                "<font color='#FF4081'>Ok</font>"),
                DialogInterface.OnClickListener { dialog, id ->
            listener!!.onDateSet(null, yearPicker.value, monthPicker.value, 0)
                }).setNegativeButton(Html.fromHtml(
                "<font color='#FF4081'>Cancel</font>"),
                DialogInterface.OnClickListener {
                    dialog, id ->
                    this@YearPickerDialog.getDialog()?.cancel()
                })
        return builder.create()
    }

    companion object {
        private const val MAX_YEAR = 2099
    }
}