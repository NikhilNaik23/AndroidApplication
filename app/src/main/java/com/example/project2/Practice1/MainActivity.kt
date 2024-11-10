package com.example.project2.Practice1

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.project2.R

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main5)
        var btn=findViewById<Button>(R.id.button)
        btn.setOnClickListener {
            var d= LayoutInflater.from(this).inflate(R.layout.dialog_box_language,null)
            var g=AlertDialog.Builder(this).setView(d)
            var listview1=d.findViewById<ListView>(R.id.lstvw)
            var arr= arrayOf("English","Russian","Danish","French","Italian")

            val initialAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,arr)
            listview1.adapter=initialAdapter


            g.create().show()
        }
    }
}