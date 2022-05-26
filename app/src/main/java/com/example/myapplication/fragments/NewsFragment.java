package com.example.myapplication.fragments;

import android.content.Context;
import android.os.Bundle;


import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.myapplication.R;

/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
public class NewsFragment extends Fragment {
TextView tvNews;
    public static String TAG = NewsFragment.class.getSimpleName();


    public NewsFragment() {
        // Required empty public constructor
        Log.i(TAG,"constructor");

    }





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.i(TAG,"onCreateView");

        View fragment = inflater.inflate(R.layout.fragment_news, container, false);
        tvNews = fragment.findViewById(R.id.tvNews);
        return fragment;
    }

    public void setText(String headline) {
        Toast.makeText(getActivity(), "newsfrag-- "+headline, Toast.LENGTH_SHORT).show();
        tvNews.setText(headline);

    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.i(TAG,"getting attached to the activity");
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.i(TAG,"onViewCreated");
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.i(TAG,"onActivityCreated");

    }
}