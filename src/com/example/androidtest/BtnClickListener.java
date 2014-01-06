package com.example.androidtest;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class BtnClickListener implements OnClickListener {
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
		Button btn = (Button) v;
		btn.setText("変更");
	}
	
	
}
