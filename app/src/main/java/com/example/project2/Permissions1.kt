package com.example.project2

import android.annotation.SuppressLint
import android.content.pm.PackageManager
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Permissions1 : AppCompatActivity() {
    val c = 1
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_permissions1)
        val btn = findViewById<Button>(R.id.button28)
        btn.setOnClickListener {
            if( ContextCompat.checkSelfPermission(this,android.Manifest.permission.CAMERA) == PackageManager.PERMISSION_DENIED )
            {
                ActivityCompat.requestPermissions(this, arrayOf(android.Manifest.permission.CAMERA),c)
            }
            else{
                Toast.makeText(this,"Camera Permission already granted",Toast.LENGTH_LONG).show()
            }
        }
    }
        override fun onRequestPermissionsResult(
            requestCode: Int,
            permissions: Array<out String>,
            grantResults: IntArray
        ) {
            super.onRequestPermissionsResult(requestCode, permissions, grantResults)
            if(requestCode == c)
            {
                if(grantResults[0] == PackageManager.PERMISSION_GRANTED){
                    Toast.makeText(this,"Camera permission granted",Toast.LENGTH_LONG).show()
                }
                else{
                    Toast.makeText(this,"Camera Permission Denied",Toast.LENGTH_LONG).show()
                }
            }
        }
    }
