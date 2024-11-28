package com.example.project2

import android.annotation.SuppressLint
import android.content.res.Configuration
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.Locale

class AppLocalization1 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_app_localization1)
        var engbtn=findViewById<Button>(R.id.button25)
        var hinbtn=findViewById<Button>(R.id.button26)
        engbtn.setOnClickListener {
            setLocale("en")
        }
        hinbtn.setOnClickListener {
            setLocale("hi")
        }
        var telbtn=findViewById<Button>(R.id.button27)
        telbtn.setOnClickListener {
            setLocale("te")
        }
    }
    fun setLocale(langCode:String)
    {
        val currentLang = resources.configuration.locales.get(0).language
        if(langCode != currentLang)
        {
            val l = Locale(langCode)
            Locale.setDefault(l)
            val c = Configuration(resources.configuration)
            c.setLocale(l)
            resources.updateConfiguration(c,resources.displayMetrics)
        }
        recreate()
    }
}