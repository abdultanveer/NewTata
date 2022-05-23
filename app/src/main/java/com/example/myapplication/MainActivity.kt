package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity(), View.OnClickListener { //MainActivity = GEAppliances
    lateinit var submitButton : Button   //Button submitButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        submitButton = findViewById(R.id.btnSubmit)

        submitButton.setOnClickListener(this) //wiring

    }

    override fun onClick(view: View?) {  //switchOne()
        Toast.makeText(this,"clicked",Toast.LENGTH_SHORT).show()
    }
}