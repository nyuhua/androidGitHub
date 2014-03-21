package com.scb;

import com.scb.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

public class ItemListView extends Activity {
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.additem);
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
