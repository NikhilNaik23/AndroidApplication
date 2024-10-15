package com.example.project2.snackbarGrid

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.project2.R
import com.example.project2.R.*


class NextPage : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(layout.activity_next_page)
        val intent = intent
        val value = intent.getStringExtra("text")
        val txtvw=findViewById<TextView>(id.txtvw_2)
        txtvw.text = value
    }
}