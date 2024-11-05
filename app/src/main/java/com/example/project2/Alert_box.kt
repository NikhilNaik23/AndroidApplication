package com.example.project2

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Alert_box : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_alert_box)
        val btn=findViewById<Button>(R.id.button22)
        btn.setOnClickListener {
            var b=AlertDialog.Builder(this)
            b.setTitle("Rate Now")
            b.setMessage("Feedback time")
            b.setCancelable(false) //dialog box will not be cancelled, if we click on screen anywhere.
            b.setPositiveButton("Yes"){dialog,_->
                var i= Intent(this,RatingBar::class.java)
                startActivity(i)
            }
            b.setNegativeButton("No"){dialog,_->dialog.dismiss()}
            b.setNeutralButton("Maybe Later"){dialog,_-> Toast.makeText(this,"Ok later",Toast.LENGTH_LONG).show()}
            b.create().show()
        }
    }
}