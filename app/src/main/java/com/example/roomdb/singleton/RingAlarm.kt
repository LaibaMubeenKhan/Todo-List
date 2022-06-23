package com.example.roomdb.singleton

import android.app.*
import android.content.Context
import android.content.Intent
import android.os.Build
import android.os.SystemClock
import android.provider.Settings
import android.util.Log
import androidx.core.content.ContextCompat.isDeviceProtectedStorage
import androidx.core.content.ContextCompat.startActivity
import com.example.roomdb.helper.Action
import com.example.roomdb.helper.Constants
import com.example.roomdb.helper.Receiver
import com.example.roomdb.model.ToDoList
import java.sql.Time
import java.util.*

class RingAlarm(val context: Context) {

    private val alarmManager = context.getSystemService(Context.ALARM_SERVICE) as AlarmManager
    private val calendar: Calendar = Calendar.getInstance()
    fun setAlarm(toDoList: ToDoList, actionn: Action) {
        //it set user time on calender
        calendar.apply {
            set(Calendar.HOUR_OF_DAY, toDoList.taskHour)
            set(Calendar.MINUTE, toDoList.taskMinute)
            set(Calendar.SECOND, 0)
        }
        //it checks if it is earlier hour than it addd 1 day and set it for next day
        if (calendar.before(Calendar.getInstance())) {
            calendar.add(Calendar.DATE, 1);
        }
        val intent = Intent(context, Receiver::class.java)
        intent.apply {
            putExtra(Constants.KEY_TITLE, toDoList.taskTitle)
            putExtra(Constants.KEY_DESC, toDoList.taskDescription)
            action = Constants.ACTION_ALARM_MANAGER
        }
        val pendingIntent =
            PendingIntent.getBroadcast(
                context,
                toDoList.id.toInt(),
                intent,
                PendingIntent.FLAG_UPDATE_CURRENT
            )
        when (actionn) {
            Action.ADD -> addAlarm(pendingIntent)
            Action.DELETE -> cancelAlarm(pendingIntent)
            Action.UPDATE -> updateAlarm(pendingIntent, toDoList)
        }

    }

    private fun addAlarm(pendingIntent: PendingIntent) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            alarmManager?.setExactAndAllowWhileIdle(
                AlarmManager.RTC_WAKEUP,
                calendar.timeInMillis,
                pendingIntent
            )
        }
    }

    private fun cancelAlarm(pendingIntent: PendingIntent) {
        alarmManager.cancel(pendingIntent)
    }

    private fun updateAlarm(pendingIntent: PendingIntent, toDoList: ToDoList) {
        alarmManager.cancel(pendingIntent)
        setAlarm(toDoList, Action.ADD)
    }

}
