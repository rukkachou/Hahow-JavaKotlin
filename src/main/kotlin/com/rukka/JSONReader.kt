package com.rukka

import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL

fun main() {
    val url = URL("https://data.tycg.gov.tw/opendata/datalist/datasetMeta/download?id=f4cc0b12-86ac-40f9-8745-885bddc18f79&rid=0daad6e6-0632-44f5-bd25-5e1de1e9146f")
//    bufferedReader(url)
//    bufferedReaderWith(url)
    println(url.readText())
}

private fun bufferedReaderWith(url: URL) {
    val json = StringBuffer()
    with(url.openConnection() as HttpURLConnection) {
        inputStream.bufferedReader().lines().forEach {
            json.append(it)
        }
    }
    println("$json")
}

private fun bufferedReader(url: URL) {
    val connection = url.openConnection() as HttpURLConnection
    val br = BufferedReader(InputStreamReader(connection.inputStream))
    val json = StringBuffer()
    /*var line = br.readLine()
    while (line != null) {
        json.append(line)
        line = br.readLine()
    }*/
    br.lines().forEach {
        json.append(it)
    }
    println("$json")
}