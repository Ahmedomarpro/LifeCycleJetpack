package com.ao.lifecyclejetpack.navigation;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ao.lifecyclejetpack.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class OneFragment extends Fragment {


		public OneFragment() {
			// Required empty public constructor
		}


	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
							 Bundle savedInstanceState) {
		// Inflate the layout for this fragment
			return inflater.inflate(R.layout.fragment_one, container, false);
	}

}
