package com.example.fragmentdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.FragmentManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun fun1(view: View) {
        var fm=supportFragmentManager
        var ft=fm.beginTransaction()
        var first=FirstFragment()
        ft.replace(R.id.frame,first)
        ft.commit();
    }
    fun home(view: View) {
        var fm=supportFragmentManager
        var ft=fm.beginTransaction()
        var d=DefaultFragment()
        ft.replace(R.id.frame,d)
        ft.commit();
    }


}