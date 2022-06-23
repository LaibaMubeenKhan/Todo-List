package com.example.roomdb.di;

import android.app.Activity;
import android.content.Context;
import androidx.room.Room;
import com.example.roomdb.database.ToDoListRoomDatabase;
import com.example.roomdb.interfaces.ToDoListDao;
import com.example.roomdb.repository.ToDoListRepository;
import com.example.roomdb.singleton.RingAlarm;
import com.example.roomdb.singleton.SingletonHelper;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;
import javax.inject.Singleton;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0012\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0004H\u0007\u00a8\u0006\u0011"}, d2 = {"Lcom/example/roomdb/di/DiModule;", "", "()V", "provideAppDatabase", "Lcom/example/roomdb/database/ToDoListRoomDatabase;", "appContext", "Landroid/content/Context;", "provideRepo", "Lcom/example/roomdb/repository/ToDoListRepository;", "toDoListDao", "Lcom/example/roomdb/interfaces/ToDoListDao;", "provideRingAlarm", "Lcom/example/roomdb/singleton/RingAlarm;", "provideSingleonHelper", "Lcom/example/roomdb/singleton/SingletonHelper;", "providesToDoListDao", "toDoListRoomDatabase", "app_debug"})
@dagger.Module()
public final class DiModule {
    
    public DiModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.example.roomdb.interfaces.ToDoListDao providesToDoListDao(@org.jetbrains.annotations.NotNull()
    com.example.roomdb.database.ToDoListRoomDatabase toDoListRoomDatabase) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.example.roomdb.database.ToDoListRoomDatabase provideAppDatabase(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context appContext) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.example.roomdb.repository.ToDoListRepository provideRepo(@org.jetbrains.annotations.NotNull()
    com.example.roomdb.interfaces.ToDoListDao toDoListDao) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.example.roomdb.singleton.SingletonHelper provideSingleonHelper(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context appContext) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.example.roomdb.singleton.RingAlarm provideRingAlarm(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context appContext) {
        return null;
    }
}