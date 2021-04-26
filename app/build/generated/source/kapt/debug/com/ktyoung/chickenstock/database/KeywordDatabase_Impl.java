package com.ktyoung.chickenstock.database;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import com.ktyoung.chickenstock.database.dao.KeywordDao;
import com.ktyoung.chickenstock.database.dao.KeywordDao_Impl;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class KeywordDatabase_Impl extends KeywordDatabase {
  private volatile KeywordDao _keywordDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `keyword_table` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `title` TEXT, `keyword1` TEXT, `keyword2` TEXT, `keyword3` TEXT, `time` INTEGER)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '8d7b07de5ed1c9097729430ea7e38a19')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `keyword_table`");
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
        final HashMap<String, TableInfo.Column> _columnsKeywordTable = new HashMap<String, TableInfo.Column>(6);
        _columnsKeywordTable.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsKeywordTable.put("title", new TableInfo.Column("title", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsKeywordTable.put("keyword1", new TableInfo.Column("keyword1", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsKeywordTable.put("keyword2", new TableInfo.Column("keyword2", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsKeywordTable.put("keyword3", new TableInfo.Column("keyword3", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsKeywordTable.put("time", new TableInfo.Column("time", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysKeywordTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesKeywordTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoKeywordTable = new TableInfo("keyword_table", _columnsKeywordTable, _foreignKeysKeywordTable, _indicesKeywordTable);
        final TableInfo _existingKeywordTable = TableInfo.read(_db, "keyword_table");
        if (! _infoKeywordTable.equals(_existingKeywordTable)) {
          return new RoomOpenHelper.ValidationResult(false, "keyword_table(com.ktyoung.chickenstock.database.model.KeywordModel).\n"
                  + " Expected:\n" + _infoKeywordTable + "\n"
                  + " Found:\n" + _existingKeywordTable);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "8d7b07de5ed1c9097729430ea7e38a19", "c1bdc10d2548b4a8e76f01845fdfe5cf");
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
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "keyword_table");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `keyword_table`");
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
  public KeywordDao keywordDao() {
    if (_keywordDao != null) {
      return _keywordDao;
    } else {
      synchronized(this) {
        if(_keywordDao == null) {
          _keywordDao = new KeywordDao_Impl(this);
        }
        return _keywordDao;
      }
    }
  }
}
