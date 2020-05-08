package com.example.myapplication
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener {
            if (editText.text.isEmpty()){
                textView.text = "未輸入名字"
            }else {
                when {
                    radioButton.isChecked -> start("scissor")
                    radioButton2.isChecked -> start("stone")
                    radioButton3.isChecked -> start("paper")
                }
            }
        }
    }
    private fun start(chosen:String){
        textView.text = ""
        val arr:Array<String> = arrayOf("scissor","stone","paper")
        val username = editText.text
        val pc = arr.random()
        textView_name.text = String.format("%s\n${username}",textView_name.text)
        textView_comGesture.text = String.format("%s\n${pc}",textView_comGesture.text)
        textView_uGesture.text = String.format("%s\n${chosen}",textView_uGesture.text)
        if (chosen == pc){
            textView_winner.text = String.format("%s\nNone",textView_winner.text)
        }else{
            if(chosen == "scissor"){
                if(pc == "stone"){
                    textView_winner.text = String.format("%s\nCom",textView_winner.text)
                }else{
                    textView_winner.text = String.format("%s\n${username}",textView_winner.text)
                }
            }else if (chosen == "stone"){
                if(pc == "paper"){
                    textView_winner.text = String.format("%s\nCom",textView_winner.text)
                }else{
                    textView_winner.text = String.format("%s\n${username}",textView_winner.text)
                }
            }else if(chosen == "paper"){
                if(pc == "scissor"){
                    textView_winner.text = String.format("%s\nCom",textView_winner.text)
                }else{
                    textView_winner.text = String.format("%s\n${username}",textView_winner.text)
                }
            }
        }
    }
}
