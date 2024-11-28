package com.example.project2

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import android.view.ContextMenu
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.LinearLayout
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.math.truncate

class Context_menu : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_context_menubar)
        var j1=findViewById<LinearLayout>(R.id.box)
        registerForContextMenu(j1)
    }

    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        super.onCreateContextMenu(menu, v, menuInfo)
        val j2:MenuInflater=menuInflater
        j2.inflate(R.menu.context_menu, menu)
    }


    override fun onContextItemSelected(item: MenuItem): Boolean {
        val j3=findViewById<LinearLayout>(R.id.box)
        return when(item.itemId)
        {
            R.id.change_color -> {
                j3.setBackgroundColor(Color.RED)
                Toast.makeText(this,"background color changed to red",Toast.LENGTH_SHORT).show()
                true
            }
            R.id.rotate -> {
                j3.rotation += 45f
                Toast.makeText(this,"layout rotated by 45 degree",Toast.LENGTH_SHORT).show()
                true
            }
            else->{super.onContextItemSelected(item)}
        }
    }
}