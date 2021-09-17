package com.jhy.todoapp

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DBHelper(context: Context): SQLiteOpenHelper(context, "tododb", null, 1) {
    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL("create table tb_todo (_id integer primary key autoincrement, title, content, date, completed)")
    }

    override fun onUpgrade(db: SQLiteDatabase?, p1: Int, p2: Int) {
        TODO("Not yet implemented")
    }
}