package com.example.project2

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar

class SnackBar : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_snack_bar)
        val btn=findViewById<Button>(R.id.showSnackBar)
        btn.setOnClickListener { view ->
            Snackbar.make(view,"This is a Snackbar!", Snackbar.LENGTH_LONG).setAction("undo") {
                Toast.makeText(this, "undo was clicked!", Toast.LENGTH_LONG).show()
            }.show()
        }
    }
}