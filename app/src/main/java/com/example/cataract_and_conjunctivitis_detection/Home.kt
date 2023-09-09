package com.example.cataract_and_conjunctivitis_detection

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Home : AppCompatActivity() {

    private lateinit var btnCataractDetection : Button
    private lateinit var btnChannel : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        btnCataractDetection = findViewById(R.id.btnCataractDetection)
        btnChannel = findViewById(R.id.btnChannel)

        btnCataractDetection.setOnClickListener {

            val intent = Intent(this, cataract_detection::class.java)
            startActivity(intent)
        }

        btnChannel.setOnClickListener {

            val intent = Intent(this, BookingDashboard::class.java)
            startActivity(intent)
        }




    }
}