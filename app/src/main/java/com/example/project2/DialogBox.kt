package com.example.project2

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DialogBox : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_dialog_box)
        var btn=findViewById<Button>(R.id.button24)
        btn.setOnClickListener {
            var cus=LayoutInflater.from(this).inflate(R.layout.activity_customized_dialog_box,null)
            var a=AlertDialog.Builder(this).setView(cus)

            a.setPositiveButton("subscribe"){dialog,_->
                var mail=cus.findViewById<EditText>(R.id.edtxt)
                var m=mail.text.toString()
                if(m.isNotBlank())
                {
                    Toast.makeText(this,"$m",Toast.LENGTH_LONG).show()
                }
                else{
                    Toast.makeText(this,"Enter a valid mail address",Toast.LENGTH_LONG).show()
                }
                dialog.dismiss()
            }
            a.setNegativeButton("Cancel"){dialog,_->
                dialog.dismiss()
            }
            a.create().show()
        }
    }
}