package com.example.roomdb.database;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import com.example.roomdb.interfaces.ToDoListDao;
import com.example.roomdb.interfaces.ToDoListDao_Impl;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class ToDoListRoomDatabase_Impl extends ToDoListRoomDatabase {
  private volatile ToDoListDao _toDoListDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(2) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `ToDoList` (`taskTitle` TEXT NOT NULL, `taskDescription` TEXT NOT NULL, `priority` TEXT NOT NULL, `taskHour` INTEGER NOT NULL, `taskMinute` INTEGER NOT NULL, `isAlarmSet` INTEGER NOT NULL, `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '3b377005037084c8700dbb1075115298')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `ToDoList`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsToDoList = new HashMap<String, TableInfo.Column>(7);
        _columnsToDoList.put("taskTitle", new TableInfo.Column("taskTitle", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsToDoList.put("taskDescription", new TableInfo.Column("taskDescription", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsToDoList.put("priority", new TableInfo.Column("priority", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsToDoList.put("taskHour", new TableInfo.Column("taskHour", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsToDoList.put("taskMinute", new TableInfo.Column("taskMinute", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsToDoList.put("isAlarmSet", new TableInfo.Column("isAlarmSet", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsToDoList.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysToDoList = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesToDoList = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoToDoList = new TableInfo("ToDoList", _columnsToDoList, _foreignKeysToDoList, _indicesToDoList);
        final TableInfo _existingToDoList = TableInfo.read(_db, "ToDoList");
        if (! _infoToDoList.equals(_existingToDoList)) {
          return new RoomOpenHelper.ValidationResult(false, "ToDoList(com.example.roomdb.model.ToDoList).\n"
                  + " Expected:\n" + _infoToDoList + "\n"
                  + " Found:\n" + _existingToDoList);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "3b377005037084c8700dbb1075115298", "ea532cfc997c5dfe77876e2cfad3c9e7");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "ToDoList");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `ToDoList`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(ToDoListDao.class, ToDoListDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  public List<Migration> getAutoMigrations(
      @NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecsMap) {
    return Arrays.asList();
  }

  @Override
  public ToDoListDao getNotesDao() {
    if (_toDoListDao != null) {
      return _toDoListDao;
    } else {
      synchronized(this) {
        if(_toDoListDao == null) {
          _toDoListDao = new ToDoListDao_Impl(this);
        }
        return _toDoListDao;
      }
    }
  }
}
