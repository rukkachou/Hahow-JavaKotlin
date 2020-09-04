package com.rukka

import java.time.LocalDateTime

fun main() {
//    val parkingLot = HashMap<String, Car?>()
    val parkingLot = mutableMapOf<String, Car?>()
    val enterTime = LocalDateTime.of(2020, 9, 4, 8, 0, 0)

    var car: Car? = Car("AAA-0001", enterTime)
    parkingLot[car!!.id] = car

    car = Car("BBB-0002", enterTime.plusMinutes(15))
    parkingLot[car.id] = car

    // car 1 leaving
    val leaveTime = LocalDateTime.of(2020, 9, 4, 9, 0, 0)
    car = parkingLot["AAA-0001"]
    car?.leaveTime = leaveTime
    println("${car?.id} duration: ${car?.getDuration()}")
    parkingLot.remove(car?.id)
    println(parkingLot.size)

    // car 2 leaving
    car = parkingLot["BBB-0002"]
    car?.leaveTime = leaveTime.plusHours(2)
    println("${car?.id} duration: ${car?.getDuration()}")
    parkingLot.remove(car?.id)
    println(parkingLot.size)

    /*val list = listOf(5, 1, 2, 7)
    println(list)
    val scores = listOf(66, 88, 77, 99, 50)
    for (score in scores) {
        println(score)
    }
    var mutableList = mutableListOf(5, 1, 2, 7)
    mutableList.add(6)
    println(mutableList)*/
}