package com.example.myapplication
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener {
            start("scissor")
        }
        button2.setOnClickListener {
            start("stone")
        }
        button3.setOnClickListener {
            start("paper")
        }
    }
    fun start(chosen:String){
        val arr:Array<String> = arrayOf("scissor","stone","paper")
        textView.text = "你選擇${chosen}"
        val pc = arr.random()
        textView2.text = "電腦選擇${pc}"
        val lose = "你輸了"
        val win = "你贏了"
        val same = "平手"
        if (chosen == pc){
            textView3.text= same
        }else{
            if(chosen == "scissor"){
                if(pc == "stone"){
                    textView3.text = lose
                }else{
                    textView3.text = win
                }
            }else if (chosen == "stone"){
                if(pc == "paper"){
                    textView3.text = lose
                }else{
                    textView3.text = win
                }
            }else if(chosen == "paper"){
                if(pc == "scissor"){
                    textView3.text = lose
                }else{
                    textView3.text = win
                }
            }
        }
    }
}
