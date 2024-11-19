package com.example.project2.E_learning

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.project2.Intent
import com.example.project2.R

class welcome_page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_welcome_page)
        val btn=findViewById<Button>(R.id.btn)
        btn.setOnClickListener {
            val i= android.content.Intent(this, login_page::class.java)
            startActivity(i)
        }
    }
}