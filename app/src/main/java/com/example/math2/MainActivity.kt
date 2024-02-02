package com.example.math2

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    companion object {
        lateinit var sp: SharedPreferences
        lateinit var edit: SharedPreferences.Editor

    }

    lateinit var continuee: TextView
    lateinit var puzzle: TextView

    var i = 1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        continuee = findViewById(R.id.continuee)
        puzzle = findViewById(R.id.puzzle)

        sp = getSharedPreferences("level", MODE_PRIVATE)
        edit = sp.edit()

        i = sp.getInt("levelboard", 0)



        continuee.setOnClickListener {

            var Intent = Intent(this@MainActivity, MainActivity2::class.java)
            Intent.putExtra("puzzleindex", i)
            startActivity(Intent)
        }
        puzzle.setOnClickListener {

            var Intent = Intent(this@MainActivity, MainActivity4::class.java)
            startActivity(Intent)
        }

    }
}