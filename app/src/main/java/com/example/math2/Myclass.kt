package com.example.math2

import android.content.Context
import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class Myclass(var mainActivity4: Context) : BaseAdapter() {
    override fun getCount(): Int {

        return 50

    }

    override fun getItem(position: Int): Any {

        return position
    }

    override fun getItemId(position: Int): Long {

        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        var txt: TextView
        var view = LayoutInflater.from(mainActivity4).inflate(R.layout.levelslist, parent, false)

        txt = view.findViewById(R.id.txt)
        var status = HomePage.sp.getString("level$position", HomePage.lock)

        Log.e("--", "status")




            if (status.equals(HomePage.complete)) {

                txt.setText("${position + 1}")
                txt.setBackgroundResource(R.drawable.tick)


                view.setOnClickListener {
                    var intent =
                        Intent(mainActivity4, GamePage::class.java).putExtra(
                            "puzzleindex",
                            position + 1
                        )
                    mainActivity4.startActivity(intent)
                }

            } else if (status.equals(HomePage.skip)) {

                txt.setText("${position + 1}")


                view.setOnClickListener {
                    var intent =
                        Intent(mainActivity4, GamePage::class.java).putExtra(
                            "puzzleindex",
                            position + 1
                        )
                    mainActivity4.startActivity(intent)
                }

            } else if (status.equals(HomePage.lock)) {
                txt.setBackgroundResource(R.drawable.lock)
            }


        return view

    }

}
