package com.example.roomdb.model;

import android.os.Parcelable;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import kotlinx.android.parcel.Parcelize;

@androidx.room.Entity(tableName = "ToDoList")
@kotlinx.android.parcel.Parcelize()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010 \u001a\u00020\u0003H\u00c6\u0003J\t\u0010!\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0007H\u00c6\u0003J\t\u0010#\u001a\u00020\u0007H\u00c6\u0003J\t\u0010$\u001a\u00020\u000bH\u00c6\u0003JO\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000bH\u00c6\u0001J\t\u0010&\u001a\u00020\u0007H\u00d6\u0001J\u0013\u0010\'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*H\u00d6\u0003J\t\u0010+\u001a\u00020\u0007H\u00d6\u0001J\t\u0010,\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u0007H\u00d6\u0001R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\t\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000f\"\u0004\b\u0019\u0010\u0011R\u001a\u0010\b\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u000f\"\u0004\b\u001b\u0010\u0011R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0013\"\u0004\b\u001d\u0010\u0015\u00a8\u00062"}, d2 = {"Lcom/example/roomdb/model/ToDoList;", "Landroid/os/Parcelable;", "taskTitle", "", "taskDescription", "priority", "taskHour", "", "taskMinute", "isAlarmSet", "id", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIJ)V", "getId", "()J", "()I", "setAlarmSet", "(I)V", "getPriority", "()Ljava/lang/String;", "setPriority", "(Ljava/lang/String;)V", "getTaskDescription", "setTaskDescription", "getTaskHour", "setTaskHour", "getTaskMinute", "setTaskMinute", "getTaskTitle", "setTaskTitle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
public final class ToDoList implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String taskTitle;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String taskDescription;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String priority;
    private int taskHour;
    private int taskMinute;
    private int isAlarmSet;
    @androidx.room.PrimaryKey(autoGenerate = true)
    private final long id = 0L;
    public static final android.os.Parcelable.Creator<com.example.roomdb.model.ToDoList> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.roomdb.model.ToDoList copy(@org.jetbrains.annotations.NotNull()
    java.lang.String taskTitle, @org.jetbrains.annotations.NotNull()
    java.lang.String taskDescription, @org.jetbrains.annotations.NotNull()
    java.lang.String priority, int taskHour, int taskMinute, int isAlarmSet, long id) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public ToDoList(@org.jetbrains.annotations.NotNull()
    java.lang.String taskTitle, @org.jetbrains.annotations.NotNull()
    java.lang.String taskDescription, @org.jetbrains.annotations.NotNull()
    java.lang.String priority, int taskHour, int taskMinute, int isAlarmSet, long id) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTaskTitle() {
        return null;
    }
    
    public final void setTaskTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTaskDescription() {
        return null;
    }
    
    public final void setTaskDescription(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPriority() {
        return null;
    }
    
    public final void setPriority(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int getTaskHour() {
        return 0;
    }
    
    public final void setTaskHour(int p0) {
    }
    
    public final int component5() {
        return 0;
    }
    
    public final int getTaskMinute() {
        return 0;
    }
    
    public final void setTaskMinute(int p0) {
    }
    
    public final int component6() {
        return 0;
    }
    
    public final int isAlarmSet() {
        return 0;
    }
    
    public final void setAlarmSet(int p0) {
    }
    
    public final long component7() {
        return 0L;
    }
    
    public final long getId() {
        return 0L;
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
    public static final class Creator implements android.os.Parcelable.Creator<com.example.roomdb.model.ToDoList> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.example.roomdb.model.ToDoList createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.example.roomdb.model.ToDoList[] newArray(int size) {
            return null;
        }
    }
}