package com.example.myapplication.fragments;

import android.os.Bundle;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.example.myapplication.R;

/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
public class NewsFragment extends Fragment {
TextView tvNews;

    public NewsFragment() {
        // Required empty public constructor
    }





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View fragment = inflater.inflate(R.layout.fragment_news, container, false);
        tvNews = fragment.findViewById(R.id.tvNews);
        return fragment;
    }

    public void setText(String headline) {
        Toast.makeText(getActivity(), "newsfrag-- "+headline, Toast.LENGTH_SHORT).show();
        tvNews.setText(headline);

    }
}