package org.example.lesson6

import kotlin.random.Random

fun main() {

    val randomNumber = Random.nextInt(1, 10)

    println("Guess the number:")
    var inputNumber = readln().toInt()
    var counter = 0
    while (inputNumber != randomNumber && counter < 4) {
        println("Incorrect! Enter again:")
        counter++
        inputNumber = readln().toInt()
    }
    if (inputNumber == randomNumber) {
        println("It was a wonderful game!")
    } else println("Number $randomNumber was guessed")
}