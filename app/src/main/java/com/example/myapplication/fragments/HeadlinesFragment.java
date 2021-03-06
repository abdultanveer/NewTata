package com.example.myapplication.fragments;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.myapplication.NewsActivity;
import com.example.myapplication.R;

/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
public class HeadlinesFragment extends Fragment implements AdapterView.OnItemClickListener {
    ListView headlinesLv;
    HeadLinesSelectListener headLinesSelectListener; //bought a switchboard
    public static String TAG = HeadlinesFragment.class.getSimpleName();

    public interface  HeadLinesSelectListener{
        public void onHeadlineSelected(String headline);
    }

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public HeadlinesFragment() {
        // Required empty public constructor
        Log.i(TAG,"constructor");

    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HeadlinesFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HeadlinesFragment newInstance(String param1, String param2) {
        HeadlinesFragment fragment = new HeadlinesFragment();
        Log.i(TAG,"new instance");

        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG,"oncreate");

        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.i(TAG,"onCreateView");

        View fragment = inflater.inflate(R.layout.fragment_headlines, container, false);
        headlinesLv = fragment.findViewById(R.id.lvHeadlines);
        headlinesLv.setOnItemClickListener(this);
        return fragment;
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
        String rowText = adapterView.getItemAtPosition(position).toString();
        headLinesSelectListener.onHeadlineSelected(rowText); //clicking the switch
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