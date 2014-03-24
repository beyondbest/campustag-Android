package com.ccsr.surrey.campustag;
/*
 * Copyright (C) 2014 by Centre for Communication Systems Research (CCSR), University of Surrey
 * 
 * Author: Jihoon Yang <j.yang@surrey.ac.uk> <jihoon.yang@gmail.com>
 */	

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		final Button loadButton = (Button) findViewById(R.id.button1);
		loadButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				startActivity(new Intent(MainActivity.this,
						AndroidHttpsClientJSONActivity.class));
			}
		});
	}
}