package com.jason.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class ListViewAdapter(val List : MutableList<ListViewModel>) : BaseAdapter() {
    override fun getCount(): Int {
        return List.size
    }

    override fun getItem(position: Int): Any {
        return List[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var convertView = convertView

        if(convertView==null){
            convertView = LayoutInflater.from(parent?.context).inflate(R.layout.listviewitem,parent,false)
        }
            val korean = convertView!!.findViewById<TextView>(R.id.listview_txt1)
            korean.text = List[position].text1
            val english = convertView!!.findViewById<TextView>(R.id.listview_txt2)
            english.text = List[position].text2
            val number = convertView!!.findViewById<TextView>(R.id.listview_txt3)
            number.text = List[position].text3
        return convertView!!
    }
}