package com.example.cataract_and_conjunctivitis_detection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.adapter.DoctorAdapter
import com.example.data.Doctor
import com.google.firebase.database.*

class DisplayDoctor : AppCompatActivity() {

    private lateinit var dbref : DatabaseReference
    private lateinit var doctorRecyclerView : RecyclerView
    private lateinit var doctorArrayList : ArrayList<Doctor>



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_doctor)

        doctorRecyclerView = findViewById(R.id.doctorRecyclerView)
        doctorRecyclerView.layoutManager = LinearLayoutManager(this)
        doctorRecyclerView.setHasFixedSize(true)

        doctorArrayList = arrayListOf<Doctor>()
        getUserData()

    }

    private fun getUserData(){

        dbref = FirebaseDatabase.getInstance().getReference("Doctor")

        dbref.addValueEventListener(object : ValueEventListener{

            override fun onDataChange(snapshot: DataSnapshot) {

                if(snapshot.exists()){

                    for (userSnapshot in snapshot.children){

                        val doctor = userSnapshot.getValue(Doctor::class.java)
                        doctorArrayList.add(doctor!!)

                    }

                    doctorRecyclerView.adapter = DoctorAdapter(doctorArrayList)
                }

            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }

        })
    }



}