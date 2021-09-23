package com.moabed.geolocationproject.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.moabed.geolocationproject.R

class Perfect

class PerfectAdapter(val list_perfect:ArrayList<Perfect>, val context: Context) : RecyclerView.Adapter<PerfectAdapter.MyViewHolder>() {

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.perfect_item,parent,false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list_perfect.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {}
}