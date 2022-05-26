package com.example.myapplication.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.myapplication.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HeadlinesFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HeadlinesFragment extends Fragment implements AdapterView.OnItemClickListener {
    ListView headlinesLv;

    // TODO: Rename parameter arguments, choose names that match


    public HeadlinesFragment() {
        // Required empty public constructor
    }





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View fragment = inflater.inflate(R.layout.fragment_headlines, container, false);
        headlinesLv = fragment.findViewById(R.id.lvHeadlines);
        headlinesLv.setOnItemClickListener(this);
        return fragment;
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
        String rowText = adapterView.getItemAtPosition(position).toString();
        Toast.makeText(getActivity(), rowText, Toast.LENGTH_SHORT).show();
    }
}