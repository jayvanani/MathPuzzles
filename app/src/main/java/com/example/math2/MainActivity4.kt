package com.example.math2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView
import android.widget.ListView

class MainActivity4 : AppCompatActivity() {


    lateinit var ListLevels: GridView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)


        ListLevels=findViewById(R.id.ListLevels)

        var adapter=Myclass(this@MainActivity4)

        ListLevels.adapter= adapter




    }
}