package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class RecyclerActivity extends AppCompatActivity {
    public static String TAG = RecyclerActivity.class.getSimpleName();
    String[] subjects = new String[]{"english","hindi","urdu","english","hindi","urdu"}; //plug

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);
        Student abdul = new Student("ansari",123,true);
        abdul.getName();
        RecyclerView subjectRecyclerView = findViewById(R.id.subs_recyclerView); //socket
        subjectRecyclerView.setLayoutManager(new LinearLayoutManager(this)); //arrange the items one below the other
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(subjectRecyclerView.getContext(),
                new LinearLayoutManager(this).getOrientation());
        subjectRecyclerView.addItemDecoration(dividerItemDecoration);

        SubjectsAdapter adapter = new SubjectsAdapter(subjects); //putting the plug into the adapter
        adapter.setOnItemClickListener(new SubjectsAdapter.ClickListener() {
            @Override
            public void onItemClick(int position, View v) {
                Log.d(TAG, "onItemClick position: " + position);

            }
        });
        subjectRecyclerView.setAdapter(adapter); //inserting the adapter into the socket

        Employee employee = new Employee();
        employee.setDob("01-01-01");
        employee.eName = "ansari";

    }

    public int add(int a, int b){
        return a+b;
    }

}