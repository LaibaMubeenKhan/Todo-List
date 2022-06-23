package com.example.roomdb.repository;

import com.example.roomdb.database.ToDoListRoomDatabase;
import com.example.roomdb.interfaces.ToDoListDao;
import com.example.roomdb.model.ToDoList;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0011\u0010\u0012\u001a\u00020\u000eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u0019\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J\u0019\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016JI\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010!R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\""}, d2 = {"Lcom/example/roomdb/repository/ToDoListRepository;", "", "toDoListDao", "Lcom/example/roomdb/interfaces/ToDoListDao;", "(Lcom/example/roomdb/interfaces/ToDoListDao;)V", "allToDoList", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/roomdb/model/ToDoList;", "getAllToDoList", "()Landroidx/lifecycle/LiveData;", "getToDoListDao", "()Lcom/example/roomdb/interfaces/ToDoListDao;", "delete", "", "itemId", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAll", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insert", "toDoList", "(Lcom/example/roomdb/model/ToDoList;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "update", "updateById", "taskT", "", "taskDesc", "taskPriority", "taskHour", "", "taskMinute", "isAlarmSet", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JIIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class ToDoListRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.example.roomdb.interfaces.ToDoListDao toDoListDao = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.example.roomdb.model.ToDoList>> allToDoList = null;
    
    @javax.inject.Inject()
    public ToDoListRepository(@org.jetbrains.annotations.NotNull()
    com.example.roomdb.interfaces.ToDoListDao toDoListDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.roomdb.interfaces.ToDoListDao getToDoListDao() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.roomdb.model.ToDoList>> getAllToDoList() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    com.example.roomdb.model.ToDoList toDoList, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateById(@org.jetbrains.annotations.NotNull()
    java.lang.String taskT, @org.jetbrains.annotations.NotNull()
    java.lang.String taskDesc, @org.jetbrains.annotations.NotNull()
    java.lang.String taskPriority, long itemId, int taskHour, int taskMinute, int isAlarmSet, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object delete(long itemId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object update(@org.jetbrains.annotations.NotNull()
    com.example.roomdb.model.ToDoList toDoList, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteAll(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}