package com.rukka

import java.util.*
import kotlin.random.Random

fun main() {
    val secret = Random.nextInt(10) + 1
    println("Secret num: $secret")
    val scanner = Scanner(System.`in`)
    for (i in 1..4) {
        print("Please enter a number($i/4): ")
        val num = scanner.nextInt()
        if (num == -1) break
        print("$num -> ")
        if (num > secret) {
            println("lower")
        } else if (num < secret) {
            println("higher")
        } else {
            println("Great! You got it.")
            break
        }
    }
    println("The End")
}