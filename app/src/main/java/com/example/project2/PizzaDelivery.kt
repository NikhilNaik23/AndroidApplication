package com.example.project2

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PizzaDelivery : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_pizza_delivery)
        var small = findViewById<Button>(R.id.radioButton5)
        var medium=findViewById<Button>(R.id.radioButton4)
        var large=findViewById<Button>(R.id.radioButton2)
        var extraLarge=findViewById<Button>(R.id.radioButton)

        var cheesePizza = findViewById<CheckBox>(R.id.checkBox)
        var tomatoPizza = findViewById<CheckBox>(R.id.checkBox2)
        var onionPizza = findViewById<CheckBox>(R.id.checkBox3)

        var bacon = findViewById<CheckBox>(R.id.checkBox4)
        var serranoPepper= findViewById<CheckBox>(R.id.checkBox6)
        var pineApple = findViewById<CheckBox>(R.id.checkBox7)

        small.setOnClickListener {
            Toast.makeText(this,"Small Size pizza has been selected",Toast.LENGTH_SHORT).show()
        }
        medium.setOnClickListener {
            Toast.makeText(this,"Medium Size pizza has been selected",Toast.LENGTH_SHORT).show()
        }
        large.setOnClickListener {
            Toast.makeText(this,"Large Size pizza has been selected",Toast.LENGTH_SHORT).show()
        }
        extraLarge.setOnClickListener {
            Toast.makeText(this,"Extra Large Size pizza has been selected",Toast.LENGTH_SHORT).show()
        }

        cheesePizza.setOnClickListener {
            Toast.makeText(this,"Cheese pizza has been selected",Toast.LENGTH_SHORT).show()
        }

        tomatoPizza.setOnClickListener {
            Toast.makeText(this,"Tomato pizza has been selected",Toast.LENGTH_SHORT).show()
        }
        onionPizza.setOnClickListener{
            Toast.makeText(this,"Onion pizza has been selected",Toast.LENGTH_LONG).show()
        }

        bacon.setOnClickListener{
            Toast.makeText(this,"Bacon is added",Toast.LENGTH_SHORT).show()
        }
        pineApple.setOnClickListener{
            Toast.makeText(this,"PineApple is added",Toast.LENGTH_SHORT).show()
        }
        serranoPepper.setOnClickListener{
            Toast.makeText(this,"Serrano Pepper is added",Toast.LENGTH_SHORT).show()
        }

    }
}