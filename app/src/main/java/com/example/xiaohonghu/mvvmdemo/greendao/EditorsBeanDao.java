package com.example.xiaohonghu.mvvmdemo.greendao;

import java.util.List;
import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.query.Query;
import org.greenrobot.greendao.query.QueryBuilder;

import com.example.xiaohonghu.mvvmdemo.bean.EditorsBean;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "EDITORS_BEAN".
*/
public class EditorsBeanDao extends AbstractDao<EditorsBean, Long> {

    public static final String TABLENAME = "EDITORS_BEAN";

    /**
     * Properties of entity EditorsBean.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Url = new Property(0, String.class, "url", false, "URL");
        public final static Property Bio = new Property(1, String.class, "bio", false, "BIO");
        public final static Property EditorId = new Property(2, Long.class, "editorId", false, "EDITOR_ID");
        public final static Property Id = new Property(3, Long.class, "id", true, "_id");
        public final static Property Avatar = new Property(4, String.class, "avatar", false, "AVATAR");
        public final static Property Name = new Property(5, String.class, "name", false, "NAME");
    }

    private Query<EditorsBean> newsListBean_EditorsQuery;

    public EditorsBeanDao(DaoConfig config) {
        super(config);
    }
    
    public EditorsBeanDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"EDITORS_BEAN\" (" + //
                "\"URL\" TEXT," + // 0: url
                "\"BIO\" TEXT," + // 1: bio
                "\"EDITOR_ID\" INTEGER," + // 2: editorId
                "\"_id\" INTEGER PRIMARY KEY ," + // 3: id
                "\"AVATAR\" TEXT," + // 4: avatar
                "\"NAME\" TEXT);"); // 5: name
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"EDITORS_BEAN\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, EditorsBean entity) {
        stmt.clearBindings();
 
        String url = entity.getUrl();
        if (url != null) {
            stmt.bindString(1, url);
        }
 
        String bio = entity.getBio();
        if (bio != null) {
            stmt.bindString(2, bio);
        }
 
        Long editorId = entity.getEditorId();
        if (editorId != null) {
            stmt.bindLong(3, editorId);
        }
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(4, id);
        }
 
        String avatar = entity.getAvatar();
        if (avatar != null) {
            stmt.bindString(5, avatar);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(6, name);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, EditorsBean entity) {
        stmt.clearBindings();
 
        String url = entity.getUrl();
        if (url != null) {
            stmt.bindString(1, url);
        }
 
        String bio = entity.getBio();
        if (bio != null) {
            stmt.bindString(2, bio);
        }
 
        Long editorId = entity.getEditorId();
        if (editorId != null) {
            stmt.bindLong(3, editorId);
        }
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(4, id);
        }
 
        String avatar = entity.getAvatar();
        if (avatar != null) {
            stmt.bindString(5, avatar);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(6, name);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 3) ? null : cursor.getLong(offset + 3);
    }    

    @Override
    public EditorsBean readEntity(Cursor cursor, int offset) {
        EditorsBean entity = new EditorsBean( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // url
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // bio
            cursor.isNull(offset + 2) ? null : cursor.getLong(offset + 2), // editorId
            cursor.isNull(offset + 3) ? null : cursor.getLong(offset + 3), // id
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // avatar
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5) // name
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, EditorsBean entity, int offset) {
        entity.setUrl(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setBio(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setEditorId(cursor.isNull(offset + 2) ? null : cursor.getLong(offset + 2));
        entity.setId(cursor.isNull(offset + 3) ? null : cursor.getLong(offset + 3));
        entity.setAvatar(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setName(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(EditorsBean entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(EditorsBean entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(EditorsBean entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
    /** Internal query to resolve the "editors" to-many relationship of NewsListBean. */
    public List<EditorsBean> _queryNewsListBean_Editors(Long editorId) {
        synchronized (this) {
            if (newsListBean_EditorsQuery == null) {
                QueryBuilder<EditorsBean> queryBuilder = queryBuilder();
                queryBuilder.where(Properties.EditorId.eq(null));
                newsListBean_EditorsQuery = queryBuilder.build();
            }
        }
        Query<EditorsBean> query = newsListBean_EditorsQuery.forCurrentThread();
        query.setParameter(0, editorId);
        return query.list();
    }

}
