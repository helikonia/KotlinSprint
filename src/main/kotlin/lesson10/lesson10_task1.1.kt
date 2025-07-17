package org.example.lesson10

import kotlin.random.Random

fun main() {
    val machinesResult = generateBones()
    println("Machines result is: $machinesResult")
    val humansResult = generateBones()
    println("Humans result is: $humansResult")

    when {
        (machinesResult > humansResult) -> println("Machines win!")
        (machinesResult == humansResult) -> println("Its a tie")
        else -> println("Humans win!")
    }
}


fun generateBones(): Int = Random.nextInt(1, 7)
