package com.ao.lifecyclejetpack.fragment;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.ao.lifecyclejetpack.R;


public class BlankFragment2 extends Fragment {


	public BlankFragment2() {
		// Required empty public constructor
	}


	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
							 Bundle savedInstanceState) {
		// Inflate the layout for this fragment
		View view = inflater.inflate(R.layout.fragment_blank_fragment2, container, false);

		Button btn2 = view.findViewById(R.id.frag2);
		btn2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Toast.makeText(getContext(), "BlankFragment(2)", Toast.LENGTH_SHORT).show();

 			}
		});
		return view;
	}
}
