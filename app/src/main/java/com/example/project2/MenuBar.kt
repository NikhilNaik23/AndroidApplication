package com.example.project2

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class MenuBar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu_bar)
        val toolBar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolBar)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.i1 -> {
                Toast.makeText(this, "One is Clicked!", Toast.LENGTH_LONG).show()
                true
            }
            R.id.i2 -> {
                Toast.makeText(this, "Two is Clicked!", Toast.LENGTH_LONG).show()
                true
            }
            R.id.i3 -> {
                Toast.makeText(this, "Three is Clicked!", Toast.LENGTH_LONG).show()
                true
            }
            R.id.i4 -> {
                Toast.makeText(this, "Four is Clicked!", Toast.LENGTH_LONG).show()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}
