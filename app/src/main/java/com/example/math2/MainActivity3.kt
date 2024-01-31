package com.example.math2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity3 : AppCompatActivity() {

    lateinit var continueee:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        continueee=findViewById(R.id.continueee)
        continueee.setOnClickListener {

        }
    }
}