package com.example.androidtest;

import android.app.Activity;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MyMenuItemClickListener implements OnMenuItemClickListener {
	
	private View rootLayout;
	public MyMenuItemClickListener(Activity context){
		rootLayout = ((ViewGroup)context.findViewById(android.R.id.content)).getChildAt(0);
	}
	
	public boolean onMenuItemClick(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.newFile:
			menuNewFile(item);
			break;
		case R.id.editFile:
			menuEditFile(item);
			break;
		case R.id.deleteFile:
			menuDeleteFile(item);
			break;
		default:
			break;
		}
		return true;
	}
	
	void menuNewFile(MenuItem item){
		TextView txtView = (TextView)rootLayout.findViewById(R.id.textHelloWorld);
		txtView.setText(item.getTitle());
	}
	void menuEditFile(MenuItem item){
		TextView txtView = (TextView)rootLayout.findViewById(R.id.textHelloWorld);
		txtView.setText(item.getTitle());
	}
	void menuDeleteFile(MenuItem item){
		TextView txtView = (TextView)rootLayout.findViewById(R.id.textHelloWorld);
		txtView.setText(item.getTitle());
	}
	
	
}
