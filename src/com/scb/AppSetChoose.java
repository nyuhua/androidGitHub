package com.scb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class AppSetChoose extends Activity {
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.appsettingchoose);
        Button additembtn = (Button)findViewById(R.id.additembtn);
        additembtn.setOnClickListener(new Button.OnClickListener(){
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(AppSetChoose.this, AddItem.class);
				startActivity(intent);
			}
		});
        Button globalset = (Button)findViewById(R.id.globalsetbtn);
        globalset.setOnClickListener(new Button.OnClickListener(){
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(AppSetChoose.this, AppGlobalSet.class);
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
