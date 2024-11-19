package com.example.project2

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Button
import android.widget.PopupMenu
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.zip.Inflater

class PopUpMenu : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_pop_up_menu)
        val btn=findViewById<Button>(R.id.button)
        btn.setOnClickListener {
            var n= PopupMenu(this,btn)
            val m: MenuInflater =n.menuInflater
            m.inflate(R.menu.popupmenulayout,n.menu)
            n.setOnMenuItemClickListener { item:MenuItem->
                when(item.itemId){
                    R.id.share->{
                        Toast.makeText(this,"shared",Toast.LENGTH_SHORT).show()
                        true
                    }
                    R.id.delete->{
                        Toast.makeText(this,"deleted",Toast.LENGTH_SHORT).show()
                        true
                    }
                    else->false
                }
            }
            n.show()
        }
    }
}