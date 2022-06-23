package com.example.roomdb.interfaces;

import com.example.roomdb.model.ToDoList;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/roomdb/interfaces/ItemClicked;", "", "clicked", "", "toDoList", "Lcom/example/roomdb/model/ToDoList;", "app_debug"})
public abstract interface ItemClicked {
    
    public abstract void clicked(@org.jetbrains.annotations.NotNull()
    com.example.roomdb.model.ToDoList toDoList);
}