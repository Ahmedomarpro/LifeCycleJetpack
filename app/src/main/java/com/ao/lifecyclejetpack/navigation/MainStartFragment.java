package com.ao.lifecyclejetpack.navigation;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.ao.lifecyclejetpack.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainStartFragment extends Fragment {


	public MainStartFragment() {
		// Required empty public constructor
	}


	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
							 Bundle savedInstanceState) {
		// Inflate the layout for this fragment
		return inflater.inflate(R.layout.fragment_main_start, container, false);
	}

	@Override
	public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
		super.onViewCreated(view, savedInstanceState);

		Button button = view.findViewById(R.id.btnNavigation);
		button.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.oneFragment));


	}
}
