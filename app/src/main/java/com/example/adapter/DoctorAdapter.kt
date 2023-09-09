package com.example.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.cataract_and_conjunctivitis_detection.R
import com.example.data.Doctor

class DoctorAdapter(private val doctorList: List<Doctor>) :
    RecyclerView.Adapter<DoctorAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val name: TextView = itemView.findViewById(R.id.tvName)
        val specialty: TextView = itemView.findViewById(R.id.tvSpecialty)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.activity_doctor_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val doctor = doctorList[position]

        holder.name.text = doctor.name
        holder.specialty.text = doctor.specialty


    }

    override fun getItemCount(): Int {
        return doctorList.size
    }
}
