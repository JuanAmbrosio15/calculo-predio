package com.example.learningclode

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDate

// Properties in camellCase
data class Person(
    val fullName: String,
    val dateBirth: LocalDate,
    val genre:String,
    val isSingleMother:Boolean
){
    @RequiresApi(Build.VERSION_CODES.O)
    fun getAge() = LocalDate.now().year - dateBirth.year
}