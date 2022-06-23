package com.example.roomdb.activities;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.example.roomdb.R;
import com.example.roomdb.databinding.ActivityAddBinding;
import com.example.roomdb.helper.*;
import com.example.roomdb.model.ToDoList;
import com.example.roomdb.singleton.RingAlarm;
import com.example.roomdb.singleton.SingletonHelper;
import com.example.roomdb.viewModel.UpdateActivityVM;
import dagger.hilt.android.AndroidEntryPoint;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u00106\u001a\u000207H\u0002J\u0006\u00108\u001a\u000207J\u0012\u00109\u001a\u0002072\b\u0010:\u001a\u0004\u0018\u00010;H\u0017J\u0012\u0010<\u001a\u0002072\b\u0010=\u001a\u0004\u0018\u00010>H\u0014J\u0010\u0010?\u001a\u0002072\u0006\u0010!\u001a\u00020\u000bH\u0002J\u0010\u0010@\u001a\u0002072\u0006\u0010A\u001a\u00020\u0005H\u0002J\b\u0010B\u001a\u000207H\u0007J\b\u0010C\u001a\u000207H\u0002R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u0014X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0007\"\u0004\b\u001a\u0010\tR\u001a\u0010\u001b\u001a\u00020\u001cX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\r\"\u0004\b#\u0010\u000fR\u001e\u0010$\u001a\u00020%8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)R\u001e\u0010*\u001a\u00020+8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001b\u00100\u001a\u0002018FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b4\u00105\u001a\u0004\b2\u00103\u00a8\u0006D"}, d2 = {"Lcom/example/roomdb/activities/UpdateActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/view/View$OnClickListener;", "()V", "alarmHour", "", "getAlarmHour", "()I", "setAlarmHour", "(I)V", "alarmMinute", "", "getAlarmMinute", "()Ljava/lang/String;", "setAlarmMinute", "(Ljava/lang/String;)V", "alarmTime", "getAlarmTime", "setAlarmTime", "binding", "Lcom/example/roomdb/databinding/ActivityAddBinding;", "getBinding", "()Lcom/example/roomdb/databinding/ActivityAddBinding;", "setBinding", "(Lcom/example/roomdb/databinding/ActivityAddBinding;)V", "isAlarmset", "setAlarmset", "itemBundle", "Lcom/example/roomdb/model/ToDoList;", "getItemBundle", "()Lcom/example/roomdb/model/ToDoList;", "setItemBundle", "(Lcom/example/roomdb/model/ToDoList;)V", "priority", "getPriority", "setPriority", "ringAlarm", "Lcom/example/roomdb/singleton/RingAlarm;", "getRingAlarm", "()Lcom/example/roomdb/singleton/RingAlarm;", "setRingAlarm", "(Lcom/example/roomdb/singleton/RingAlarm;)V", "singletonHelper", "Lcom/example/roomdb/singleton/SingletonHelper;", "getSingletonHelper", "()Lcom/example/roomdb/singleton/SingletonHelper;", "setSingletonHelper", "(Lcom/example/roomdb/singleton/SingletonHelper;)V", "viewModel", "Lcom/example/roomdb/viewModel/UpdateActivityVM;", "getViewModel", "()Lcom/example/roomdb/viewModel/UpdateActivityVM;", "viewModel$delegate", "Lkotlin/Lazy;", "getTime", "", "onCLicked", "onClick", "view", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "priorityBtnChecked", "priorityConvertToString", "id", "setData", "updateData", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class UpdateActivity extends androidx.appcompat.app.AppCompatActivity implements android.view.View.OnClickListener {
    public com.example.roomdb.databinding.ActivityAddBinding binding;
    public java.lang.String priority;
    private int alarmHour = 0;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String alarmMinute = "";
    @org.jetbrains.annotations.Nullable()
    private java.lang.String alarmTime;
    private int isAlarmset = 0;
    @javax.inject.Inject()
    public com.example.roomdb.singleton.SingletonHelper singletonHelper;
    @javax.inject.Inject()
    public com.example.roomdb.singleton.RingAlarm ringAlarm;
    public com.example.roomdb.model.ToDoList itemBundle;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    
    public UpdateActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.roomdb.databinding.ActivityAddBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.example.roomdb.databinding.ActivityAddBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPriority() {
        return null;
    }
    
    public final void setPriority(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getAlarmHour() {
        return 0;
    }
    
    public final void setAlarmHour(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAlarmMinute() {
        return null;
    }
    
    public final void setAlarmMinute(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAlarmTime() {
        return null;
    }
    
    public final void setAlarmTime(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final int isAlarmset() {
        return 0;
    }
    
    public final void setAlarmset(int p0) {
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
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.roomdb.model.ToDoList getItemBundle() {
        return null;
    }
    
    public final void setItemBundle(@org.jetbrains.annotations.NotNull()
    com.example.roomdb.model.ToDoList p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.roomdb.viewModel.UpdateActivityVM getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void priorityBtnChecked(java.lang.String priority) {
    }
    
    private final void priorityConvertToString(int id) {
    }
    
    @android.annotation.SuppressLint(value = {"ResourceAsColor"})
    public final void setData() {
    }
    
    private final void updateData() {
    }
    
    public final void onCLicked() {
    }
    
    @android.annotation.SuppressLint(value = {"ResourceAsColor"})
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View view) {
    }
    
    private final void getTime() {
    }
}