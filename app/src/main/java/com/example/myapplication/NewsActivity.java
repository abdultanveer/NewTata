package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.myapplication.fragments.HeadlinesFragment;
import com.example.myapplication.fragments.NewsFragment;

public class NewsActivity extends AppCompatActivity implements HeadlinesFragment.HeadLinesSelectListener {
    HeadlinesFragment headlinesFragment;
    public static String TAG = NewsActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
        headlinesFragment = HeadlinesFragment.newInstance("one", "one"); //creating a fragment dynamically



    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"onstart");
    }

    @Override
    public void onHeadlineSelected(String headline) {
        //check if the app has been launched on a phone or a tablet..
           //if news fragment is not null then the app is on tablet else its on phone
        NewsFragment newsFragment = (NewsFragment) getSupportFragmentManager().findFragmentById(R.id.fragmentNews);
        newsFragment.setText(headline);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
         super.onCreateOptionsMenu(menu);
         getMenuInflater().inflate(R.menu.news_menu,menu);
         return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
         super.onOptionsItemSelected(item);
         switch (item.getItemId()){
             case R.id.add_frag_menu:
                 addHeadlinesFragment();
                 break;
             case R.id.remove_frag:
                 removeHeadLinesFragment();
                 break;
         }
        return true;

    }

    private void removeHeadLinesFragment() {
        getSupportFragmentManager().beginTransaction().remove(headlinesFragment).commit();
    }

    private void addHeadlinesFragment() {
        //on the tablet both the fragments would be there
        //but on the phone there won't be any fragment
        //check if the app has been launched on a phone or a tablet..
        //if news fragment is not null then the app is on tablet else its on phone
        if(getSupportFragmentManager().findFragmentById(R.id.fragmentNews) == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.fragment_container, headlinesFragment, "Headlinesfragmentphone")
                    .commit(); //adding fragment on the fly/dynammically
        }
    }
}