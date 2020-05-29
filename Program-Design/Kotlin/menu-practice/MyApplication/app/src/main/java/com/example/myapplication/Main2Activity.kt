package com.example.myapplication

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        button2.setOnClickListener {
            if (editText.text.isEmpty() ){ //飲料未輸入
                Toast.makeText(this,"請輸入飲料名稱!",Toast.LENGTH_LONG).show()
            }else {
                var b = Bundle()
                //將資料放入bundle
                b.putString("Drink",editText.text.toString())
                b.putString("Sweet",radioGroupSweet.findViewById<RadioButton>(radioGroupSweet.checkedRadioButtonId).text.toString())
                b.putString("Ice",radioGroupIce.findViewById<RadioButton>(radioGroupIce.checkedRadioButtonId).text.toString())
                //回傳結果
                setResult(Activity.RESULT_OK, Intent().putExtras(b))
                //結束
                finish()
            }
        }
    }
}
