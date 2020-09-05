package com.rukka.student

import java.util.*

fun main() {
//    userInput()
//    StudentKotlin.pass = 80

    val std = StudentKotlin("Liz",
            60, 60)
    val std2 = StudentKotlin("Jay",
            70, 80)
    val std3 = StudentKotlin("May",
            30, 40)
    val gStd = GraduateStudentKotlin("Hank",
            60, 60, 70)
    gStd.print()
    std.print()
    std2.print()
    std3.print()
    println("Highest score: ${std.highest() }")
}

class GraduateStudentKotlin(name: String?, englishScore: Int, mathScore: Int, val thesisScore: Int) : StudentKotlin(name, englishScore, mathScore) {
    init {
        pass = 70
    }
    override fun print() {
        println("$name\t$englishScore\t$mathScore\t$thesisScore\t${getAverage()}\t${passOrFaild()}\t${getGrading()}")
    }
}

open class StudentKotlin(val name: String?, val englishScore: Int, val mathScore: Int) {
    companion object {
        @JvmStatic
        var pass = 60
        fun test() {
            println("testing")
        }
    }
    open fun print() {
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