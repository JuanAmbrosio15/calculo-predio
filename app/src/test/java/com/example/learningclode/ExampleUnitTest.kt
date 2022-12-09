package com.example.learningclode

import org.junit.Assert.assertEquals
import org.junit.Test
import java.time.LocalDate

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun ageIsThan18() {
        val person = Person(
            fullName = "John", LocalDate.parse("2000-08-20"),
            genre = "M",
            isSingleMother = false
        )
        assertEquals(true, person.getAge() > 18)
    }



}
