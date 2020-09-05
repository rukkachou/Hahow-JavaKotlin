package com.rukka.kotlin

import kotlin.random.Random

data class Ticket(val origin: Int, val destination: Int, val price: Int)


fun main() {
    var ticket = Ticket(20, 51, 420)
    val s = "12345"
    println(s.validate())
    var num = (1..10).random()
    while (num != 10) {
        println(num)
        num = (1..10).random()
    }
}

fun String.validate(): Boolean {
    return length >= 6
}

fun IntRange.random(): Int {
    return Random.nextInt(start, endInclusive + 1)
}