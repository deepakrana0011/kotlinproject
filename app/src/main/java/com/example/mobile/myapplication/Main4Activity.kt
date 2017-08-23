package com.example.mobile.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.ImageView
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.activity_main3.view.*

class Main4Activity : AppCompatActivity() {
    var myImage: ImageView? = null
    var myRecyclerView: RecyclerView? = null
    var userList: ArrayList<String>? = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        myRecyclerView = findViewById(R.id.recyclerView) as RecyclerView
        myImage?.setBackground(ContextCompat.getDrawable(this, R.drawable.logo))

        userList?.add("deepak")
        userList?.add("deepak")
        userList?.add("deepak")
        userList?.add("deepak")
        userList?.add("deepak")
        userList?.add("deepak")
        userList?.add("deepak")
        userList?.add("deepak")
        userList?.add("deepak")
        userList?.add("deepak")
        userList?.add("deepak")
        userList?.add("deepak")
        myRecyclerView?.layoutManager = LinearLayoutManager(this)
        myRecyclerView?.adapter = myAdapter(this, userList!!)
    }
}
