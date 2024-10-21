package com.example.project2

import android.content.Intent
import android.graphics.drawable.BitmapDrawable
import android.net.Uri
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageButton
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.project2.snackbarGrid.NextPage

class Portfolio : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_portfolio)
        val toolBar=findViewById<Toolbar>(R.id.toolbar3)
        setSupportActionBar(toolBar)

        val academicsBtn = findViewById<ImageButton>(R.id.academics)
        academicsBtn.setOnClickListener {
            val intent = Intent(this, Portfolio_nextPage::class.java)
            startActivity(intent)
        }

        val certiBtn=findViewById<ImageButton>(R.id.certifications)
        certiBtn.setOnClickListener {
            val intent = Intent(this, Certifications::class.java)
            startActivity(intent)
        }

        val hobbiesBtn=findViewById<ImageButton>(R.id.hobbies)
        hobbiesBtn.setOnClickListener {
            val intent = Intent(this, Hobbies::class.java)
            startActivity(intent)
        }

        val projectBtn=findViewById<ImageButton>(R.id.projects)
        projectBtn.setOnClickListener {
            val intent = Intent(this, Hobbies::class.java)
            startActivity(intent)
        }

        val skillBtn=findViewById<ImageButton>(R.id.skills)
        skillBtn.setOnClickListener {
            val intent = Intent(this, Skills::class.java)
            startActivity(intent)
        }

    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.portfolio_menu_bar, menu)
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.email -> {
                val i1= Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:nikhil23@gmail.com"))
                startActivity(i1)
                true
            }
            R.id.contact -> {
                val i1= Intent(Intent.ACTION_DIAL, Uri.parse("tel:7386776735"))
                startActivity(i1)
                true
            }
            R.id.feedback -> {
                val feedbackIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.example.com/feedback-form"))
                startActivity(feedbackIntent)
                true
            }

            else -> super.onOptionsItemSelected(item)
        }
    }
}