package com.example.cabrax

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.bottomnavigation.BottomNavigationView

class homeActivity : AppCompatActivity() {

    private lateinit var bottomNavigation: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)

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
        val button: Button = findViewById(R.id.Button6)
        button.setOnClickListener {
            val intent = Intent(this@homeActivity, booking_activity::class.java)
            startActivity(intent)
        }


    }

    }
