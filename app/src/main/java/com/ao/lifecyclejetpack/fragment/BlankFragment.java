package com.ao.lifecyclejetpack.fragment;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.ao.lifecyclejetpack.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {


	public BlankFragment() {
		// Required empty public constructor
	}


	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
							 Bundle savedInstanceState) {
		// Inflate the layout for this fragment
	final 	View view = inflater.inflate(R.layout.fragment_blank, container, false);

		Button button = view.findViewById(R.id.btn);

		button.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Toast.makeText(getContext(), "BlankFragment", Toast.LENGTH_SHORT).show();

				/*getChildFragmentManager()
						.beginTransaction()
						.replace(R.id.fragment_container,new BlankFragment2())
						.addToBackStack("")
						.commit();*/

			}
		});


		return view;

	}

	@Override
	public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
		super.onViewCreated(view, savedInstanceState);



 	}
}
