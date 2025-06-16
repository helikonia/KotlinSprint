package org.example.lesson5

fun main() {
    val a = 3
    val b = 4

    println("Solve a simple expression to prove that you are a human: $b + $a = ?")

    val solution = readln().toInt()

    if (solution == (a + b))
        println("Welcome!")
    else println("Access denied")

}