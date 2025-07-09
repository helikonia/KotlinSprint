package org.example.lesson6

fun main() {

    println("How many seconds?")
    val secondsInput = readln().toInt()
    var seconds = secondsInput
    while (seconds > 0) {
        print("\r$seconds seconds left  ")
        Thread.sleep(1000)
        seconds--
    }
    println("\n$secondsInput seconds passed. Time is  up")
}