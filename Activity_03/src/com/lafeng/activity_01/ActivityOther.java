package com.lafeng.activity_01;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityOther extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		 setContentView(R.layout.other);
		TextView textView=(TextView)findViewById(R.id.retult);
		Intent intent=getIntent();
		Double reulst=intent.getDoubleExtra("result", 0.0d);
		textView.setText(reulst+"");
		
	}
}
