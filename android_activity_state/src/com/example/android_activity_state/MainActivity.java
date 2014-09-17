package com.example.android_activity_state;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;



public class MainActivity extends ActionBarActivity {
	private Button button;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button)this.findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//第一种方式
				Intent intent = new Intent(MainActivity.this,NextActivity.class);
				intent.putExtra("name", "jake");
				intent.putExtra("age", 23);
				intent.putExtra("address", "上海");
				Bundle bundle = new Bundle();
				bundle.putString("code", "1001");
				intent.putExtra("bundle", bundle);
				startActivity(intent);
				//第二种方式
				//Intent intent = new Intent();
				//intent.setClass(MainActivity.this,NextActivity.class);
				//第三种方式@
				//Intent intent = new Intent("com.example.android_activity_state.nextActivity");
				//startActivity(intent);
				//Intent intent = new Intent();
				//intent.setAction("com.example.android_activity_state.nextActivity");
				//startActivity(intent);
			}
		});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
