package com.scb.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase.CursorFactory;

import com.scb.bean.ClassItem;
import com.scb.bean.MySQLiteOpenHelper;

public class ClassItemDAO {
	CursorFactory cursor;
	Context context;
	MySQLiteOpenHelper dbopenhelper ;
	public ClassItemDAO(Context activityContext){
		this.dbopenhelper = new MySQLiteOpenHelper(activityContext,MySQLiteOpenHelper.DATABASE_NAME,null,1);
	}
	public void insertClassItem(ClassItem classitem){
		
	}
}

