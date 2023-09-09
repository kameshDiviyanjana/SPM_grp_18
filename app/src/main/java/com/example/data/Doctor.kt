package com.example.data

data class Doctor(
    val id: String, // Unique identifier from Firebase
    val name: String,
    val specialty: String
    // Add other properties as needed
) {
    constructor() : this("", "", "") // No-argument constructor
}

