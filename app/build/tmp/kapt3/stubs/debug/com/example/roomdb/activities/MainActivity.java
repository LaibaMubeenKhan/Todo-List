package com.example.roomdb.activities;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import com.example.roomdb.databinding.ActivityMainBinding;
import com.example.roomdb.helper.Constants;
import com.example.roomdb.interfaces.ItemClicked;
import com.example.roomdb.model.ToDoList;
import com.example.roomdb.singleton.RingAlarm;
import com.example.roomdb.singleton.SingletonHelper;
import com.example.roomdb.viewModel.MainActivityVM;
import dagger.hilt.android.AndroidEntryPoint;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u001dH\u0016J\u0012\u0010!\u001a\u00020\u001d2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0014R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0016\u001a\u00020\u00178FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019\u00a8\u0006$"}, d2 = {"Lcom/example/roomdb/activities/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/example/roomdb/interfaces/ItemClicked;", "()V", "binding", "Lcom/example/roomdb/databinding/ActivityMainBinding;", "getBinding", "()Lcom/example/roomdb/databinding/ActivityMainBinding;", "setBinding", "(Lcom/example/roomdb/databinding/ActivityMainBinding;)V", "ringAlarm", "Lcom/example/roomdb/singleton/RingAlarm;", "getRingAlarm", "()Lcom/example/roomdb/singleton/RingAlarm;", "setRingAlarm", "(Lcom/example/roomdb/singleton/RingAlarm;)V", "singletonHelper", "Lcom/example/roomdb/singleton/SingletonHelper;", "getSingletonHelper", "()Lcom/example/roomdb/singleton/SingletonHelper;", "setSingletonHelper", "(Lcom/example/roomdb/singleton/SingletonHelper;)V", "viewModel", "Lcom/example/roomdb/viewModel/MainActivityVM;", "getViewModel", "()Lcom/example/roomdb/viewModel/MainActivityVM;", "viewModel$delegate", "Lkotlin/Lazy;", "clicked", "", "toDoList", "Lcom/example/roomdb/model/ToDoList;", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity implements com.example.roomdb.interfaces.ItemClicked {
    public com.example.roomdb.databinding.ActivityMainBinding binding;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    @javax.inject.Inject()
    public com.example.roomdb.singleton.SingletonHelper singletonHelper;
    @javax.inject.Inject()
    public com.example.roomdb.singleton.RingAlarm ringAlarm;
    
    public MainActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.roomdb.databinding.ActivityMainBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.example.roomdb.databinding.ActivityMainBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.roomdb.viewModel.MainActivityVM getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.roomdb.singleton.SingletonHelper getSingletonHelper() {
        return null;
    }
    
    public final void setSingletonHelper(@org.jetbrains.annotations.NotNull()
    com.example.roomdb.singleton.SingletonHelper p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.roomdb.singleton.RingAlarm getRingAlarm() {
        return null;
    }
    
    public final void setRingAlarm(@org.jetbrains.annotations.NotNull()
    com.example.roomdb.singleton.RingAlarm p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void clicked(@org.jetbrains.annotations.NotNull()
    com.example.roomdb.model.ToDoList toDoList) {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
}