package com.example.project2

import android.annotation.SuppressLint
import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Logcat : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_logcat)
        var logbtn=findViewById<Button>(R.id.log)
        logbtn.setOnClickListener {
            //Several log levels ( e.g., debug, info, warn, error,etc) that help to categorize the
            Log.v(TAG,"Verbose log: lowest priority, detailed entry, no use during product" )
            Log.d(TAG,"Debug log: highest priority, This is used to debug the app")
            Log.i(TAG,"Info log: moderate level importance, they give information of content")
            Log.w(TAG,"Warning log: This is a warning message for unexpected behaviour")
        }
    }
}