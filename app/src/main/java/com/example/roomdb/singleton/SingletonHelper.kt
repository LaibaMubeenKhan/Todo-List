package com.example.roomdb.singleton

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast

class SingletonHelper(val context: Context) {


    fun showToastLong(context: Context, message: String) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show()
    }

    fun startNextActivity(nextActivity: Class<*>) {
        val intent = Intent(context, nextActivity)
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        context.applicationContext.startActivity(intent)
    }

    fun isTimeAMOrPM(alarmHour: Int): String {
        return if (alarmHour >= 12) "PM" else "AM"
    }

    fun changeMinuteFormat(mint: Int): String {
        return if (mint > 9) "${mint}" else "0${mint}"
    }

    fun changeHourFormat(hour: Int): Int {
        var changeHour = hour
        if (hour > 12) {
            (hour - 12).also { changeHour = it }
        }
        return changeHour
    }


}


