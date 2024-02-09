package com.example.math2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class WinningPage : AppCompatActivity() {


    lateinit var continueee:Button
    lateinit var winninglevel:TextView
    lateinit var mainmenu:Button


    @SuppressLint("SuspiciousIndentation", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.winningpage)

        continueee=findViewById(R.id.continueee)
        winninglevel=findViewById(R.id.winninglevel)
        mainmenu=findViewById(R.id.mainmenu)



        var value=intent.getIntExtra("puzzleindex",0)

        winninglevel.setText("Level ${value-1} completed")
        continueee.setOnClickListener {

            Log.d("-----", "onCreate: $value")

            var intent=Intent(this@WinningPage,GamePage::class.java)
            intent.putExtra("puzzleindex", value)

            startActivity(intent)

        }
        mainmenu.setOnClickListener {

            intent=Intent(this@WinningPage,HomePage::class.java)
            startActivity(intent)

        }
    }
}