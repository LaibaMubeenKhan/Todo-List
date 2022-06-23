package com.example.roomdb.helper

import android.annotation.TargetApi
import android.app.*
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.media.RingtoneManager
import android.os.Build
import android.util.Log
import android.view.Gravity
import android.view.LayoutInflater
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.RequiresApi
import com.example.roomdb.R
import com.example.roomdb.activities.MainActivity


class Receiver : BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {
        if (intent!!.action.equals(Constants.ACTION_ALARM_MANAGER)) {
            show_Notification(context, intent)
        }

        if (intent!!.action.equals(Constants.ACTION_RESTART)) {
            show_Notification(context, intent)

        }
    }

    @TargetApi(Build.VERSION_CODES.O)
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    fun show_Notification(context: Context?, intent: Intent?) {
        var message = intent?.extras
        val intent = Intent(
            context,
            MainActivity::class.java
        )
        intent.apply {
            setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            setFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY)
        }
        val CHANNEL_ID = Constants.CHANNEL
        val notificationChannel =
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                NotificationChannel(CHANNEL_ID, "name", NotificationManager.IMPORTANCE_HIGH)
            } else {
                TODO("VERSION.SDK_INT < O")
            }
        val pendingIntent = PendingIntent.getActivity(
            context,
            1,
            intent,
            0
        )
        val builder = Notification.Builder(
            context,
            CHANNEL_ID
        )
            .setContentTitle(message?.getString(Constants.KEY_TITLE))
            .setContentText(message?.getString(Constants.KEY_DESC))
            .setContentIntent(pendingIntent)
//            .addAction(android.R.drawable.sym_action_chat, "Dismiss", pendingIntent)
            .setChannelId(CHANNEL_ID)
            .setVibrate(longArrayOf(1000, 1000))
            .setSmallIcon(R.drawable.ic_baseline_alarm_24)
            .setSound(RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION))
            .build()

        val notificationManager =
            context?.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager?
        notificationManager!!.createNotificationChannel(notificationChannel)
        notificationManager!!.notify((System.currentTimeMillis().toInt()), builder)

    }
}