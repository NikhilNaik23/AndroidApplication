package com.example.project2

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class checkBoxShare : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_check_box_share)
        val q1=findViewById<CheckBox>(R.id.quote1)
        val q2=findViewById<CheckBox>(R.id.quote2)
        val q3=findViewById<CheckBox>(R.id.quote3)
        val q4=findViewById<CheckBox>(R.id.quote4)
        val q5=findViewById<CheckBox>(R.id.quote5)



        val btn: Button =findViewById(R.id.shareBtn)
        btn.setOnClickListener {
            if(q1.isChecked)
            {
                sendTxt(q1.text.toString())
            }
            if(q2.isChecked)
            {
                sendTxt(q1.text.toString())
            }
        }
    }
    fun sendTxt(txt:String)
    {
        val send: Intent = Intent().apply {
            action= Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT,txt)
            type="text/plain"
        }
        val chooser= Intent.createChooser(send,"Share via")
        startActivity(chooser)
    }
}