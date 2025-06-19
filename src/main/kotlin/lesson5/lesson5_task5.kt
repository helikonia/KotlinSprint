package org.example.lesson5

import kotlin.random.Random

fun main() {
    val generatedNumbers = List(3) { Random.nextInt(0, 43) }
    val userNumbers = mutableListOf<Int>()
    repeat(3) {
        println("Enter number #${it + 1}")
        val input = readln().toInt()
        userNumbers.add(input)
    }
    val intersection = generatedNumbers.intersect(userNumbers)
    val matches = intersection.size

    when (matches) {
        3 -> println("You hit the jackpot!")
        2 -> println("You guessed 2 numbers and get the big prize!")
        1 -> println("You guessed 1 number and get the consolation prize!")
        0 -> println("Unfortunately, you did not guess any number.")
    }
    println("Generated numbers were: $generatedNumbers")
}