package com.example.cabrax

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class launchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_launch)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Start the main activity after a delay of 3 seconds (3000 milliseconds)
        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this@launchActivity, getstartedActivity::class.java))
            finish() // Optionally finish this activity if you don't want it in the back stack
        }, 3000) // 3000 milliseconds = 3 seconds



    }
}
