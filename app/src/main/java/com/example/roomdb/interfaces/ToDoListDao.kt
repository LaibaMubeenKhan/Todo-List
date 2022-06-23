package com.example.roomdb.interfaces

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.room.*
import com.example.roomdb.model.ToDoList


@Dao
interface ToDoListDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(toDoList: ToDoList)

    @Query("SELECT * FROM ToDoList ORDER BY id ASC")
    fun getList(): LiveData<List<ToDoList>>

    @Query("UPDATE ToDoList SET taskTitle=:taskT , taskDescription=:taskDesc, priority=:taskPriority , taskHour=:taskHour , taskMinute=:taskMinute , isAlarmSet=:isAlarmSet  WHERE id = :itemId")
    suspend   fun updateById(taskT:String,taskDesc:String,taskPriority:String,itemId:Long,taskHour:Int,taskMinute:Int,isAlarmSet: Int)

    @Update
    suspend fun update(toDoList: ToDoList)

    @Query("DELETE FROM ToDoList WHERE id = :itemId")
    suspend   fun deleteById(itemId: Long)

    @Query("DELETE FROM ToDoList")
    suspend fun deleteAll()

    @Query("Select * From ToDoList WHERE id = :itemId")
    suspend fun fetchItemData(itemId: Long) :ToDoList



}