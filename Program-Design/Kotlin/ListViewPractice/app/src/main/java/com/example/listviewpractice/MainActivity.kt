package com.example.listviewpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val language = arrayOf("C","C++","Java","Kotlin","Python","JavaScript")
    val description =  arrayOf("C Language","C++ Language","Java Language","Kotlin Language","Python Language","JavaScript Language")
    val imageID = arrayOf(R.drawable.clanguagehome,R.drawable.cpphome,R.drawable.javahome,
        R.drawable.kotlinlogo,R.drawable.pythonhome,R.drawable.jslogo)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mylistAdapter =  MyListAdapter(this,language,description,imageID)
        listview.adapter = mylistAdapter
        listview.setOnItemClickListener { adapterView, view, position, id ->
            val itemAtPos  = adapterView.getItemAtPosition(position)
            val itemIdAtPos = adapterView.getItemIdAtPosition(position)
            Toast.makeText(this,"click on $itemAtPos id is $itemIdAtPos",Toast.LENGTH_SHORT).show()
        }
    }
}
