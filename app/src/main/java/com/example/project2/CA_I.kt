package com.example.project2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class CA_I : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_ca_i)
        val edtxt=findViewById<EditText>(R.id.edt_1)
        val btn=findViewById<Button>(R.id.btn_1)
        btn.setOnClickListener {
            Toast.makeText(this,"Welcome Back",Toast.LENGTH_LONG).show();
        }

    }
}