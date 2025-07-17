package org.example.lesson10

import kotlin.random.Random

fun main() {
    println("How long do you want your password?")
    val passwordLength = readln().toInt()
    println(generatePassword(passwordLength))

}

fun generatePassword(input: Int): String {
    val symbols = listOf<String>("!", "\"", "#", "$", "%", "&", "'", "(", ")", "*", "+", ",", "-", ".", "/", " ")

    val password = mutableListOf<String>()

    for (i in 0 until input) {
        val number = Random.nextInt(0, 10).toString()

        if (Random.nextBoolean()) {

            password.add(number)
        } else {
            val symbol = symbols.random()
            password.add(symbol)
        }
    }
    return password.joinToString("")

}