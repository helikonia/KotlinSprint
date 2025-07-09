package org.example.lesson6

import kotlin.random.Random

fun main() {

    var counter = 0
    val maxAttempts = 3
    while (counter < maxAttempts) {
        val randomNumber1 = Random.nextInt(1, 10)
        val randomNumber2 = Random.nextInt(1, 10)
        val correctSum = randomNumber1 + randomNumber2

        println("Count sum: $randomNumber1 + $randomNumber2= ")

        val input = readln()
        val sumInput = input.toIntOrNull()
        if (sumInput == null) {
            println("Please enter a valid number.")
            continue
        }
        if (sumInput == correctSum) {
            println("Welcome!")
            return
        } else {
            counter++
            if (counter < maxAttempts) {
                println("Wrong answer! Try again. Attempts left: ${maxAttempts - counter}")
            }
        }
    }
    println("Access denied")
}