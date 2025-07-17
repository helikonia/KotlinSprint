package org.example.lesson10


import kotlin.random.Random

fun main() {
    var humanWins = 0
    while (true) {
        val winner = playGame()
        if (winner == "humans") {
            humanWins++
        }

        println("Do you want to continue? (yes/no)")
        val answer = readln().trim()
        if (answer.equals("yes", ignoreCase = true)) continue
        else break
    }
    println("Thanks for playing! you won $humanWins times")
}


fun generateBones(): Int = Random.nextInt(1, 7)
fun playGame(): String {
    val machinesResult = generateBones()
    println("Machines result is: $machinesResult")
    val humansResult = generateBones()
    println("Humans result is: $humansResult")

    return when {
        machinesResult > humansResult -> {
            println("Machines win!")
            "machine"
        }

        machinesResult == humansResult -> {
            println("It's a tie")
            "tie"
        }

        else -> {
            println("Humans win!")
            "humans"
        }
    }
}