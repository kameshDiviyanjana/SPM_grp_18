package com.example.cataract_and_conjunctivitis_detection

import java.sql.Date
import java.sql.Timestamp
import java.text.SimpleDateFormat

object Time {

    fun timeStamp(): String {

        val timeStamp = Timestamp(System.currentTimeMillis())
        val sdf = SimpleDateFormat("HH:mm")
        val time = sdf.format(Date(timeStamp.time))

        return time.toString()
    }
}