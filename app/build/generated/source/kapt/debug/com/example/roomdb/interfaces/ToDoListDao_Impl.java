package com.example.roomdb.interfaces;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.roomdb.model.ToDoList;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class ToDoListDao_Impl implements ToDoListDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<ToDoList> __insertionAdapterOfToDoList;

  private final EntityDeletionOrUpdateAdapter<ToDoList> __updateAdapterOfToDoList;

  private final SharedSQLiteStatement __preparedStmtOfUpdateById;

  private final SharedSQLiteStatement __preparedStmtOfDeleteById;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public ToDoListDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfToDoList = new EntityInsertionAdapter<ToDoList>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `ToDoList` (`taskTitle`,`taskDescription`,`priority`,`taskHour`,`taskMinute`,`isAlarmSet`,`id`) VALUES (?,?,?,?,?,?,nullif(?, 0))";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ToDoList value) {
        if (value.getTaskTitle() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getTaskTitle());
        }
        if (value.getTaskDescription() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTaskDescription());
        }
        if (value.getPriority() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getPriority());
        }
        stmt.bindLong(4, value.getTaskHour());
        stmt.bindLong(5, value.getTaskMinute());
        stmt.bindLong(6, value.isAlarmSet());
        stmt.bindLong(7, value.getId());
      }
    };
    this.__updateAdapterOfToDoList = new EntityDeletionOrUpdateAdapter<ToDoList>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `ToDoList` SET `taskTitle` = ?,`taskDescription` = ?,`priority` = ?,`taskHour` = ?,`taskMinute` = ?,`isAlarmSet` = ?,`id` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ToDoList value) {
        if (value.getTaskTitle() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getTaskTitle());
        }
        if (value.getTaskDescription() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTaskDescription());
        }
        if (value.getPriority() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getPriority());
        }
        stmt.bindLong(4, value.getTaskHour());
        stmt.bindLong(5, value.getTaskMinute());
        stmt.bindLong(6, value.isAlarmSet());
        stmt.bindLong(7, value.getId());
        stmt.bindLong(8, value.getId());
      }
    };
    this.__preparedStmtOfUpdateById = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE ToDoList SET taskTitle=? , taskDescription=?, priority=? , taskHour=? , taskMinute=? , isAlarmSet=?  WHERE id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteById = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM ToDoList WHERE id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM ToDoList";
        return _query;
      }
    };
  }

  @Override
  public Object insert(final ToDoList toDoList, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfToDoList.insert(toDoList);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object update(final ToDoList toDoList, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfToDoList.handle(toDoList);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object updateById(final String taskT, final String taskDesc, final String taskPriority,
      final long itemId, final int taskHour, final int taskMinute, final int isAlarmSet,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateById.acquire();
        int _argIndex = 1;
        if (taskT == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, taskT);
        }
        _argIndex = 2;
        if (taskDesc == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, taskDesc);
        }
        _argIndex = 3;
        if (taskPriority == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, taskPriority);
        }
        _argIndex = 4;
        _stmt.bindLong(_argIndex, taskHour);
        _argIndex = 5;
        _stmt.bindLong(_argIndex, taskMinute);
        _argIndex = 6;
        _stmt.bindLong(_argIndex, isAlarmSet);
        _argIndex = 7;
        _stmt.bindLong(_argIndex, itemId);
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfUpdateById.release(_stmt);
        }
      }
    }, continuation);
  }

  @Override
  public Object deleteById(final long itemId, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteById.acquire();
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, itemId);
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteById.release(_stmt);
        }
      }
    }, continuation);
  }

  @Override
  public Object deleteAll(final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAll.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteAll.release(_stmt);
        }
      }
    }, continuation);
  }

  @Override
  public LiveData<List<ToDoList>> getList() {
    final String _sql = "SELECT * FROM ToDoList ORDER BY id ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"ToDoList"}, false, new Callable<List<ToDoList>>() {
      @Override
      public List<ToDoList> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfTaskTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "taskTitle");
          final int _cursorIndexOfTaskDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "taskDescription");
          final int _cursorIndexOfPriority = CursorUtil.getColumnIndexOrThrow(_cursor, "priority");
          final int _cursorIndexOfTaskHour = CursorUtil.getColumnIndexOrThrow(_cursor, "taskHour");
          final int _cursorIndexOfTaskMinute = CursorUtil.getColumnIndexOrThrow(_cursor, "taskMinute");
          final int _cursorIndexOfIsAlarmSet = CursorUtil.getColumnIndexOrThrow(_cursor, "isAlarmSet");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final List<ToDoList> _result = new ArrayList<ToDoList>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final ToDoList _item;
            final String _tmpTaskTitle;
            if (_cursor.isNull(_cursorIndexOfTaskTitle)) {
              _tmpTaskTitle = null;
            } else {
              _tmpTaskTitle = _cursor.getString(_cursorIndexOfTaskTitle);
            }
            final String _tmpTaskDescription;
            if (_cursor.isNull(_cursorIndexOfTaskDescription)) {
              _tmpTaskDescription = null;
            } else {
              _tmpTaskDescription = _cursor.getString(_cursorIndexOfTaskDescription);
            }
            final String _tmpPriority;
            if (_cursor.isNull(_cursorIndexOfPriority)) {
              _tmpPriority = null;
            } else {
              _tmpPriority = _cursor.getString(_cursorIndexOfPriority);
            }
            final int _tmpTaskHour;
            _tmpTaskHour = _cursor.getInt(_cursorIndexOfTaskHour);
            final int _tmpTaskMinute;
            _tmpTaskMinute = _cursor.getInt(_cursorIndexOfTaskMinute);
            final int _tmpIsAlarmSet;
            _tmpIsAlarmSet = _cursor.getInt(_cursorIndexOfIsAlarmSet);
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            _item = new ToDoList(_tmpTaskTitle,_tmpTaskDescription,_tmpPriority,_tmpTaskHour,_tmpTaskMinute,_tmpIsAlarmSet,_tmpId);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Object fetchItemData(final long itemId,
      final Continuation<? super ToDoList> continuation) {
    final String _sql = "Select * From ToDoList WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, itemId);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<ToDoList>() {
      @Override
      public ToDoList call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfTaskTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "taskTitle");
          final int _cursorIndexOfTaskDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "taskDescription");
          final int _cursorIndexOfPriority = CursorUtil.getColumnIndexOrThrow(_cursor, "priority");
          final int _cursorIndexOfTaskHour = CursorUtil.getColumnIndexOrThrow(_cursor, "taskHour");
          final int _cursorIndexOfTaskMinute = CursorUtil.getColumnIndexOrThrow(_cursor, "taskMinute");
          final int _cursorIndexOfIsAlarmSet = CursorUtil.getColumnIndexOrThrow(_cursor, "isAlarmSet");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final ToDoList _result;
          if(_cursor.moveToFirst()) {
            final String _tmpTaskTitle;
            if (_cursor.isNull(_cursorIndexOfTaskTitle)) {
              _tmpTaskTitle = null;
            } else {
              _tmpTaskTitle = _cursor.getString(_cursorIndexOfTaskTitle);
            }
            final String _tmpTaskDescription;
            if (_cursor.isNull(_cursorIndexOfTaskDescription)) {
              _tmpTaskDescription = null;
            } else {
              _tmpTaskDescription = _cursor.getString(_cursorIndexOfTaskDescription);
            }
            final String _tmpPriority;
            if (_cursor.isNull(_cursorIndexOfPriority)) {
              _tmpPriority = null;
            } else {
              _tmpPriority = _cursor.getString(_cursorIndexOfPriority);
            }
            final int _tmpTaskHour;
            _tmpTaskHour = _cursor.getInt(_cursorIndexOfTaskHour);
            final int _tmpTaskMinute;
            _tmpTaskMinute = _cursor.getInt(_cursorIndexOfTaskMinute);
            final int _tmpIsAlarmSet;
            _tmpIsAlarmSet = _cursor.getInt(_cursorIndexOfIsAlarmSet);
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            _result = new ToDoList(_tmpTaskTitle,_tmpTaskDescription,_tmpPriority,_tmpTaskHour,_tmpTaskMinute,_tmpIsAlarmSet,_tmpId);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
