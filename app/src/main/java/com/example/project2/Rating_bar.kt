package com.example.project2

import android.os.Bundle
import android.widget.RatingBar
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Rating_bar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_rating_bar)
        var ratingBar=findViewById<RatingBar>(R.id.ratingBar2)

    }
}