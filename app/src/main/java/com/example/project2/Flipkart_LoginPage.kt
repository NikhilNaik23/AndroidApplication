package com.example.project2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Flipkart_LoginPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_flipkart_login_page)
        var edtvw_1=findViewById<EditText>(R.id.edtvw1)
        var edtvw_2=findViewById<EditText>(R.id.edtvw2)
        var btn=findViewById<Button>(R.id.btn_2)
        btn.setOnClickListener{
            var i=Intent(this,MainActivity2::class.java)
            startActivity(i)
        }
    }
}