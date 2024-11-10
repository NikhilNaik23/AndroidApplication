package com.example.project2.Portfolio

import android.annotation.SuppressLint
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.project2.Intent
import com.example.project2.R

class Projects : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_projects)
        val projectLink=findViewById<Button>(R.id.button1)
        val back=findViewById<Button>(R.id.btn)
        back.setOnClickListener { finish() }
        projectLink.setOnClickListener {
            val i=android.content.Intent(android.content.Intent.ACTION_VIEW, Uri.parse("https://github.com/NikhilNaik23/Coffe-Insights-Tableau"))
            startActivity(i)
        }
    }
}