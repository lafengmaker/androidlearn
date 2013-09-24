package com.lafeng.activity_01;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class ActivityOther extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Intent intent=getIntent();
		String value =intent.getStringExtra("myData");
		setContentView(R.layout.other);
		TextView textView=(TextView)findViewById(R.id.othertext);
		textView.setText(value);
		Button button=(Button)findViewById(R.id.otherButton);
		button.setOnClickListener(new sendSMS());
	}
	class sendSMS implements OnClickListener{
		@Override
		public void onClick(View v) {
			Uri uri=Uri.parse("smsto:15258835040");
			Intent intent=new Intent(Intent.ACTION_SENDTO,uri);
			intent.putExtra("sms_body", "This is a good msessgae");
			startActivity(intent);
			
			
		}
		
	}
	
}
