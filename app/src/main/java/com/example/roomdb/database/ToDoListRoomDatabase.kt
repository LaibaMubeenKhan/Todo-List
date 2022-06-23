package com.example.roomdb.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase
import com.example.roomdb.interfaces.ToDoListDao
import com.example.roomdb.model.ToDoList
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@Database(entities = [ToDoList::class], version = 2)
abstract class ToDoListRoomDatabase: RoomDatabase() {
    abstract fun getNotesDao(): ToDoListDao
//    object DatabaseBuilder {
//        var migration_1_2 = object : Migration(1, 2) {
//            override fun migrate(database: SupportSQLiteDatabase) {
//                database.execSQL("Alter table ToDoList ADD Column isActive Integer not null default(1)")
//            }
//        }
//    }
}
