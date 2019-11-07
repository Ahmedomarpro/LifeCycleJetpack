package com.ao.lifecyclejetpack.Activity.main;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.ao.lifecyclejetpack.R;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

	}



	public void OK(View view) {
		startActivity(new Intent(this,Main2Activity.class));
	}

	@Override
	protected void onStart() {
		super.onStart();
	}

	@Override
	protected void onStop() {
		super.onStop();
	}
	@Override
	protected void onResume() {
		super.onResume();
	}

	@Override
	protected void onPause() {
		super.onPause();
	}


	@Override
	protected void onDestroy() {
		super.onDestroy();
	}


	@Override
	public void onBackPressed() {
		super.onBackPressed();
	}

	@Override
	protected void onRestart() {
		super.onRestart();
	}

}

