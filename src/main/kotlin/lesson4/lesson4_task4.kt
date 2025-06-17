package org.example.lesson4

fun main() {

    val trainingDay = 1

    val isEven = trainingDay % 2 == 0

    println(
        """
        Exercises for arms: ${!isEven}
        exercises for legs: $isEven
        exercises for back: $isEven
        exercises for press: ${!isEven}
    """.trimIndent()
    )
}