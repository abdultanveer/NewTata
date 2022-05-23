package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.navigationrail.NavigationRailView;

public class NavRailActivity extends AppCompatActivity implements NavigationBarView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nav_rail);

        NavigationRailView nRailView = findViewById(R.id.navigation_rail);
       nRailView.setOnItemSelectedListener(this);


        }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.home:
                Toast.makeText(this, "home selected", Toast.LENGTH_SHORT).show();
                break;
            case R.id.email:
                Toast.makeText(this, "email selected", Toast.LENGTH_SHORT).show();

                break;
        }
        return true;
    }
}
