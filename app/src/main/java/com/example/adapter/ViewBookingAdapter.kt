package com.example.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.cataract_and_conjunctivitis_detection.R
import com.example.data.Booking

class ViewBookingAdapter(private val BookingList: ArrayList<Booking>) :
    RecyclerView.Adapter<ViewBookingAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val name: TextView = itemView.findViewById(R.id.tvName)
        val date: TextView = itemView.findViewById(R.id.tvDate)
        val time: TextView = itemView.findViewById(R.id.tvTime)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.activity_booking_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val booking = BookingList[position]

        holder.name.text = booking.doctorName
        holder.date.text = booking.getFormattedDate()
        holder.time.text = booking.getFormattedTime()


    }

    override fun getItemCount(): Int {
        return BookingList.size
    }
}
