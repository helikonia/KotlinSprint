package org.example.lesson6

fun main() {

    var i = MIN_NUMBER
    do {
        println("$i")
        i++
    } while (i <= MAX_NUMBER)
}

const val MAX_NUMBER = 10
const val MIN_NUMBER = 1