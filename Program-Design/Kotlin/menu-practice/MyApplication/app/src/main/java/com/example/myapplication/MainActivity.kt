package com.example.myapplication

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        button.setOnClickListener {
            var i = Intent(this,Main2Activity::class.java)
            startActivityForResult(i,0)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        //判斷接收資料是否為空
        var bundle = data?.extras?:return
        //判斷請求和結束狀態
        if(requestCode == 0 && resultCode == Activity.RESULT_OK){
            textViewDrink.text = bundle.getString("Drink")
            textViewSweet.text = bundle.getString("Sweet")
            textViewIce.text = bundle.getString("Ice")
        }
    }
}
