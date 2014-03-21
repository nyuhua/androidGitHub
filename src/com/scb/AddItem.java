package com.scb;

import android.app.Activity;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddItem extends Activity {

	EditText weekstraredit;
	EditText weekendEdit;
	EditText weekdayEdit;
	EditText daytimeEdit;
	EditText class_sequence;
	EditText class_name;
	EditText class_address;
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.additem);
        Button itemaddbtn = (Button)findViewById(R.id.itemadd);
        itemaddbtn.setOnClickListener(new Button.OnClickListener(){
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
		});
    }


    @Override
    protected void onStart(){
    	super.onStart();
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    @Override
    public void onDestroy(){
    	super.onDestroy();
    }
	
    public void addItem(){
    	weekstraredit = (EditText)findViewById(R.id.additem_weekstart);
    	weekendEdit = (EditText)findViewById(R.id.additem_weekend);
    	weekdayEdit = (EditText)findViewById(R.id.additem_weekday);
    	daytimeEdit = (EditText)findViewById(R.id.additem_daytime);
    	class_sequence = (EditText)findViewById(R.id.additem_class_sequence);
    	class_name = (EditText)findViewById(R.id.additem_class_name);
    	class_address = (EditText)findViewById(R.id.additem_class_address);
    	
    }
    
}
