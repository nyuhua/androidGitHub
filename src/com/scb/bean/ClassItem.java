package com.scb.bean;

import java.util.UUID;

public class ClassItem {
	private String Class_id;
	private int WeekStart;
	private int WeekEnd;
	private String WeekDay;
	private String DayTime;
	private int Class_Sequence;
	private String Class_Name;
	private String Class_Address;
	public String getClass_id() {
		return Class_id;
	}
	public void setClass_id() {
		 
		Class_id = UUID.randomUUID().toString();
	}
	public int getWeekStart() {
		return WeekStart;
	}
	public void setWeekStart(int weekStart) {
		WeekStart = weekStart;
	}
	public int getWeekEnd() {
		return WeekEnd;
	}
	public void setWeekEnd(int weekEnd) {
		WeekEnd = weekEnd;
	}
	public String getWeekDay() {
		return WeekDay;
	}
	public void setWeekDay(String weekDay) {
		WeekDay = weekDay;
	}
	public String getDayTime() {
		return DayTime;
	}
	public void setDayTime(String dayTime) {
		DayTime = dayTime;
	}
	public int getClass_Sequence() {
		return Class_Sequence;
	}
	public void setClass_Sequence(int class_Sequence) {
		Class_Sequence = class_Sequence;
	}
	public String getClass_Name() {
		return Class_Name;
	}
	public void setClass_Name(String class_Name) {
		Class_Name = class_Name;
	}
	public String getClass_Address() {
		return Class_Address;
	}
	public void setClass_Address(String class_Address) {
		Class_Address = class_Address;
	}
	
}
