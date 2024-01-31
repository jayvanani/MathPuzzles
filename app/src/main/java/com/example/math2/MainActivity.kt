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
    lateinit var puzzle:TextView

    var i=1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        continuee=findViewById(R.id.continuee)
        puzzle=findViewById(R.id.puzzle)


        continuee.setOnClickListener {

            var Intent=Intent(this@MainActivity,MainActivity2::class.java)
            Intent.putExtra("puzzleindex",i)
            startActivity(Intent)
        }
        puzzle.setOnClickListener {

            var Intent=Intent(this@MainActivity,MainActivity4::class.java)
            startActivity(Intent)
        }

    }
}