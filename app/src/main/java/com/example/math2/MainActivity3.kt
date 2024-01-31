package com.example.math2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.sax.StartElementListener
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {

    lateinit var continueee:Button
    lateinit var winninglevel:TextView

    @SuppressLint("SuspiciousIndentation", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        continueee=findViewById(R.id.continueee)
        winninglevel=findViewById(R.id.winninglevel)
        var value=intent.getIntExtra("puzzleindex",0)
        winninglevel.setText("Level ${value-1} completed")
        continueee.setOnClickListener {


            Log.d("-----", "onCreate: $value")
            var intent=Intent(this@MainActivity3,MainActivity2::class.java)
              intent.putExtra("puzzleindex", value)

            startActivity(intent)

        }
    }
}