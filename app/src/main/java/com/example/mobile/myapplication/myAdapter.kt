package com.example.mobile.myapplication

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.mylayout.view.*

/**
 * Created by Mobile on 8/22/2017.
 */
class myAdapter(val instace: Context, val userList:ArrayList<String>) : RecyclerView.Adapter<myAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): myAdapter.ViewHolder {
        val myView = LayoutInflater.from(instace).inflate(R.layout.mylayout, null);
        return ViewHolder(myView)
    }

    override fun onBindViewHolder(holder: myAdapter.ViewHolder, position: Int) {
           holder.textview.text=userList.get(position)
    }

    override fun getItemCount(): Int {
     return userList.size
    }
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val textview=itemView.textViewName
       /* fun bindItems(userList:String){
        itemView.textViewName.text=userList;
        }*/
    }
    }
