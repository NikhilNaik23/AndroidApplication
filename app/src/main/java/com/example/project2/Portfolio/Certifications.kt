package com.example.project2.Portfolio

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.project2.R

class Certifications : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_certifications)
        val certi1=findViewById<ImageButton>(R.id.certi1)
        val certi2=findViewById<ImageButton>(R.id.certi2)
        val certi3=findViewById<ImageButton>(R.id.certi3)
        val certi4=findViewById<ImageButton>(R.id.certi4)
        val btn=findViewById<Button>(R.id.btn)
        btn.setOnClickListener {
            finish()
        }
        certi1.setOnClickListener {
            val i= Intent(Intent.ACTION_VIEW, Uri.parse("https://certificate.codingninjas.com/verify/48e4c04fd1113369"))
            startActivity(i)
        }

        certi2.setOnClickListener {
            val i= Intent(Intent.ACTION_VIEW, Uri.parse("https://certificate.codingninjas.com/verify/86093cd584b8b631"))
            startActivity(i)
        }

        certi3.setOnClickListener {
            val i= Intent(Intent.ACTION_VIEW, Uri.parse("https://trainings.internshala.com/verify-certificate/?certificate_number=hrq3ph8gbgm"))
            startActivity(i)
        }
        certi4.setOnClickListener {
            val i= Intent(Intent.ACTION_VIEW, Uri.parse("https://certificate.codingninjas.com/view/eed946e43c232986"))
            startActivity(i)
        }
    }
}