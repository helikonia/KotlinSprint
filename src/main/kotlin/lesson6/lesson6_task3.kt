package org.example.lesson6

fun main() {

    val input = readln().toInt()
    var counter = START_NUMBER
    var sum = 0
    while (counter <= input) {

        sum += counter
        counter += 1
    }
    println(sum)
}


const val START_NUMBER = 1