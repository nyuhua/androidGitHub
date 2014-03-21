package com.scb.bean;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class MySQLiteOpenHelper extends SQLiteOpenHelper {

	public static final String DATABASE_NAME = "scb.db";
	public static final String DATABASE_CLASSITEM_TABLE = "ClassItem"; 
	public static final String DATABASE_CLASSHOMEWORK_TABLE = "ClassHomeWork"; 
	private static final String CLASS_ID = "Class_Id"; 
	private static final String WEEKSTART = "WeekStart"; 
	private static final String WEEKEND = "WeekEnd"; 
	private static final String WEEKDAY = "WeekDay"; 
	private static final String DAYTIME = "DayTime"; 
	private static final String CLASS_SEQUENCE = "Class_Sequence"; 
	private static final String CLASS_NAME = "Class_Name"; 
	private static final String CLASS_ADDRESS = "Class_Address"; 
	private static final String HOMEWORKID = "HomeWorkId"; 
	private static final String DATE = "Date"; 
	private static final String HOMEWORKTITLE = "HomeWorkTitle"; 
	private static final String HOMEWORKREQUEST = "HomeWorkRequest"; 
	private static final String ALARMTIME = "AlarmTime"; 
	private final String DATABASE_TABLE_CLASSITEM = "create table"+DATABASE_CLASSITEM_TABLE
													+"("
													+CLASS_ID+" varchar(30) not null unique primary key,"
													+WEEKSTART+" interger  not null,"
													+WEEKEND+" interger  not null,"
													+WEEKDAY+" varchar(5)  not null,"
													+DAYTIME+" interger  not null,"
													+CLASS_SEQUENCE+" interger  not null,"
													+CLASS_NAME+" varchar(20) not null,"
													+CLASS_ADDRESS+" varchar(30) not null "
													+")";
	private final String DATABASE_TABLE_CLASSHOMEWORK = "create table"+DATABASE_CLASSHOMEWORK_TABLE
													+"("
													+HOMEWORKID+"varchar(30) not null unique ,"
													+CLASS_ID+" varchar(30) not null unique ,"
													+DATE+" Date ,"
													+HOMEWORKTITLE+" varchar(50) ,"
													+HOMEWORKREQUEST+" varchar(100) ,"
													+ALARMTIME+" Time ,"
													+"primary key("+HOMEWORKID+","+CLASS_ID+"),"
													+"foreign key("+CLASS_ID+") references to("+DATABASE_CLASSITEM_TABLE+"."+CLASS_ID+"),"
													+")";
	public MySQLiteOpenHelper(Context context, String name, CursorFactory factory, int version) {
		super(context, name, factory, version);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		db.execSQL(DATABASE_TABLE_CLASSITEM);
		db.execSQL(DATABASE_TABLE_CLASSHOMEWORK);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		
	}

}
