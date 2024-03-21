package com.example.cabrax

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class Map_Fragment : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_map_fragment)

        val mapFragment = supportFragmentManager.findFragmentById(R.id.MY_MAP) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        // Add a marker in a specific location and move the camera
        val location = LatLng(40.7128, -74.0060) // Example: New York City
        mMap.addMarker(MarkerOptions().position(location).title("Marker in New York City"))
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(location, 12f))
    }
}
