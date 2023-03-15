package com.jason.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list_item = mutableListOf<ListViewModel>()
        list_item.add(ListViewModel("가","A","1"))
        list_item.add(ListViewModel("나","B","2"))
        list_item.add(ListViewModel("다","C","3"))

        val listview = findViewById<ListView>(R.id.mainlistview)

        val listviewadapter = ListViewAdapter(list_item)
        listview.adapter = listviewadapter

        listview.setOnItemClickListener { parent, view, position, id ->
//            Toast.makeText(this, list_item[position],Toast.LENGTH_LONG).show()
        }

    }
}