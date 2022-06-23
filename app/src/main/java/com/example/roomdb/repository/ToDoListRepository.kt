package com.example.roomdb.repository


import com.example.roomdb.database.ToDoListRoomDatabase
import com.example.roomdb.interfaces.ToDoListDao
import com.example.roomdb.model.ToDoList
import javax.inject.Inject

class ToDoListRepository @Inject constructor(val toDoListDao: ToDoListDao) {

    val allToDoList = toDoListDao.getList()

    suspend fun insert(toDoList: ToDoList) {
        toDoListDao.insert(toDoList)
    }

    suspend fun updateById(
        taskT: String,
        taskDesc: String,
        taskPriority: String,
        itemId: Long,
        taskHour: Int,
        taskMinute: Int,
        isAlarmSet: Int
    ) {
        toDoListDao.updateById(
            taskT,
            taskDesc,
            taskPriority,
            itemId,
            taskHour,
            taskMinute,
            isAlarmSet
        )
    }

    suspend fun delete(itemId: Long) {
        toDoListDao.deleteById(itemId)
    }

    suspend fun update(toDoList: ToDoList) {
        toDoListDao.update(toDoList)
    }

    suspend fun deleteAll() {
        toDoListDao.deleteAll()
    }
}