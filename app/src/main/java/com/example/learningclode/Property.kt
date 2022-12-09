package com.example.learningclode

data class Property(
    val zone: Zone,
    val areaInSquareMeter: Double
) {
    fun tax() = zone.costForSquareMeter * areaInSquareMeter
}
