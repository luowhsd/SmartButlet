package com.sd.luowh.smartbutlet.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sd.luowh.smartbutlet.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ButletFragment extends Fragment {


    public ButletFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_butlet,null);
        return view;
    }

}
