package com.rukka

import java.io.File

fun main() {
    File("datachinese.txt").bufferedReader().lines().forEach {
        println(it)
    }

//    write()
}

private fun write() {
//    File("kotlinoutput.txt").writeText("abc 123 edf")

    /*File("kotlinoutput.txt").printWriter().use {
        it.println("1st line")
        it.println("2nd line")
        it.println("3nd line")
    }*/

    File("kotlinoutput.txt").bufferedWriter().use {
        it.write("1st line\n")
        it.write("2nd line\n")
        it.write("3nd line\n")
    }
}