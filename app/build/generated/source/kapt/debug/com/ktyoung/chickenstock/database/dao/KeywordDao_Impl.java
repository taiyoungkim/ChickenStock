package com.ktyoung.chickenstock.database.dao;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.ktyoung.chickenstock.database.model.KeywordModel;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class KeywordDao_Impl implements KeywordDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<KeywordModel> __insertionAdapterOfKeywordModel;

  private final EntityDeletionOrUpdateAdapter<KeywordModel> __deletionAdapterOfKeywordModel;

  private final EntityDeletionOrUpdateAdapter<KeywordModel> __updateAdapterOfKeywordModel;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public KeywordDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfKeywordModel = new EntityInsertionAdapter<KeywordModel>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `keyword_table` (`id`,`title`,`keyword1`,`keyword2`,`keyword3`,`time`) VALUES (nullif(?, 0),?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, KeywordModel value) {
        stmt.bindLong(1, value.getId());
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        if (value.getKeyword1() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getKeyword1());
        }
        if (value.getKeyword2() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getKeyword2());
        }
        if (value.getKeyword3() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getKeyword3());
        }
        if (value.getTime() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindLong(6, value.getTime());
        }
      }
    };
    this.__deletionAdapterOfKeywordModel = new EntityDeletionOrUpdateAdapter<KeywordModel>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `keyword_table` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, KeywordModel value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfKeywordModel = new EntityDeletionOrUpdateAdapter<KeywordModel>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `keyword_table` SET `id` = ?,`title` = ?,`keyword1` = ?,`keyword2` = ?,`keyword3` = ?,`time` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, KeywordModel value) {
        stmt.bindLong(1, value.getId());
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        if (value.getKeyword1() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getKeyword1());
        }
        if (value.getKeyword2() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getKeyword2());
        }
        if (value.getKeyword3() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getKeyword3());
        }
        if (value.getTime() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindLong(6, value.getTime());
        }
        stmt.bindLong(7, value.getId());
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM keyword_table";
        return _query;
      }
    };
  }

  @Override
  public void keywordInsert(final KeywordModel keywordModel) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfKeywordModel.insert(keywordModel);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteKeyword(final KeywordModel keywordModel) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfKeywordModel.handle(keywordModel);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateKeyword(final KeywordModel keywordModel) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfKeywordModel.handle(keywordModel);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteAll() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAll.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAll.release(_stmt);
    }
  }

  @Override
  public LiveData<List<KeywordModel>> getKeywords() {
    final String _sql = "SELECT * FROM keyword_table ORDER BY id ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"keyword_table"}, false, new Callable<List<KeywordModel>>() {
      @Override
      public List<KeywordModel> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfKeyword1 = CursorUtil.getColumnIndexOrThrow(_cursor, "keyword1");
          final int _cursorIndexOfKeyword2 = CursorUtil.getColumnIndexOrThrow(_cursor, "keyword2");
          final int _cursorIndexOfKeyword3 = CursorUtil.getColumnIndexOrThrow(_cursor, "keyword3");
          final int _cursorIndexOfTime = CursorUtil.getColumnIndexOrThrow(_cursor, "time");
          final List<KeywordModel> _result = new ArrayList<KeywordModel>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final KeywordModel _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            final String _tmpKeyword1;
            _tmpKeyword1 = _cursor.getString(_cursorIndexOfKeyword1);
            final String _tmpKeyword2;
            _tmpKeyword2 = _cursor.getString(_cursorIndexOfKeyword2);
            final String _tmpKeyword3;
            _tmpKeyword3 = _cursor.getString(_cursorIndexOfKeyword3);
            final Integer _tmpTime;
            if (_cursor.isNull(_cursorIndexOfTime)) {
              _tmpTime = null;
            } else {
              _tmpTime = _cursor.getInt(_cursorIndexOfTime);
            }
            _item = new KeywordModel(_tmpId,_tmpTitle,_tmpKeyword1,_tmpKeyword2,_tmpKeyword3,_tmpTime);
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
}
