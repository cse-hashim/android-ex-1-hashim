package com.example.htest2;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;

public class Activity1 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_activity1);
		Log.d(this.getClass().getName(), "_____oncreate");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity1, menu);
		Log.d(this.getClass().getName(), "_____oncreateoptionmenue");
		return true;
	}

	@Override
	public void finish() {
		super.finish();
		Log.d(this.getClass().getName(), "_____finish");
	}
	
	public void hoc(View v){
//		 finish();
	    	Intent i; 
	    	switch (v.getId()) {
			case R.id.btn1:
				i = new Intent(this,Activity1.class);
				break;
			case R.id.btn2:
				i = new Intent(this,Activity2.class);
				break;
			default:
				i = new Intent(this,MainActivity.class);
				break;
			}  
	    	startActivity(i);
	    	startActivity(i);
	    	startActivity(i);
	    	Log.d(this.getClass().getName(), "_____hoc");
	 }
}
