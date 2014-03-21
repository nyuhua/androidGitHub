package com.scb;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button csb1 = (Button)findViewById(R.id.csb1);
        Button csb2 = (Button)findViewById(R.id.csb2);
        Button csb3 = (Button)findViewById(R.id.csb3);
        Button csb4 = (Button)findViewById(R.id.csb4);
        Button csb5 = (Button)findViewById(R.id.csb5);
        Button csb6 = (Button)findViewById(R.id.csb6);
        Button csb7 = (Button)findViewById(R.id.csb7);
        Button csb8 = (Button)findViewById(R.id.csb8);
        final Button main1_csb1 = (Button)findViewById(R.id.mon);
        final Button main1_csb2 = (Button)findViewById(R.id.thu);
        final Button main1_csb3 = (Button)findViewById(R.id.thr);
        final Button main1_csb4 = (Button)findViewById(R.id.thur);
        final Button main1_csb5 = (Button)findViewById(R.id.fit);
        final Button main1_csb6 = (Button)findViewById(R.id.sat);
        final Button main1_csb7 = (Button)findViewById(R.id.sun);
        final TextView weekDay = (TextView)findViewById(R.id.weekDay);
        final List<Button> daybuttonlist = new ArrayList<Button>();
        daybuttonlist.add(main1_csb7);
        daybuttonlist.add(main1_csb6);
        daybuttonlist.add(main1_csb5);
        daybuttonlist.add(main1_csb4);
        daybuttonlist.add(main1_csb3);
        daybuttonlist.add(main1_csb2);
        daybuttonlist.add(main1_csb1);        
        Button operation = (Button)findViewById(R.id.operation);
        main1_csb1.setOnClickListener(new View.OnClickListener() {
        	
        	@Override
        	public void onClick(View arg0) {
        		// TODO Auto-generated method stub
        		Iterator<Button> iterator = daybuttonlist.iterator();
        		while(iterator.hasNext()){
        			iterator.next().setBackgroundColor(Color.parseColor("#EBEBEB"));
        		}
        		main1_csb1.setBackgroundColor(Color.parseColor("#ADADAD"));
        		weekDay.setText("星期一");
        	}
        });
        main1_csb2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Iterator<Button> iterator = daybuttonlist.iterator();
				while(iterator.hasNext()){
        			iterator.next().setBackgroundColor(Color.parseColor("#EBEBEB"));
        		}
        		main1_csb2.setBackgroundColor(Color.parseColor("#ADADAD"));
        		weekDay.setText("星期二");
			}
		});
        main1_csb3.setOnClickListener(new View.OnClickListener() {
        	
        	@Override
        	public void onClick(View arg0) {
        		// TODO Auto-generated method stub
        		Iterator<Button> iterator = daybuttonlist.iterator();
        		while(iterator.hasNext()){
        			iterator.next().setBackgroundColor(Color.parseColor("#EBEBEB"));
        		}
        		main1_csb3.setBackgroundColor(Color.parseColor("#ADADAD"));
        		weekDay.setText("星期三");
        	}
        });
        main1_csb4.setOnClickListener(new View.OnClickListener() {
        	
        	@Override
        	public void onClick(View arg0) {
        		// TODO Auto-generated method stub
        		Iterator<Button> iterator = daybuttonlist.iterator();
        		while(iterator.hasNext()){
        			iterator.next().setBackgroundColor(Color.parseColor("#EBEBEB"));
        		}
        		main1_csb4.setBackgroundColor(Color.parseColor("#ADADAD"));
        		weekDay.setText("星期四");
        	}
        });
        main1_csb5.setOnClickListener(new View.OnClickListener() {
        	
        	@Override
        	public void onClick(View arg0) {
        		// TODO Auto-generated method stub
        		Iterator<Button> iterator = daybuttonlist.iterator();
        		while(iterator.hasNext()){
        			iterator.next().setBackgroundColor(Color.parseColor("#EBEBEB"));
        		}
        		main1_csb5.setBackgroundColor(Color.parseColor("#ADADAD"));
        		weekDay.setText("星期五");
        	}
        });
        main1_csb6.setOnClickListener(new View.OnClickListener() {
        	
        	@Override
        	public void onClick(View arg0) {
        		// TODO Auto-generated method stub
        		Iterator<Button> iterator = daybuttonlist.iterator();
        		while(iterator.hasNext()){
        			iterator.next().setBackgroundColor(Color.parseColor("#EBEBEB"));
        		}
        		main1_csb6.setBackgroundColor(Color.parseColor("#ADADAD"));
        		weekDay.setText("星期六");
        	}
        });
        main1_csb7.setOnClickListener(new View.OnClickListener() {
        	
        	@Override
        	public void onClick(View arg0) {
        		// TODO Auto-generated method stub
        		Iterator<Button> iterator = daybuttonlist.iterator();
        		while(iterator.hasNext()){
        			iterator.next().setBackgroundColor(Color.parseColor("#EBEBEB"));
        		}
        		main1_csb7.setBackgroundColor(Color.parseColor("#ADADAD"));
        		weekDay.setText("星期日");
        	}
        });
        operation.setOnClickListener(new Button.OnClickListener(){
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainActivity.this, AppSetChoose.class);
				startActivity(intent);
			}
		});
        csb1.setOnClickListener(new View.OnClickListener() {			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainActivity.this, AppFctChoose.class);
				startActivity(intent);
			}
		});
        csb2.setOnClickListener(new View.OnClickListener() {			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainActivity.this, AppFctChoose.class);
				startActivity(intent);
			}
		});
        csb3.setOnClickListener(new View.OnClickListener() {			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainActivity.this, AppFctChoose.class);
				startActivity(intent);
			}
		});
        csb4.setOnClickListener(new View.OnClickListener() {			
        	@Override
        	public void onClick(View v) {
        		// TODO Auto-generated method stub
        		Intent intent = new Intent(MainActivity.this, AppFctChoose.class);
        		startActivity(intent);
        	}
        });
        csb5.setOnClickListener(new View.OnClickListener() {			
        	@Override
        	public void onClick(View v) {
        		// TODO Auto-generated method stub
        		Intent intent = new Intent(MainActivity.this, AppFctChoose.class);
        		startActivity(intent);
        	}
        });
        csb6.setOnClickListener(new View.OnClickListener() {			
        	@Override
        	public void onClick(View v) {
        		// TODO Auto-generated method stub
        		Intent intent = new Intent(MainActivity.this, AppFctChoose.class);
        		startActivity(intent);
        	}
        });
        csb7.setOnClickListener(new View.OnClickListener() {			
        	@Override
        	public void onClick(View v) {
        		// TODO Auto-generated method stub
        		Intent intent = new Intent(MainActivity.this, AppFctChoose.class);
        		startActivity(intent);
        	}
        });
        csb8.setOnClickListener(new View.OnClickListener() {			
        	@Override
        	public void onClick(View v) {
        		// TODO Auto-generated method stub
        		Intent intent = new Intent(MainActivity.this, AppFctChoose.class);
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
