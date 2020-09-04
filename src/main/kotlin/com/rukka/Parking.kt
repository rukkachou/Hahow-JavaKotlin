package com.rukka

import java.time.Duration
import java.time.LocalDateTime
import kotlin.math.ceil

fun main() {
    val enterTime =
            LocalDateTime.of(2020, 9, 3, 8, 0)
    val leaveTime =
            LocalDateTime.of(2020, 9, 3, 10, 10)
    val car = Car("KK-0001", enterTime)
    car.leaveTime = leaveTime
    println("duration: ${car.getDuration()}")
    val hour = ceil(car.getDuration()/60.0).toLong()
    println("hour: $hour")
}

class Car(val id: String, val enterTime: LocalDateTime) {
    var leaveTime: LocalDateTime? = null
    set(value) {
        if (enterTime.isBefore(value)) {
            field = value
        }
    }
    fun getDuration() = Duration.between(enterTime, leaveTime).toMinutes()
}