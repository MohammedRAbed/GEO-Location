package com.moabed.geolocationproject.adapters

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.moabed.geolocationproject.R

class Favorites

class FavoriteAdapter(val list_favorites:ArrayList<Favorites>, val context: Context) : RecyclerView.Adapter<FavoriteAdapter.MyViewHolder>() {

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.favorite_item,parent,false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list_favorites.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {}
}