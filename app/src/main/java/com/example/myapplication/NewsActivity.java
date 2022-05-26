package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.myapplication.fragments.HeadlinesFragment;

public class NewsActivity extends AppCompatActivity implements HeadlinesFragment.HeadLinesSelectListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
    }

    @Override
    public void onHeadlineSelected(String headline) {
        Toast.makeText(this, headline, Toast.LENGTH_SHORT).show();

    }
}