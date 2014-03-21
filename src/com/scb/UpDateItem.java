package com.scb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class UpDateItem extends Activity {
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.updateitem);
        Button noUpdateBtn = (Button)findViewById(R.id.noUpdateBtn);
        noUpdateBtn.setOnClickListener(new Button.OnClickListener(){
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(UpDateItem.this, MainActivity.class);
				startActivity(intent);
			}
		 });
        TextView weekstart = (TextView)findViewById(R.id.weekstart);
        TextView weekend = (TextView)findViewById(R.id.weekend);
        TextView weekday = (TextView)findViewById(R.id.weekDay);
        TextView harfday = (TextView)findViewById(R.id.harfday);
        TextView classnum = (TextView)findViewById(R.id.classnum);
        TextView classname = (TextView)findViewById(R.id.classname);
        TextView classaddress = (TextView)findViewById(R.id.classaddress);
    }


    @Override
    protected void onStart(){
    	super.onStart();
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
}
