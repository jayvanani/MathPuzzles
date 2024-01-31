package com.example.math2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var continuee: TextView


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        continuee=findViewById(R.id.continuee)


        continuee.setOnClickListener {

            var Intent=Intent(this@MainActivity,MainActivity2::class.java)

            startActivity(Intent)
        }

    }
}