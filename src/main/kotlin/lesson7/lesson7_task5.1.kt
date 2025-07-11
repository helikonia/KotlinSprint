package org.example.lesson7

fun main() {

    println("Enter amount of symbols:")
    val userLength = readln().toIntOrNull()
    if (userLength == null || userLength < 6) {
        println("Minimum amount of symbols is 6")
        return
    }
    val digits = ('0'..'9').toList()
    val lowerCase = ('a'..'z').toList()
    val upperCase = ('A'..'Z').toList()
    val allChars = digits + lowerCase + upperCase
    val passwordChars = mutableListOf<Char>()
    passwordChars += digits.random()
    passwordChars += lowerCase.random()
    passwordChars += upperCase.random()

    for (i in 1..(userLength - 3)) {
        passwordChars += allChars.random()
    }
    passwordChars.shuffle()
    val password = passwordChars.joinToString("")
    println("Generated password: $password")
}