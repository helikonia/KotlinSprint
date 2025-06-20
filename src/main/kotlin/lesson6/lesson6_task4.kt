package org.example.lesson6

import kotlin.random.Random

fun main() {

    val guessedNum: Int = Random.nextInt(MIN, MAX + 1)
    var input: Int
    var attempts = 0
    do {
        println("Enter a number")
        input = readln().toInt()
        attempts++
    } while (input != guessedNum)
    println("You guessed from $attempts attempt!")
}

const val MIN = 1
const val MAX = 10