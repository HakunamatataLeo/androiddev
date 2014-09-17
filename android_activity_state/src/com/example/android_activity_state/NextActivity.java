package com.example.android_activity_state;

import android.app.Activity;
import android.content.Intent;
//import android.view.View;
import android.os.Bundle;
import android.util.Log;

public class NextActivity extends Activity {
	private  final String tag = "NextActivity";
	public NextActivity() {
		// TODO Auto-generated constructor stub
	}
	protected void onCreate(Bundle savedInstanceState){
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.next);
		Intent intent = getIntent();
		String name = intent.getStringExtra("name");
		Log.i(tag, "-->>"+name);
		int age = intent.getIntExtra("age",0);
		Log.i(tag, "-->>"+age);
		String address = intent.getStringExtra("address");
		Log.i(tag, "-->>"+address);
		Bundle bundle = intent.getBundleExtra("bundle");
		String code = bundle.getString("code");
		Log.i(tag, "-->>"+code);
	}
}
