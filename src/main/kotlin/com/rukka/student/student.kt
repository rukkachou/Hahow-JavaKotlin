package com.rukka.student

import java.util.*
import kotlin.math.max

fun main() {
//    userInput()
    StudentKotlin.pass = 80
    val testStd = StudentKotlin("Liz",
            60, 60)
    val testStd2 = StudentKotlin("Jay",
            70, 80)
    val testStd3 = StudentKotlin("May",
            30, 40)
    testStd.print()
    testStd2.print()
    testStd3.print()
    println("Highest score: ${testStd.highest() }")
}

class StudentKotlin(val name: String?, val englishScore: Int, val mathScore: Int) {
    companion object {
        @JvmStatic
        var pass = 60
        fun test() {
            println("testing")
        }
    }
    fun print() {
        println("$name\t$englishScore\t$mathScore\t${getAverage()}\t${passOrFaild()}\t${getGrading()}")
    }
    fun passOrFaild() = if (getAverage() >= pass) "PASS" else "FAILED"
    fun highest() = if (englishScore > mathScore) {
        println("Eng")
        englishScore
    } else {
        println("Math")
        mathScore
    }//max(englishScore, mathScore)
    fun getAverage() = (englishScore.toFloat() + mathScore) / 2
    fun getGrading() = when (getAverage()) {
        in 90f..100f -> 'A'
        in 80f..89f -> 'B'
        in 70f..79f -> 'C'
        in 60f..69f -> 'D'
        else -> 'F'
    }
}

private fun userInput() {
    val scanner = Scanner(System.`in`)
    print("Please enter student's name: ")
    val name = scanner.next()
    print("Please enter student's english score: ")
    val englishScore = scanner.nextInt()
    print("Please enter student's math score: ")
    val mathScore = scanner.nextInt()
    val std = StudentKotlin(name, englishScore, mathScore)
    std.print()
}