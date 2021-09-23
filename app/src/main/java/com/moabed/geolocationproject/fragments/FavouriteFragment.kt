package com.moabed.geolocationproject.fragments

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.moabed.geolocationproject.R
import com.moabed.geolocationproject.adapters.FavoriteAdapter
import com.moabed.geolocationproject.adapters.Favorites
import kotlinx.android.synthetic.main.fragment_favourite.view.*

class FavouriteFragment : Fragment() {

    @SuppressLint("WrongConstant")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_favourite, container, false)

        val favoritesList = ArrayList<Favorites>()

        val recyclerForFavorites = view.fav_rec
        recyclerForFavorites.layoutManager = LinearLayoutManager(context, LinearLayout.VERTICAL,false)

        favoritesList.add(Favorites())
        favoritesList.add(Favorites())
        favoritesList.add(Favorites())
        favoritesList.add(Favorites())
        favoritesList.add(Favorites())

        val favoritesAdapter = FavoriteAdapter(favoritesList,requireContext())
        recyclerForFavorites.adapter = favoritesAdapter


        return view
    }


}