package com.example.cataract_and_conjunctivitis_detection

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class BookingDashboard: AppCompatActivity() {
    private lateinit var btnAddBook : Button
    private lateinit var btnViewBook : Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_booking_dashboard)

        btnAddBook = findViewById(R.id.btnAddBook)
        btnViewBook = findViewById(R.id.btnViewBook)

        btnViewBook.setOnClickListener {

            val intent = Intent(this, DisplayDoctor::class.java)
            startActivity(intent)
        }
    }

}