package com.scb;

import com.scb.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class AppFctChoose extends Activity{
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.appfctchoose);
        Button updatebtn = (Button)findViewById(R.id.updatebtn);
        updatebtn.setOnClickListener(new View.OnClickListener() {			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(AppFctChoose.this, UpDateItem.class);
				startActivity(intent);
			}
		});
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
