package com.example.project2.snackbarGrid

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.project2.R
import com.google.android.material.snackbar.Snackbar

class CoordinatorLayout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_coordinator_layout)
        val btn=findViewById<Button>(R.id.button4)
        btn.setOnClickListener {view ->
            Snackbar.make(view,"Click Here!",Snackbar.LENGTH_LONG).setAction("Open")
            {

            }.show()
        }
    }
}