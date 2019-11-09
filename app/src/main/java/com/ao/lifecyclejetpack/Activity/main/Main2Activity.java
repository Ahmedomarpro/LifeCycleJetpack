package com.ao.lifecyclejetpack.Activity.main;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.ao.lifecyclejetpack.R;

public class Main2Activity extends AppCompatActivity {
	public static final String TAG = "KeyError";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main2);
	}

	@Override
	protected void onStart() {
		super.onStart();
		error("OnStart");
	}

	@Override
	protected void onResume() {
		super.onResume();

		error("Resume");
	}

	@Override
	protected void onPause() {
		super.onPause();
		error("Pause");
	}

	@Override
	protected void onStop() {
		super.onStop();
		error("onStop");
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		error("Destroy");
		finish();
	}


	@Override
	public void onBackPressed() {
		super.onBackPressed();

		//finish();
		error("BackPressed");
	}

	@Override
	protected void onRestart() {
		super.onRestart();

		error("Restart");

	}

	@Override
	public int getTaskId() {
		error("TaskId");
		return super.getTaskId();

	}

	public void error(String message) {
		Log.e(TAG, message);
	}

	public void to(View view) {
		startActivity(new Intent(Main2Activity.this, MainActivity.class));
		finish();
	}
}
