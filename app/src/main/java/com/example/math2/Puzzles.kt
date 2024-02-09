package com.example.math2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView

class Puzzles : AppCompatActivity() {


    lateinit var ListLevels: GridView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.puzzles)

        ListLevels=findViewById(R.id.ListLevels)

        var adapter=Myclass(this@Puzzles)

        ListLevels.adapter= adapter






    }
}