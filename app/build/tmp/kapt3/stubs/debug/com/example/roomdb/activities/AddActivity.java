package com.example.roomdb.activities;

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
import com.example.roomdb.viewModel.AddActivityVM;
import dagger.hilt.android.AndroidEntryPoint;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010-\u001a\u00020.H\u0002J\b\u0010/\u001a\u00020.H\u0002J\u0006\u00100\u001a\u00020.J\u0012\u00101\u001a\u00020.2\b\u00102\u001a\u0004\u0018\u000103H\u0016J\u0012\u00104\u001a\u00020.2\b\u00105\u001a\u0004\u0018\u000106H\u0014R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u0014X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0007\"\u0004\b\u001a\u0010\tR\u001e\u0010\u001b\u001a\u00020\u001c8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001e\u0010!\u001a\u00020\"8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001b\u0010\'\u001a\u00020(8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b)\u0010*\u00a8\u00067"}, d2 = {"Lcom/example/roomdb/activities/AddActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/view/View$OnClickListener;", "()V", "alarmHour", "", "getAlarmHour", "()I", "setAlarmHour", "(I)V", "alarmMinute", "", "getAlarmMinute", "()Ljava/lang/String;", "setAlarmMinute", "(Ljava/lang/String;)V", "alarmTime", "getAlarmTime", "setAlarmTime", "binding", "Lcom/example/roomdb/databinding/ActivityAddBinding;", "getBinding", "()Lcom/example/roomdb/databinding/ActivityAddBinding;", "setBinding", "(Lcom/example/roomdb/databinding/ActivityAddBinding;)V", "isAlarmSet", "setAlarmSet", "ringAlarm", "Lcom/example/roomdb/singleton/RingAlarm;", "getRingAlarm", "()Lcom/example/roomdb/singleton/RingAlarm;", "setRingAlarm", "(Lcom/example/roomdb/singleton/RingAlarm;)V", "singletonHelper", "Lcom/example/roomdb/singleton/SingletonHelper;", "getSingletonHelper", "()Lcom/example/roomdb/singleton/SingletonHelper;", "setSingletonHelper", "(Lcom/example/roomdb/singleton/SingletonHelper;)V", "viewModel", "Lcom/example/roomdb/viewModel/AddActivityVM;", "getViewModel", "()Lcom/example/roomdb/viewModel/AddActivityVM;", "viewModel$delegate", "Lkotlin/Lazy;", "addData", "", "getTime", "onCLicked", "onClick", "view", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class AddActivity extends androidx.appcompat.app.AppCompatActivity implements android.view.View.OnClickListener {
    public com.example.roomdb.databinding.ActivityAddBinding binding;
    private int isAlarmSet = 0;
    private int alarmHour = 0;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String alarmMinute;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String alarmTime;
    @javax.inject.Inject()
    public com.example.roomdb.singleton.SingletonHelper singletonHelper;
    @javax.inject.Inject()
    public com.example.roomdb.singleton.RingAlarm ringAlarm;
    private final kotlin.Lazy viewModel$delegate = null;
    
    public AddActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.roomdb.databinding.ActivityAddBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.example.roomdb.databinding.ActivityAddBinding p0) {
    }
    
    public final int isAlarmSet() {
        return 0;
    }
    
    public final void setAlarmSet(int p0) {
    }
    
    public final int getAlarmHour() {
        return 0;
    }
    
    public final void setAlarmHour(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAlarmMinute() {
        return null;
    }
    
    public final void setAlarmMinute(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAlarmTime() {
        return null;
    }
    
    public final void setAlarmTime(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
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
    
    private final com.example.roomdb.viewModel.AddActivityVM getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void getTime() {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View view) {
    }
    
    public final void onCLicked() {
    }
    
    private final void addData() {
    }
}