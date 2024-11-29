package com.example.project2

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.content.Intent

class AppChooser : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_app_chooser)
        val btn=findViewById<Button>(R.id.sendBtn)
        btn.setOnClickListener {
            shareTxt("Hello, Share this message")
        }
    }
    fun shareTxt(txt: String) {
        val title = "Share via"
        val send = Intent().apply {
            action = Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, txt)
            putExtra(Intent.EXTRA_TITLE, title)
            type = "text/plain"
        }
        val chooser = Intent.createChooser(send,title)
        startActivity(chooser)
    }

}