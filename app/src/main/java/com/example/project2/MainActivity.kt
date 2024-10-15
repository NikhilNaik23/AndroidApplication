package com.example.project2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        var a=findViewById<EditText>(R.id.editTextText)
        var b=findViewById<EditText>(R.id.editTextText2)
        var btn=findViewById<Button>(R.id.button)
        var txtvw=findViewById<TextView>(R.id.textView)

        btn.setOnClickListener {
            var c=a.text.toString()
            var d=b.text.toString()
            txtvw.text="your name is ${c} and your number is ${d}"
        }
    }
}