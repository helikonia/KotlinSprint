package org.example.lesson10

import kotlin.random.Random

fun main() {
    val machinesResult = generateBones5()
    println("Machines result is: $machinesResult")
    val humansResult = generateBones5()
    println("Humans result is: $humansResult")

    when {
        (machinesResult > humansResult) -> println("Machines win!")
        (machinesResult == humansResult) -> println("Its a tie")
        else -> println("Humans win!")
    }
}


fun generateBones5(): Int = Random.nextInt(1, 7)
