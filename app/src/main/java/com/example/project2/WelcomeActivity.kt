package com.example.project2

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class WelcomeActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_welcome)
        val nameTxt=findViewById<TextView>(R.id.nametxtvw)
        val genderTxt=findViewById<TextView>(R.id.gendertxtvw)
        val intent = intent
        nameTxt.text= intent.getStringExtra("Name")
        genderTxt.text=intent.getStringExtra("Gender")
    }
}