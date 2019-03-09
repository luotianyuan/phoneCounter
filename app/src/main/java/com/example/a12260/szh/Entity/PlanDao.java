package com.example.a12260.szh.Entity;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * DAO for table "PLAN".
 */
public class PlanDao extends AbstractDao<Plan, Long> {

    public static final String TABLENAME = "PLAN";

    /**
     * Properties of entity Plan.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property TimeToWarn = new Property(1, Integer.class, "timeToWarn", false, "TIME_TO_WARN");
        public final static Property Type = new Property(2, Integer.class, "type", false, "TYPE");
        public final static Property Index = new Property(3, Integer.class, "index", false, "INDEX");
        public final static Property Effective = new Property(4, Boolean.class, "effective", false, "EFFECTIVE");
    }


    public PlanDao(DaoConfig config) {
        super(config);
    }

    public PlanDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /**
     * Creates the underlying database table.
     */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists ? "IF NOT EXISTS " : "";
        db.execSQL("CREATE TABLE " + constraint + "\"PLAN\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"TIME_TO_WARN\" INTEGER," + // 1: timeToWarn
                "\"TYPE\" INTEGER," + // 2: type
                "\"INDEX\" INTEGER," + // 3: index
                "\"EFFECTIVE\" INTEGER);"); // 4: effective
    }

    /**
     * Drops the underlying database table.
     */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"PLAN\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, Plan entity) {
        stmt.clearBindings();

        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }

        Integer timeToWarn = entity.getTimeToWarn();
        if (timeToWarn != null) {
            stmt.bindLong(2, timeToWarn);
        }

        Integer type = entity.getType();
        if (type != null) {
            stmt.bindLong(3, type);
        }

        Integer index = entity.getIndex();
        if (index != null) {
            stmt.bindLong(4, index);
        }

        Boolean effective = entity.getEffective();
        if (effective != null) {
            stmt.bindLong(5, effective ? 1L : 0L);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, Plan entity) {
        stmt.clearBindings();

        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }

        Integer timeToWarn = entity.getTimeToWarn();
        if (timeToWarn != null) {
            stmt.bindLong(2, timeToWarn);
        }

        Integer type = entity.getType();
        if (type != null) {
            stmt.bindLong(3, type);
        }

        Integer index = entity.getIndex();
        if (index != null) {
            stmt.bindLong(4, index);
        }

        Boolean effective = entity.getEffective();
        if (effective != null) {
            stmt.bindLong(5, effective ? 1L : 0L);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }

    @Override
    public Plan readEntity(Cursor cursor, int offset) {
        Plan entity = new Plan( //
                cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
                cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1), // timeToWarn
                cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2), // type
                cursor.isNull(offset + 3) ? null : cursor.getInt(offset + 3), // index
                cursor.isNull(offset + 4) ? null : cursor.getShort(offset + 4) != 0 // effective
        );
        return entity;
    }

    @Override
    public void readEntity(Cursor cursor, Plan entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setTimeToWarn(cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1));
        entity.setType(cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2));
        entity.setIndex(cursor.isNull(offset + 3) ? null : cursor.getInt(offset + 3));
        entity.setEffective(cursor.isNull(offset + 4) ? null : cursor.getShort(offset + 4) != 0);
    }

    @Override
    protected final Long updateKeyAfterInsert(Plan entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }

    @Override
    public Long getKey(Plan entity) {
        if (entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(Plan entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }

}
