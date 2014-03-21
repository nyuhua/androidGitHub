package com.scb;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AppGlobalSet extends Activity{
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.appglobalsetting);
        findViewById(R.id.global_setting_save).setOnClickListener(new Button.OnClickListener(){        	
        	@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
        		setGlobalInfo();
			}
		});
        
	}


    @Override
    protected void onStart(){
    	super.onStart();
    	getGlobalInfo();
    }
    @Override
    public void onDestroy(){
    	super.onDestroy();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    public void getGlobalInfo(){
    	SharedPreferences globalSharedPreference = getSharedPreferences("globalInfoSet", Activity.MODE_PRIVATE);	
        String globalweeks = globalSharedPreference.getString("globalweeks", "20");
        String global_morning_firstClass_start_hours = globalSharedPreference.getString("global_morning_firstClass_start_hours", "8");
        String global_morning_firstClass_start_minutes = globalSharedPreference.getString("global_morning_firstClass_start_minutes", "30");
        String global_noon_firstClass_start_hours = globalSharedPreference.getString("global_noon_firstClass_start_hours", "2");
        String global_noon_firstClass_start_minutes = globalSharedPreference.getString("global_noon_firstClass_start_minutes", "40");
        String global_time_perclass = globalSharedPreference.getString("global_time_perclass", "40");
        String global_first_second_braketime = globalSharedPreference.getString("global_first_second_braketime", "20");
        String global_second_third_braketime = globalSharedPreference.getString("global_second_third_braketime", "30");
        
        EditText globalweeksedit = (EditText)findViewById(R.id.globalweeks);
        globalweeksedit.setText(globalweeks);
        
        EditText global_morning_firstClass_start_hoursedit = (EditText)findViewById(R.id.global_morning_firstClass_start_hours);
        global_morning_firstClass_start_hoursedit.setText(global_morning_firstClass_start_hours);
        
        EditText global_morning_firstClass_start_minutesedit = (EditText)findViewById(R.id.global_morning_firstClass_start_minutes);
        global_morning_firstClass_start_minutesedit.setText(global_morning_firstClass_start_minutes);
        
        EditText global_noon_firstClass_start_hoursedit = (EditText)findViewById(R.id.global_noon_firstClass_start_hours);
        global_noon_firstClass_start_hoursedit.setText(global_noon_firstClass_start_hours);
        
        EditText global_noon_firstClass_start_minutesedit = (EditText)findViewById(R.id.global_noon_firstClass_start_minutes);
        global_noon_firstClass_start_minutesedit.setText(global_noon_firstClass_start_minutes);
        
        EditText global_time_perclassedit = (EditText)findViewById(R.id.global_time_perclass);
        global_time_perclassedit.setText(global_time_perclass);
        
        EditText global_first_second_braketimeedit = (EditText)findViewById(R.id.global_first_second_braketime);
        global_first_second_braketimeedit.setText(global_first_second_braketime);
        
        EditText global_second_third_braketimeedit = (EditText)findViewById(R.id.global_second_third_braketime);
        global_second_third_braketimeedit.setText(global_second_third_braketime);
    }
    
    public void setGlobalInfo(){
    	SharedPreferences globalSharedPreference = getSharedPreferences("globalInfoSet", Activity.MODE_PRIVATE);	
    	SharedPreferences.Editor editor = globalSharedPreference.edit();
    	EditText globalweeksedit = (EditText)findViewById(R.id.globalweeks);
        
        EditText global_morning_firstClass_start_hoursedit = (EditText)findViewById(R.id.global_morning_firstClass_start_hours);
        
        EditText global_morning_firstClass_start_minutesedit = (EditText)findViewById(R.id.global_morning_firstClass_start_minutes);
        
        EditText global_noon_firstClass_start_hoursedit = (EditText)findViewById(R.id.global_noon_firstClass_start_hours);
        
        EditText global_noon_firstClass_start_minutesedit = (EditText)findViewById(R.id.global_noon_firstClass_start_minutes);
        
        EditText global_time_perclassedit = (EditText)findViewById(R.id.global_time_perclass);
        
        EditText global_first_second_braketimeedit = (EditText)findViewById(R.id.global_first_second_braketime);
        
        EditText global_second_third_braketimeedit = (EditText)findViewById(R.id.global_second_third_braketime);
        
    	editor.putString("globalweeks", globalweeksedit.getText().toString());
		editor.putString("global_first_second_braketime", global_first_second_braketimeedit.getText().toString());
		editor.putString("global_second_third_braketime", global_second_third_braketimeedit.getText().toString());
		editor.putString("global_time_perclass", global_time_perclassedit.getText().toString());
		editor.putString("global_noon_firstClass_start_minutes", global_noon_firstClass_start_minutesedit.getText().toString());
		editor.putString("global_noon_firstClass_start_hours", global_noon_firstClass_start_hoursedit.getText().toString());
		editor.putString("global_morning_firstClass_start_minutes", global_morning_firstClass_start_minutesedit.getText().toString());
		editor.putString("global_morning_firstClass_start_hours", global_morning_firstClass_start_hoursedit.getText().toString());
		if(editor.commit()){
			Intent intent = new Intent(AppGlobalSet.this, MainActivity.class);
			startActivity(intent);
		}
		
    }
}
