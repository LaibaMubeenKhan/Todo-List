package com.example.roomdb.viewModel;

import android.app.Application;
import android.util.Log;
import androidx.lifecycle.*;
import com.example.roomdb.database.ToDoListRoomDatabase;
import com.example.roomdb.model.ToDoList;
import com.example.roomdb.repository.ToDoListRepository;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.Dispatchers;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u000e\u001a\u00020\u000fR\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00068F\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u0004\u00a8\u0006\u0010"}, d2 = {"Lcom/example/roomdb/viewModel/MainActivityVM;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/example/roomdb/repository/ToDoListRepository;", "(Lcom/example/roomdb/repository/ToDoListRepository;)V", "getToDoList", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/roomdb/model/ToDoList;", "getGetToDoList", "()Landroidx/lifecycle/LiveData;", "getRepository", "()Lcom/example/roomdb/repository/ToDoListRepository;", "setRepository", "deleteAll", "", "app_debug"})
public final class MainActivityVM extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private com.example.roomdb.repository.ToDoListRepository repository;
    
    @javax.inject.Inject()
    public MainActivityVM(@org.jetbrains.annotations.NotNull()
    com.example.roomdb.repository.ToDoListRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.roomdb.repository.ToDoListRepository getRepository() {
        return null;
    }
    
    public final void setRepository(@org.jetbrains.annotations.NotNull()
    com.example.roomdb.repository.ToDoListRepository p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.roomdb.model.ToDoList>> getGetToDoList() {
        return null;
    }
    
    public final void deleteAll() {
    }
}