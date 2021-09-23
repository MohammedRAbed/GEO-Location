package com.moabed.geolocationproject

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import java.util.*

class SplashhActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val res = this.resources
        val dem = res.displayMetrics
        val conf = res.configuration

        conf.setLocale(Locale("ar"))

        res.updateConfiguration(conf,dem)


        val handler = Handler()
        handler.postDelayed(object : Runnable{
            override fun run() {
                val intent = Intent(baseContext, MainActivity::class.java)
                startActivity(intent)
                finish()
            }
        },2000)
    }
}