package com.cptest.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class TodoDatabaseHelper extends SQLiteOpenHelper {
	private static final String DATABASE_NAME = "todotable.db";
	private static final int DATABASE_VERSION = 1;

	/*
	 	private static final String CREATE_DATABASE = "CREATE TABLE"
			+ TodoTable.TABLE_TODO + "(" + TodoTable.COLUMN_ID
			+ "INTEGER PRIMARY KEY AUTOINCREMENT" + TodoTable.COLUMN_CATEGORY
			+ "TEXT NOT NULL" + TodoTable.COLUMN_DESCRIPTION + "TEXT NOT NULL"
			+ TodoTable.COLUMN_SUMMARY + "TEXT NOT NULL );";
	*/

	public TodoDatabaseHelper(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
	}

	// Method is called during creation of the database
	@Override
	public void onCreate(SQLiteDatabase database) {
		TodoTable.onCreate(database);
	}

	// Method is called during an upgrade of the database,
	// e.g. if you increase the database version
	@Override
	public void onUpgrade(SQLiteDatabase database, int oldVersion,
			int newVersion) {
		TodoTable.onUpgrade(database, oldVersion, newVersion);
	}

}