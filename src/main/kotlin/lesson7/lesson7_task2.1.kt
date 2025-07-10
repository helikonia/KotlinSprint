package org.example.lesson7

import kotlin.random.Random

fun main() {
    while (true) {
        val generatedCode = Random.nextInt(1000, 9999)
        println("Your code is: $generatedCode")
        println("Enter your code:")
        val input = readln().toIntOrNull()
        when {
            (input == null || input !in 1000..9999) -> {
                println("Enter valid number")
                continue
            }

            (input != generatedCode) -> {
                println("Wrong code! try again!")
                continue
            }

            (input == generatedCode) -> {
                println("Welcome!")
                return
            }

        }
    }
}
