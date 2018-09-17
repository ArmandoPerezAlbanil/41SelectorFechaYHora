package com.example.armandoedge.a41selectorfechayhora

import android.app.Dialog
import android.app.PendingIntent.getActivity
import android.app.TimePickerDialog
import android.os.Bundle
import android.support.v4.app.DialogFragment
import android.widget.TimePicker
import java.util.Calendar
import android.text.format.DateFormat

class TimePickerFragment:DialogFragment(),TimePickerDialog.OnTimeSetListener {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        // Use the current time as the default values for the picker.
        val c = Calendar.getInstance()
        val hour = c.get(Calendar.HOUR_OF_DAY)
        val minute = c.get(Calendar.MINUTE)

        // Create a new instance of TimePickerDialog and return it.
        return TimePickerDialog(getActivity(), this, hour, minute,
                DateFormat.is24HourFormat(getActivity()))
    }
    override fun onTimeSet(view: TimePicker, hourOfDay: Int, minute: Int) {
        // Set the activity to the Main Activity.
        val activity = getActivity() as MainActivity?
        // Invoke Main Activity's processTimePickerResult() method.
        activity!!.processTimePickerResult(hourOfDay, minute)
    }
}



