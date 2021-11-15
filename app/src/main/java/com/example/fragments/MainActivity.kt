package com.example.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val fragment1Btn:Button=findViewById(R.id.fragment1)
        val fragment2Btn:Button=findViewById(R.id.fragment2)
        fragment1Btn.setOnClickListener{
            replaceFragment(Fragment1())
        }
        fragment2Btn.setOnClickListener {
            replaceFragment(Fragment2())
        }
    }

    private fun replaceFragment(fragment:Fragment) {
        val fragmentManager=supportFragmentManager.beginTransaction()
        fragmentManager.replace(R.id.fragmentContainer,fragment)
        fragmentManager.commit()
    }
}