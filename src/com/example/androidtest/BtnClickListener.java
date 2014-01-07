package com.example.androidtest;

import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

public class BtnClickListener implements OnClickListener {
	
	private View rootLayout;
	public BtnClickListener(Activity context){
		rootLayout = ((ViewGroup)context.findViewById(android.R.id.content)).getChildAt(0);
	}
	
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btnChangeText:
			clickBtnChangeText(v);
			break;
		case R.id.btnBack:
			break;
		default:
			break;
		}
	}
	
	void clickBtnChangeText(View v){
//		View rootView = getWindow().getDecorView();
		Button btn = (Button)rootLayout.findViewById(R.id.btnChangeText);
		btn.setText("変更");
	}
	
	
}
