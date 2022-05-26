package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class UiTestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ui_test);
    }

    public void getData(View view) {
        EditText etData = findViewById(R.id.etData);
        String data = etData.getText().toString();
        TextView tvData = findViewById(R.id.tvData);
        tvData.setText(data);
    }
}