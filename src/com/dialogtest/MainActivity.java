package com.dialogtest;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener {

	TextView tx;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		 tx = (TextView)findViewById(R.id.INPUT);
		
		
		Button btn = (Button)findViewById(R.id.BUTTON);
		btn.setOnClickListener(this);
		
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		switch(v.getId())
		{
		case R.id.BUTTON:
			
			OpenDialog();
			break;
			
		
		
		}
		
		
	}
	
	public void OpenDialog(){
	
		final CharSequence[] item = {"Red", "Green", "Blue"};
		
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		builder.setTitle("Pick a color");
		builder.setSingleChoiceItems(item, 0, new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				Result_value(which);
				dialog.dismiss();
			}
		});

          AlertDialog alert = builder.create();
          alert.show();
	}
 
	public void Result_value(int item)
	{
		
		tx.setText("this Value ->" + item);
		
	}

}
