package com.moabed.geolocationproject

import android.Manifest
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.app.ActivityCompat
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.moabed.geolocationproject.databinding.ActivityMapsBinding

class MapsActivity : AppCompatActivity() {

    private lateinit var mMap: GoogleMap
    private lateinit var binding: ActivityMapsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMapsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mapFragment = supportFragmentManager.findFragmentById(R.id.map) as SupportMapFragment

        mapFragment.getMapAsync({

            mMap = it

            /*
            val mLocation = LatLng(-34.0, 151.0)
            mMap.addMarker(MarkerOptions().position(mLocation).title("My Location"))
            mMap.moveCamera(CameraUpdateFactory.newLatLng(mLocation))

            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(mLocation,12f))

             */

            if (ActivityCompat.checkSelfPermission(
                    this,
                    Manifest.permission.ACCESS_FINE_LOCATION
                ) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(
                    this,
                    Manifest.permission.ACCESS_COARSE_LOCATION
                ) != PackageManager.PERMISSION_GRANTED
            ) {
                Toast.makeText(this,"Missing Permssion",Toast.LENGTH_SHORT).show()
            }

            mMap.isMyLocationEnabled = true
        })
    }





}