package com.example.cataract_and_conjunctivitis_detection

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val go = Intent(this,cataract_detection::class.java)
        startActivity(go)
    }
}