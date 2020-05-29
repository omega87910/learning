package com.example.fragment_practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewPager.adapter = ViewPagerAdapter(supportFragmentManager)
    }
}
class ViewPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm,BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT){
    override fun getItem(position: Int) = when(position) {
        0 -> FirstFragment()
        1 -> SecondFragment()
        else -> ThirdFragment()
    }
    override fun getCount() = 3
}
