package com.example.project2

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.net.Uri
import android.provider.ContactsContract
import android.provider.MediaStore
import com.google.android.material.internal.NavigationMenu

class ImplicitIntent : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_implicit_intent)
        val urlBtn=findViewById<Button>(R.id.url_btn)
        urlBtn.setOnClickListener {
            val i1= Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"))
            startActivity(i1)
        }
        val callBtn=findViewById<Button>(R.id.call_btn)
        callBtn.setOnClickListener {
            val i1= Intent(Intent.ACTION_DIAL, Uri.parse("tel:112"))
            startActivity(i1)
        }
        val camBtn = findViewById<Button>(R.id.cam_btn)
        camBtn.setOnClickListener {
            val i1=Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(i1)
        }
        val contBtn=findViewById<Button>(R.id.cont_btn)
        contBtn.setOnClickListener {
            val i1 = Intent(Intent.ACTION_PICK,ContactsContract.Contacts.CONTENT_URI)
            startActivity(i1)
        }
        val galBtn=findViewById<Button>(R.id.gal_btn)
        galBtn.setOnClickListener {
            val i1=Intent(Intent.ACTION_VIEW)
            i1.type="image/*"
            startActivity(i1)
        }

        val navBtn=findViewById<Button>(R.id.nav_btn)
        navBtn.setOnClickListener {
            val i1=Intent(Intent.ACTION_MAIN)
            startActivity(i1)
        }
    }
}