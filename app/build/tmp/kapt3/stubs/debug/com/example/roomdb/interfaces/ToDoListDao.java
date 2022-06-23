package com.example.roomdb.interfaces;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.room.*;
import com.example.roomdb.model.ToDoList;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u0019\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\r0\fH\'J\u0019\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\nH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u0019\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\nH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010JI\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001c"}, d2 = {"Lcom/example/roomdb/interfaces/ToDoListDao;", "", "deleteAll", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteById", "itemId", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchItemData", "Lcom/example/roomdb/model/ToDoList;", "getList", "Landroidx/lifecycle/LiveData;", "", "insert", "toDoList", "(Lcom/example/roomdb/model/ToDoList;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "update", "updateById", "taskT", "", "taskDesc", "taskPriority", "taskHour", "", "taskMinute", "isAlarmSet", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JIIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface ToDoListDao {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.IGNORE)
    public abstract java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    com.example.roomdb.model.ToDoList toDoList, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM ToDoList ORDER BY id ASC")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.example.roomdb.model.ToDoList>> getList();
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "UPDATE ToDoList SET taskTitle=:taskT , taskDescription=:taskDesc, priority=:taskPriority , taskHour=:taskHour , taskMinute=:taskMinute , isAlarmSet=:isAlarmSet  WHERE id = :itemId")
    public abstract java.lang.Object updateById(@org.jetbrains.annotations.NotNull()
    java.lang.String taskT, @org.jetbrains.annotations.NotNull()
    java.lang.String taskDesc, @org.jetbrains.annotations.NotNull()
    java.lang.String taskPriority, long itemId, int taskHour, int taskMinute, int isAlarmSet, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Update()
    public abstract java.lang.Object update(@org.jetbrains.annotations.NotNull()
    com.example.roomdb.model.ToDoList toDoList, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "DELETE FROM ToDoList WHERE id = :itemId")
    public abstract java.lang.Object deleteById(long itemId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "DELETE FROM ToDoList")
    public abstract java.lang.Object deleteAll(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "Select * From ToDoList WHERE id = :itemId")
    public abstract java.lang.Object fetchItemData(long itemId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.roomdb.model.ToDoList> continuation);
}