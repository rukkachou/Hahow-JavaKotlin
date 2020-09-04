package com.rukka.kotlin

import com.rukka.student.StudentKotlin
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import java.lang.AssertionError

class StudentTest {
    @Test
    fun highestTest() {
        val student = StudentKotlin("Scute", 60, 80)
        Assertions.assertEquals(80, student.highest())
    }
    @Test
    fun getAverageTest() {
        val student = StudentKotlin("Scute", 60, 80)
        Assertions.assertEquals((60f + 80) / 2, student.getAverage())
    }
    @Test
    fun getGradingTest() {
        val student = StudentKotlin("Scute", 60, 80)
        Assertions.assertEquals('C', student.getGrading())
    }

}