package com.example.androidtest;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
	public static final int ITEM0 = Menu.FIRST;// 系统值
	public static final int ITEM1 = Menu.FIRST + 1;
	public static final int ITEM2 = Menu.FIRST + 2;
	public static final int ITEM3 = Menu.FIRST + 3;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// --- 文本 ---
		TextView textHelloWorld = (TextView) findViewById(R.id.textHelloWorld);
		textHelloWorld.setText(R.string.hello_world);

		// --- 按钮 ---
		// http://www.uzzf.com/news/7399.html
		Button btnChangeText = (Button) findViewById(R.id.btnChangeText);
		Button btnBack = (Button) findViewById(R.id.btnBack);
		// TestListener为继承View.OnClickListener的类
		btnChangeText.setOnClickListener(new BtnClickListener());
		btnBack.setOnClickListener(new BtnClickListener());
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		menu.add(0, ITEM0, 0, "進む");
		menu.add(0, ITEM1, 0, "戻す");
		menu.add(0, ITEM2, 0, "新建");
		menu.add(0, ITEM3, 0, "打开");
		menu.findItem(ITEM1);// 可以设置按钮的背景
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
