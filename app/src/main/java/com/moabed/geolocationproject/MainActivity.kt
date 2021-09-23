package com.moabed.geolocationproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    lateinit var mapBtn : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var intent : Intent
        mapBtn = findViewById(R.id.map_btn)

        val btmNav = findViewById<BottomNavigationView>(R.id.myBottom)
        val navController = findNavController(R.id.main_frag)
        btmNav.setupWithNavController(navController)

        mapBtn.setOnClickListener {
            intent = Intent(this,MapsActivity::class.java)
            startActivity(intent)
        }

    }
}