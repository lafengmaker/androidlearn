package com.lafeng.activity_01;

import android.os.Bundle;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.linearlayoutmain);
        TextView textView=(TextView)findViewById(R.id.mytestView);
        Button button=(Button)findViewById(R.id.myButton);
        button.setText(R.string.buttontext);
        button.setOnClickListener(new myButtonListener());
        super.onCreate(savedInstanceState);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    class myButtonListener implements OnClickListener{

		@Override
		public void onClick(View arg0) {
			Intent intent =new Intent();
			intent.putExtra("myData", "这个事我传递过来的内容，修改了原来的页面");
			intent.setClass(MainActivity.this, ActivityOther.class);
			MainActivity.this.startActivity(intent);
		}

		
    	
    }
}
