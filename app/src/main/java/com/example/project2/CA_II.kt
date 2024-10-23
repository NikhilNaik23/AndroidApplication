package com.example.project2

import android.annotation.SuppressLint
import android.content.Intent
import android.nfc.Tag
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class CA_II : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_ca_ii)
        val name1=findViewById<EditText>(R.id.name)
        val gender1=findViewById<EditText>(R.id.age)
        val btn=findViewById<Button>(R.id.button21)
        btn.setOnClickListener {
            val i= Intent(this,WelcomeActivity::class.java)
            i.putExtra("Name",name1.text.toString())
            i.putExtra("Gender",gender1.text.toString())
            startActivity(i)


            Log.v("Tag","Verbose")
            Log.d("Tag","Debug")
        }
    }
}