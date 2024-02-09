package com.example.math2

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class HomePage : AppCompatActivity() {
    companion object {
        lateinit var sp: SharedPreferences
        lateinit var edit: SharedPreferences.Editor

        var skip = "skip"
        var lock = "lock"
        var complete = " complete"
    }

    lateinit var continuee: TextView
    lateinit var puzzle: TextView

    var i = 1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.homepage)


        continuee = findViewById(R.id.continuee)
        puzzle = findViewById(R.id.puzzle)

        sp = getSharedPreferences("level", MODE_PRIVATE)
        edit = sp.edit()

        i = sp.getInt("levelboard", 1)

        for (i in 0 until  50)
        {
            if(sp.getString("level$i", lock).equals(lock)) {
                edit.putString("level$i", lock)
                edit.apply()
            }
        }




        continuee.setOnClickListener {

            var Intent = Intent(this@HomePage, GamePage::class.java)
            Intent.putExtra("puzzleindex", i)
            startActivity(Intent)
        }
        puzzle.setOnClickListener {
            var Intent = Intent(this@HomePage, Puzzles::class.java)
            startActivity(Intent)
        }

    }
}