package com.example.roomdb.di

import android.app.Activity
import android.content.Context
import androidx.room.Room
import com.example.roomdb.database.ToDoListRoomDatabase
import com.example.roomdb.interfaces.ToDoListDao
import com.example.roomdb.repository.ToDoListRepository
import com.example.roomdb.singleton.RingAlarm
import com.example.roomdb.singleton.SingletonHelper
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

//@InstallIn(SingletonComponent::class)= It create its component for application level
//(FragmentComponent::class) = It create its component for fragment level
//(ActivityComponent::class) = It create its component for Activity level
@InstallIn(SingletonComponent::class)
//@Module:It provide a way to create objects of abstract class , interface
@Module
class DiModule {

    @Provides
    fun providesToDoListDao(toDoListRoomDatabase: ToDoListRoomDatabase):ToDoListDao =
        toDoListRoomDatabase.getNotesDao()



    @Provides
    @Singleton
    fun provideAppDatabase(@ApplicationContext appContext: Context): ToDoListRoomDatabase {
        return Room.databaseBuilder(
            appContext,
            ToDoListRoomDatabase::class.java,
            "toDoList"
        ).build()
    }

    @Provides
    fun provideRepo(toDoListDao: ToDoListDao): ToDoListRepository{
        return ToDoListRepository(toDoListDao)
    }

    @Provides
    @Singleton
    fun provideSingleonHelper(@ApplicationContext appContext: Context): SingletonHelper{
        return SingletonHelper(appContext)
    }

    @Provides
    @Singleton
    fun provideRingAlarm(@ApplicationContext appContext: Context): RingAlarm{
        return RingAlarm(appContext)
    }
}