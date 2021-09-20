package com.moabed.geolocationproject

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashhActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val handler = Handler()
        handler.postDelayed(object : Runnable{
            override fun run() {
                val intent = Intent(baseContext, MapsActivity::class.java)
                startActivity(intent)
                finish()
            }
        },2000)
    }
}