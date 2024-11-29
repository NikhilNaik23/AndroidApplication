package com.example.project2.Practice2

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.project2.R

class Activity_1 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_1)
        var name = findViewById<EditText>(R.id.edt1)
        var phno = findViewById<EditText>(R.id.edt2)
        var btn = findViewById<Button>(R.id.btn)
        btn.setOnClickListener {

            Toast.makeText(this,"Calling ${name.text}",Toast.LENGTH_SHORT).show()
            val i = Intent(Intent.ACTION_DIAL, Uri.parse("tel:${phno.text}"))
            startActivity(i)
        }
    }
}