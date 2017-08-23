package com.example.mobile.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import java.lang.Integer.parseInt

class MainActivity : AppCompatActivity() {

    var a = 1
    var name="23"




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println(a)
        sum(1, 2)
    }

    fun sum(a: Int, b: Int) {
        var d = name.toInt();
        val deeepak =4;
        var c: Int = (a + b+d)
        Log.e("hello", c.toString())
    }


}
