package com.example.project2.snackbarGrid

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.project2.R
import com.google.android.material.snackbar.Snackbar

class SnackbarGridLayout : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_snackbar_grid_layout)
        val btn1 = findViewById<ImageButton>(R.id.imageButton13)
        val btn2 = findViewById<ImageButton>(R.id.imageButton14)
        val btn3 = findViewById<ImageButton>(R.id.imageButton15)
        val btn4 = findViewById<ImageButton>(R.id.imageButton16)
        val btn5 = findViewById<ImageButton>(R.id.imageButton17)
        val btn6 = findViewById<ImageButton>(R.id.imageButton18)
        val btn7 = findViewById<ImageButton>(R.id.imageButton19)
        val btn8 = findViewById<ImageButton>(R.id.imageButton20)
        val btn9 = findViewById<ImageButton>(R.id.imageButton21)



        btn1.setOnClickListener { view ->
            Snackbar.make(view,"Click here!", Snackbar.LENGTH_LONG).setAction("open") {
                var i = Intent(this,NextPage::class.java)
                i.putExtra("text", "Welcome to School of Computer Science and Engineering");
                startActivity(i)
            }.show()

        }


        btn2.setOnClickListener { view ->
            Snackbar.make(view,"Click here!", Snackbar.LENGTH_LONG).setAction("open") {
                var i = Intent(this,NextPage::class.java)
                i.putExtra("text", "Welcome to School of Agriculture");
                startActivity(i)
            }.show()
        }
        btn3.setOnClickListener { view ->
            Snackbar.make(view,"Click here!", Snackbar.LENGTH_LONG).setAction("open") {
                var i = Intent(this,NextPage::class.java)
                i.putExtra("text", "Welcome to School of Business");
                startActivity(i)
            }.show()
        }
        btn4.setOnClickListener { view ->
            Snackbar.make(view,"Click here!", Snackbar.LENGTH_LONG).setAction("open") {
                var i = Intent(this,NextPage::class.java)
                i.putExtra("text", "Welcome to School of Electronics and ELectrical Engineering");
                startActivity(i)
            }.show()
        }
        btn5.setOnClickListener { view ->
            Snackbar.make(view,"Click here!", Snackbar.LENGTH_LONG).setAction("open") {
                var i = Intent(this,NextPage::class.java)
                i.putExtra("text", "Welcome to School of Mechanical Engineering");
                startActivity(i)
            }.show()
        }
        btn6.setOnClickListener { view ->
            Snackbar.make(view,"Click here!", Snackbar.LENGTH_LONG).setAction("open") {
                var i = Intent(this,NextPage::class.java)
                i.putExtra("text", "Welcome to School of Bio Engineering and Biosciences");
                startActivity(i)
            }.show()
        }
        btn7.setOnClickListener { view ->
            Snackbar.make(view,"Click here!", Snackbar.LENGTH_LONG).setAction("open") {
                var i = Intent(this,NextPage::class.java)
                i.putExtra("text", "Welcome to School of Law");
                startActivity(i)
            }.show()
        }
        btn8.setOnClickListener { view ->
            Snackbar.make(view,"Click here!", Snackbar.LENGTH_LONG).setAction("open") {
                var i = Intent(this,NextPage::class.java)
                i.putExtra("text", "Welcome to School of Pharmaceutical Sciences");
                startActivity(i)
            }.show()
        }
        btn9.setOnClickListener { view ->
            Snackbar.make(view,"Click here!", Snackbar.LENGTH_LONG).setAction("open") {
                var i = Intent(this,NextPage::class.java)
                i.putExtra("text", "Welcome to School of Civil Engineering");
                startActivity(i)
            }.show()
        }
    }
}