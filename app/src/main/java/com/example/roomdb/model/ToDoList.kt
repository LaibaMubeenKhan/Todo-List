package com.example.roomdb.model

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Parcelize
@Entity(tableName = "ToDoList")
data class ToDoList(
    var taskTitle:String,
    var taskDescription:String,
    var priority:String,
    var taskHour:Int,
    var taskMinute:Int,
    var isAlarmSet:Int,
    @PrimaryKey(autoGenerate = true) val id: Long = 0
):Parcelable
