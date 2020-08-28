package com.rukka

class PersonKotlin(var name: String = "", var weight: Float, var height: Float) {
    init {
        println()
    }
//    constructor(name: String, weight: Float, height: Float): this(weight, height)
    fun bmi() = weight/(height*height)
    fun hello() {
        println("Hello Kotlin")
    }
}

fun main() {
//    println("Hello Kotlin")
    val pK = PersonKotlin(weight = 66.5f, height = 1.7f)
//    pK.hello()
    println(pK.bmi())
    val c = 'A'
    println(c.toInt())

    var s: String? = null
    print("${s?.length} ${s?.get(2)} ${s?.substring(1, 5)}")


    /*var age = 19
    age = 20
    var weight = 66.5f
    var name: String
    name = "Rukka"*/
}