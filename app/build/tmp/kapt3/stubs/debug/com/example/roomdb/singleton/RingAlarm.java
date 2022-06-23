package com.example.roomdb.singleton;

import android.app.*;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.Log;
import com.example.roomdb.helper.Action;
import com.example.roomdb.helper.Constants;
import com.example.roomdb.helper.Receiver;
import com.example.roomdb.model.ToDoList;
import java.sql.Time;
import java.util.*;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0016\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u0018\u0010\u0015\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0016"}, d2 = {"Lcom/example/roomdb/singleton/RingAlarm;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "alarmManager", "Landroid/app/AlarmManager;", "calendar", "Ljava/util/Calendar;", "getContext", "()Landroid/content/Context;", "addAlarm", "", "pendingIntent", "Landroid/app/PendingIntent;", "cancelAlarm", "setAlarm", "toDoList", "Lcom/example/roomdb/model/ToDoList;", "actionn", "Lcom/example/roomdb/helper/Action;", "updateAlarm", "app_debug"})
public final class RingAlarm {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    private final android.app.AlarmManager alarmManager = null;
    private final java.util.Calendar calendar = null;
    
    public RingAlarm(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public final void setAlarm(@org.jetbrains.annotations.NotNull()
    com.example.roomdb.model.ToDoList toDoList, @org.jetbrains.annotations.NotNull()
    com.example.roomdb.helper.Action actionn) {
    }
    
    private final void addAlarm(android.app.PendingIntent pendingIntent) {
    }
    
    private final void cancelAlarm(android.app.PendingIntent pendingIntent) {
    }
    
    private final void updateAlarm(android.app.PendingIntent pendingIntent, com.example.roomdb.model.ToDoList toDoList) {
    }
}