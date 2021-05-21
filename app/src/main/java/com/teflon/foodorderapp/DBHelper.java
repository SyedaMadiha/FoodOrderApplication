package com.teflon.foodorderapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {
    final static String DBNAME = "mydatabase.db";
    final static int DBVERSION = 1;

    public DBHelper(@Nullable Context context)
    {
        super(context, DBNAME, null, DBVERSION );
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("create table orders" +
                "(id integer primary key autoincrement," +
                "name text," +
                "phone text," +
                "price int," +
                "image int," +
                "quantity int," +
                "description text," +
                "foodname text)"
        );
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP table if exists orders");
        onCreate(db);
    }
}
