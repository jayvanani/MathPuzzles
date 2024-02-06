package com.example.math2

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter

class Myclass(var mainActivity4: Context): BaseAdapter() {
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

        var view=LayoutInflater.from(mainActivity4).inflate(R.layout.levelslist,parent,false)

        return view

    }

}
