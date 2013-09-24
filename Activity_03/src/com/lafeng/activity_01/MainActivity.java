package com.lafeng.activity_01;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
	private EditText p1;
	private EditText p2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.linearlayoutmain);
        Button button=(Button)findViewById(R.id.myButton);
        button.setOnClickListener(new myButtonListener());
        p1=(EditText)findViewById(R.id.param1);
		p2=(EditText)findViewById(R.id.param2);
    }

    
    @Override
	public boolean onCreatePanelMenu(int featureId, Menu menu) {
		// TODO Auto-generated method stub
    	menu.add(0, 1, 1, R.string.about);
    	menu.add(0, 2, 2, R.string.exit);
    	
		return super.onCreatePanelMenu(featureId, menu);
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
			System.out.println(p1.getText().toString());
			Double d1=Double.valueOf(p1.getText().toString());
			Double d2=Double.valueOf(p2.getText().toString());
			intent.putExtra("result", d1*d2);
			intent.setClass(MainActivity.this, ActivityOther.class);
			startActivity(intent);
		}

		
    	
    }
}
