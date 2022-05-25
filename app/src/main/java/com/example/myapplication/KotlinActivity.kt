package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class KotlinActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin)
    }

    fun handleClicks(myview: View) {
        when(myview.id){
            R.id.myBtn -> {Toast.makeText(this,"submit clicked",Toast.LENGTH_SHORT).show()}
            R.id.otherButton -> {Toast.makeText(this,"other clicked",Toast.LENGTH_SHORT).show()}
        }


    }
}