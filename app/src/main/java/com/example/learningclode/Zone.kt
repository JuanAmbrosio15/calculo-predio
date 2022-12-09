package com.example.learningclode

data class Zone(
    val key: String,
    val zone: String,
    val costForSquareMeter: Double
) {
    override fun toString() = zone
}