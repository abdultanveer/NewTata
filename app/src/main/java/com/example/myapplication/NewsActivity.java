package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Fragment;
import android.os.Bundle;
import android.widget.Toast;

import com.example.myapplication.fragments.HeadlinesFragment;
import com.example.myapplication.fragments.NewsFragment;

public class NewsActivity extends AppCompatActivity implements HeadlinesFragment.HeadLinesSelectListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
        //on the tablet both the fragments would be there
        //but on the phone there won't be any fragment
        //check if the app has been launched on a phone or a tablet..
              //if news fragment is not null then the app is on tablet else its on phone
        if(getSupportFragmentManager().findFragmentById(R.id.fragmentNews) == null) {
            HeadlinesFragment headlinesFragment = HeadlinesFragment.newInstance("one", "one"); //creating a fragment dynamically
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.fragment_container, headlinesFragment, "Headlinesfragmentphone")
                    .commit(); //adding fragment on the fly/dynammically
        }
    }

    @Override
    public void onHeadlineSelected(String headline) {
        //check if the app has been launched on a phone or a tablet..
           //if news fragment is not null then the app is on tablet else its on phone
        NewsFragment newsFragment = (NewsFragment) getSupportFragmentManager().findFragmentById(R.id.fragmentNews);
        newsFragment.setText(headline);
    }
}