package com.rukka

import java.util.*
import kotlin.random.Random


fun main() {
    val secretNum = Random.nextInt(10) +1
    println("secret num -> $secretNum")
//    val scanner = Scanner(System.`in`)
    var num = 0
    while (num != secretNum) {
        print("Please enter a number: ")
//        num = scanner.nextInt()
        num = readLine()!!.toInt()
        if (num > secretNum) {
            println("lower")
        } else if (num < secretNum) {
            println("higher")
        } else {
            println("Great! You got it.")
        }
    }
}