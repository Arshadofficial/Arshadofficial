package com.example.cabrax

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.bottomnavigation.BottomNavigationView

class profileActivity : AppCompatActivity() {

    private lateinit var bottomNavigation: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_profile)

        bottomNavigation = findViewById(R.id.bottom_navigation)

        bottomNavigation.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.baseline_home_24 -> {
                    startActivity(Intent(this, homeActivity::class.java))
                    true
                }
                R.id.baseline_assistant_navigation_24 -> {
                    startActivity(Intent(this, navigationActivity::class.java))
                    true
                }
                R.id.baseline_account_circle_24 -> {
                    startActivity(Intent(this, profileActivity::class.java))
                    true
                }
                else -> false
            }
        }
    }
}