package com.example.myapplication

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.core.app.NotificationCompat

class KotlinActivity : AppCompatActivity() {
    lateinit var notificationManager: NotificationManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin)
        notificationManager =  getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

    }

    fun handleClicks(myview: View) {
        when(myview.id){
            R.id.myBtn -> {Toast.makeText(this,"submit clicked",Toast.LENGTH_SHORT).show()}
            R.id.otherButton -> {
                showNotification()
                //Toast.makeText(this,"other clicked",Toast.LENGTH_SHORT).show()
            }
        }


    }

    //builder -- walls,floor,ceiling,windows--- marble,teak,wifi
    private fun showNotification() {
        createNotificationChannel()
        val intent = Intent(this, BottomSheetActivity::class.java).apply {
            flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        }
        val pendingIntent: PendingIntent = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_IMMUTABLE)
        //an intent that will be fired at a later point in time by OS on behalf of the app -- hotel front desk

        var builder = NotificationCompat.Builder(this, "tata CHANNEL_ID")
            .setSmallIcon(R.drawable.ic_baseline_directions_car_24)
            .setContentTitle("My notification title")
            .setContentText("Much longer content text that cannot fit one line...")
            .setContentIntent(pendingIntent)
            .setPriority(NotificationCompat.PRIORITY_DEFAULT)
        var myNotification: Notification = builder.build()
        notificationManager.notify(123,myNotification) //using this id i can update or remove the existing notification at a later point in time
    }

    private fun createNotificationChannel() {
        // Create the NotificationChannel, but only on API 26+ because
        // the NotificationChannel class is new and not in the support library
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val name = "important"
                //getString(R.string.channel_name)
            val descriptionText = "description"
            //= getString(R.string.channel_description)
            val importance = NotificationManager.IMPORTANCE_DEFAULT
            val channel = NotificationChannel("tata CHANNEL_ID", name, importance).apply {
                description = descriptionText
            }
            // Register the channel with the system
            notificationManager.createNotificationChannel(channel)
        }
    }
}