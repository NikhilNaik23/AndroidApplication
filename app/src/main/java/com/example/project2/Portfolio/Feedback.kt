package com.example.project2.Portfolio

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.project2.R

class Feedback : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_feedback)
        val feedbackBtn=findViewById<Button>(R.id.button17)
        feedbackBtn.setOnClickListener {
            Toast.makeText(this, "Feedback Submitted!", Toast.LENGTH_SHORT).show()
        }
    }
}