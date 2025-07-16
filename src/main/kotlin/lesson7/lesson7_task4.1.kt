package org.example.lesson7

fun main() {
    println("Enter amount of seconds:")
    val seconds = readln().toInt()
    for (i in seconds downTo 1) {
        println("Time left: $i")
        Thread.sleep(1000)
    }
    println("Time is up")
}