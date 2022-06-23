package com.example.roomdb.database;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.example.roomdb.interfaces.ToDoListDao;
import com.example.roomdb.model.ToDoList;
import dagger.hilt.android.AndroidEntryPoint;
import dagger.hilt.android.HiltAndroidApp;
import javax.inject.Inject;

@androidx.room.Database(entities = {com.example.roomdb.model.ToDoList.class}, version = 2)
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0005"}, d2 = {"Lcom/example/roomdb/database/ToDoListRoomDatabase;", "Landroidx/room/RoomDatabase;", "()V", "getNotesDao", "Lcom/example/roomdb/interfaces/ToDoListDao;", "app_debug"})
public abstract class ToDoListRoomDatabase extends androidx.room.RoomDatabase {
    
    public ToDoListRoomDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.roomdb.interfaces.ToDoListDao getNotesDao();
}