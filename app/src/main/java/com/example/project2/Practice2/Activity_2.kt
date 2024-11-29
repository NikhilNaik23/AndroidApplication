package com.example.project2.Practice2

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.project2.R
import java.util.Locale

class Activity_2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_2)
        var edt = findViewById<EditText>(R.id.edt)
        var spin = findViewById<Spinner>(R.id.spinner)
        var btn = findViewById<Button>(R.id.btn)
        var txt = findViewById<TextView>(R.id.txt)
        btn.setOnClickListener {
            var name = edt.text.toString()
            txt.text="${resources.getString(R.string.txt)} $name"
        }
        var options = listOf("Japanese","Korean","Spanish")
        var a = ArrayAdapter(this,android.R.layout.simple_spinner_item,options)
        a.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spin.adapter = a
        spin.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                var langCode = "en"
                when(p2)
                {
                    0 -> langCode="ja"
                    1 -> langCode="ko"
                    2 -> langCode="es"
                    else->langCode="en"
                }
                setLocale(langCode)
                var name = edt.text.toString()
                txt.text="${resources.getString(R.string.txt)} $name"
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }
    }

    fun setLocale(langCode: String) {
        var currentLang = resources.configuration.locales.get(0).language
        if(currentLang!=langCode)
        {
            var l = Locale(langCode)
            Locale.setDefault(l)
            val c=resources.configuration
            c.setLocale(l)
            resources.updateConfiguration(c,resources.displayMetrics)
            recreate()
        }

    }
}