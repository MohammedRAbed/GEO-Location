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
import com.moabed.geolocationproject.adapters.*
import kotlinx.android.synthetic.main.fragment_favourite.view.*
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_home.view.*

class HomeFragment : Fragment() {

    @SuppressLint("WrongConstant")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        val perfectList = ArrayList<Perfect>()

        val recyclerForPerfect = view.perf_rec
        recyclerForPerfect.layoutManager = LinearLayoutManager(context, LinearLayout.HORIZONTAL,false)

        perfectList.add(Perfect())
        perfectList.add(Perfect())
        perfectList.add(Perfect())
        perfectList.add(Perfect())

        val perfectAdapter = PerfectAdapter(perfectList,requireContext())
        recyclerForPerfect.adapter = perfectAdapter



        val allList = ArrayList<All>()

        val recyclerForAll = view.all_rec
        recyclerForAll.layoutManager = LinearLayoutManager(context, LinearLayout.VERTICAL,false)

        allList.add(All())
        allList.add(All())
        allList.add(All())
        allList.add(All())
        allList.add(All())

        val allAdapter = AllAdapter(allList,requireContext())
        recyclerForAll.adapter = allAdapter



        return view

    }


}