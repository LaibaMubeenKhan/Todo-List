package com.example.roomdb.singleton;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\bJ\u000e\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\bJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u000bJ\u0012\u0010\u0012\u001a\u00020\u00102\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0014R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0015"}, d2 = {"Lcom/example/roomdb/singleton/SingletonHelper;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "changeHourFormat", "", "hour", "changeMinuteFormat", "", "mint", "isTimeAMOrPM", "alarmHour", "showToastLong", "", "message", "startNextActivity", "nextActivity", "Ljava/lang/Class;", "app_debug"})
public final class SingletonHelper {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    
    public SingletonHelper(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public final void showToastLong(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    public final void startNextActivity(@org.jetbrains.annotations.NotNull()
    java.lang.Class<?> nextActivity) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String isTimeAMOrPM(int alarmHour) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String changeMinuteFormat(int mint) {
        return null;
    }
    
    public final int changeHourFormat(int hour) {
        return 0;
    }
}