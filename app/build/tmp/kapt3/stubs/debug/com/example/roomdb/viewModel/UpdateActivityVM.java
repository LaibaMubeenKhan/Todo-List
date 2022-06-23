package com.example.roomdb.viewModel;

import androidx.lifecycle.ViewModel;
import com.example.roomdb.repository.ToDoListRepository;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.Dispatchers;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ>\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u00a8\u0006\u0015"}, d2 = {"Lcom/example/roomdb/viewModel/UpdateActivityVM;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/example/roomdb/repository/ToDoListRepository;", "(Lcom/example/roomdb/repository/ToDoListRepository;)V", "getRepository", "()Lcom/example/roomdb/repository/ToDoListRepository;", "setRepository", "deleteById", "", "itemId", "", "updateById", "taskT", "", "taskDesc", "taskPriority", "taskHour", "", "taskMinute", "isAlarmSet", "app_debug"})
public final class UpdateActivityVM extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private com.example.roomdb.repository.ToDoListRepository repository;
    
    @javax.inject.Inject()
    public UpdateActivityVM(@org.jetbrains.annotations.NotNull()
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
    
    public final void updateById(@org.jetbrains.annotations.NotNull()
    java.lang.String taskT, @org.jetbrains.annotations.NotNull()
    java.lang.String taskDesc, @org.jetbrains.annotations.NotNull()
    java.lang.String taskPriority, long itemId, int taskHour, int taskMinute, int isAlarmSet) {
    }
    
    public final void deleteById(long itemId) {
    }
}