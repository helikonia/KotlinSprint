package org.example.lesson7

import kotlin.random.Random

fun main() {
    var password = ""
    for (i in 0 until 3) {
        val randomNum = Random.nextInt(0, 10).toString()
        val randomLetter = ('a'..'z').random()
        password += "$randomLetter$randomNum"
    }
    println("Generated password: $password")
}