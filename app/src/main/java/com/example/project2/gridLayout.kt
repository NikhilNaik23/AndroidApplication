package com.example.project2

import android.os.Bundle
import android.provider.MediaStore.Images
import android.widget.ImageButton
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class gridLayout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_grid_layout)
        var a=findViewById<ImageButton>(R.id.imageButton4)
        var b=findViewById<ImageButton>(R.id.imageButton5)
        a.setOnClickListener {
            Toast.makeText(this,"first image view button clicked",Toast.LENGTH_LONG).show()
        }
        b.setOnClickListener {
            Toast.makeText(this,"second image view button clicked",Toast.LENGTH_LONG).show()
        }
    }
}
//By using grid layout create a calculator