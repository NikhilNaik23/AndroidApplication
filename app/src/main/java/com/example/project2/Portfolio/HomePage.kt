package com.example.project2.Portfolio

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.PopupMenu
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.net.toUri
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.project2.PopUpMenu
import com.example.project2.R

class HomePage : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home_page)
        val toolBar = findViewById<Toolbar>(R.id.toolbar3)
        setSupportActionBar(toolBar)

        val academics=findViewById<ImageButton>(R.id.aca)
        val certifications=findViewById<ImageButton>(R.id.cer)
        val skills=findViewById<ImageButton>(R.id.skills)
        val projects=findViewById<ImageButton>(R.id.pro)
        val gall=findViewById<ImageButton>(R.id.gallery)
        val hobbies=findViewById<ImageButton>(R.id.hob)

        academics.setOnClickListener {
            val i =Intent(this,Academics::class.java)
            startActivity(i)
        }
        certifications.setOnClickListener {
            val i=Intent(this,Certifications::class.java)
            startActivity(i)
        }
        skills.setOnClickListener {
            val i=Intent(this,Skills::class.java)
            startActivity(i)
        }
        projects.setOnClickListener {
            val i = Intent(this,Projects::class.java)
            startActivity(i)
        }
        gall.setOnClickListener {
            val i =Intent(this,Gallery::class.java)
            startActivity(i)
        }
        hobbies.setOnClickListener {
            val i =Intent(this,Hobbies::class.java)
            startActivity(i)
        }

        var btn=findViewById<Button>(R.id.btn)
        btn.setOnClickListener {
            val n=PopupMenu(this,btn)
            val m:MenuInflater=n.menuInflater
            m.inflate(R.menu.portfolio_popup_menu,n.menu)
            n.setOnMenuItemClickListener { item:MenuItem->
                when(item.itemId){
                    R.id.acad->{
                        val i =Intent(this,Academics::class.java)
                        startActivity(i)
                        true
                    }
                    R.id.cert->{
                        val i =Intent(this,Certifications::class.java)
                        startActivity(i)
                        true
                    }
                    R.id.proj->{
                        val i =Intent(this,Projects::class.java)
                        startActivity(i)
                        true
                    }
                    R.id.feed->{
                        val i=Intent(this,Feedback::class.java)
                        startActivity(i)
                        true
                    }
                    else->false
                }
            }
            n.show()
        }
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
            R.id.exit->{
                val b=AlertDialog.Builder(this)
                b.setTitle("Exit")
                b.setMessage("Are you sure you want to exit ?")
                b.setPositiveButton("Yes"){dialog,_->
                    finish()
                }
                b.setNegativeButton("No"){dialog,_->
                    dialog.dismiss()
                }
                b.create().show()
                true
            }

            else -> super.onOptionsItemSelected(item)
        }
    }

}