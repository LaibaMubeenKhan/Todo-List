package com.example.roomdb.interfaces

import com.example.roomdb.model.ToDoList

interface ItemClicked {
    fun clicked(toDoList: ToDoList)
}