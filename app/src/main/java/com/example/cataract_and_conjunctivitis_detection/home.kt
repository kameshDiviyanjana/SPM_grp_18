package com.example.cataract_and_conjunctivitis_detection

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class home : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

         var chenel = findViewById<Button>(R.id.btnchenl)
          var chatbot = findViewById<Button>(R.id.btnchat)
        var ctractdet = findViewById<Button>(R.id.btncatr)
        var reminder = findViewById<Button>(R.id.btnreminder)


        ctractdet.setOnClickListener {
            val go = Intent(this,cataract_detection::class.java)
            startActivity(go)
        }

        chatbot.setOnClickListener {

            val go = Intent(this,ChatBot_MainActivity::class.java)
            startActivity(go)
        }

    }
}