package com.example.armandoedge.a41selectorfechayhora

import android.app.DatePickerDialog
import android.app.Dialog
import android.app.PendingIntent.getActivity
import android.os.Bundle
import android.support.v4.app.DialogFragment
import android.widget.DatePicker
import  java.util.Calendar

class DatePickerFragment : DialogFragment(),DatePickerDialog.OnDateSetListener {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        // Use the current date as the default date in the picker.
        val c = Calendar.getInstance()
        val year = c.get(Calendar.YEAR)
        val month = c.get(Calendar.MONTH)
        val day = c.get(Calendar.DAY_OF_MONTH)

        // Create a new instance of DatePickerDialog and return it.
        return DatePickerDialog(getActivity()!!, this, year, month, day)
    }

    override fun onDateSet(view: DatePicker, year: Int, month: Int, day: Int) {
        // Convert the date elements to strings.
        // Set the activity to the Main Activity.
        val activity = getActivity() as MainActivity?
        // Invoke Main Activity's processDatePickerResult() method.
        activity!!.processDatePickerResult(year, month, day)
    }
}
