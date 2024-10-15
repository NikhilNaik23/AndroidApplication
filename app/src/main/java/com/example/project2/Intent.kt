package com.example.project2

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.project2.R.*
import android.content.Intent
import android.net.Uri

class Intent : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(layout.activity_intent)
        // Explicit Intent
        val explicitBtn=findViewById<Button>(R.id.button1)
        val implicitBtn=findViewById<Button>(R.id.button2)
        explicitBtn.setOnClickListener {
            val i=Intent(this,IntentNextActivity::class.java)
            startActivity(i)
        }

        //Implicit Intent
        implicitBtn.setOnClickListener {
            val url="https://www.google.com"
            val i=Intent(Intent.ACTION_VIEW)
            i.data= Uri.parse(url)
            startActivity(i)

        }
    }
}