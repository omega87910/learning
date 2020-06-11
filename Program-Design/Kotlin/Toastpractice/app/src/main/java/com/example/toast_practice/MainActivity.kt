package com.example.toast_practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener {
            Toast.makeText(this,"Normal",Toast.LENGTH_SHORT).show()
        }
        button2.setOnClickListener {
            val toast  = Toast(this)
            toast.view = View.inflate(this,R.layout.custom_toast,null)
            toast.setGravity(Gravity.TOP,0,0)
            toast.show()
        }
        button3.setOnClickListener {
            val toast = Toast.makeText(this,"POSITION",Toast.LENGTH_SHORT)
            toast.setGravity(Gravity.CENTER_VERTICAL,0,220)
            toast.show()
        }
    }
}
