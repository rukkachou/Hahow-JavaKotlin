package com.rukka.kotlin

import com.rukka.Person
import com.rukka.PersonKotlin
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class PersonTest {
    @Test
    fun bmiTest() {
        val person = PersonKotlin("Liz", 66.5f, 1.7f)
        Assertions.assertEquals(66.5f/(1.7f*1.7f), person.bmi())
    }
    @Test
    fun javaBmiTest() {
        val person = Person(66.5f, 1.7f)
        Assertions.assertEquals(66.5f/(1.7f*1.7f), person.bmi())
    }
}