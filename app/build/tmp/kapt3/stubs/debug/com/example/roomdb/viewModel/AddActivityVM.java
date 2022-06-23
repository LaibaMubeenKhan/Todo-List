package com.example.roomdb.viewModel;

import androidx.lifecycle.ViewModel;
import com.example.roomdb.model.ToDoList;
import com.example.roomdb.repository.ToDoListRepository;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.Dispatchers;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u00a8\u0006\f"}, d2 = {"Lcom/example/roomdb/viewModel/AddActivityVM;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/example/roomdb/repository/ToDoListRepository;", "(Lcom/example/roomdb/repository/ToDoListRepository;)V", "getRepository", "()Lcom/example/roomdb/repository/ToDoListRepository;", "setRepository", "insert", "", "toDoList", "Lcom/example/roomdb/model/ToDoList;", "app_debug"})
public final class AddActivityVM extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private com.example.roomdb.repository.ToDoListRepository repository;
    
    @javax.inject.Inject()
    public AddActivityVM(@org.jetbrains.annotations.NotNull()
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
    
    public final void insert(@org.jetbrains.annotations.NotNull()
    com.example.roomdb.model.ToDoList toDoList) {
    }
}