package com.example.project2.Portfolio

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.net.toUri
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.project2.R

class HomePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home_page)
        val toolBar = findViewById<Toolbar>(R.id.toolbar3)
        setSupportActionBar(toolBar)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.portfolio_menu_bar,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId)
        {
            R.id.email -> {
                val i=Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:nikhilnaik@gmail.com"))
                startActivity(i)
                true
            }

            R.id.contact->{
                val i=Intent(Intent.ACTION_DIAL,Uri.parse("tel:7386776737"))
                startActivity(i)
                true
            }

            R.id.feedback->{
                val i=Intent(this,Feedback::class.java)
                startActivity(i)
                true
            }

            else -> super.onOptionsItemSelected(item)
        }
    }
}