package com.ao.lifecyclejetpack.fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.ao.lifecyclejetpack.R;

public class MainFragment extends AppCompatActivity implements View.OnClickListener {


	protected Button button2;
	protected Button button3;
	protected FrameLayout fragmentContainer;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		super.setContentView(R.layout.activity_main_fragment);

		/*BlankFragment d = new BlankFragment();
		getSupportFragmentManager()
				.beginTransaction()
				.replace(android.R.id.content,d)
				.addToBackStack("")
				.commit();
*/


		initView();


	}

	@Override
	public void onClick(View view) {
		if (view.getId() == R.id.button2) {

			BlankFragment fragment = new BlankFragment();
			getSupportFragmentManager()
					.beginTransaction()
					.replace(R.id.fragment_container, fragment)
					.commit();
		} else if (view.getId() == R.id.button3) {

			BlankFragment2 fragment = new BlankFragment2();
			getSupportFragmentManager()
					.beginTransaction()
					.replace(R.id.fragment_container, fragment)
					.commit();
		}
	}

	private void initView() {
		button2 = (Button) findViewById(R.id.button2);
		button2.setOnClickListener(MainFragment.this);
		button3 = (Button) findViewById(R.id.button3);
		button3.setOnClickListener(MainFragment.this);
		fragmentContainer = (FrameLayout) findViewById(R.id.fragment_container);
	}
}
