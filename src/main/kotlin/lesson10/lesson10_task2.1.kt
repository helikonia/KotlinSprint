package org.example.lesson10

fun main() {
    println("Enter login:")
    val login = readln()
    println("Enter password:")
    val password = readln()
    if (checkSymbols(login) && (checkSymbols(password))) {
        println("Welcome!")
    } else println("Enter 4 or more symbols")

}

fun checkSymbols(input: String): Boolean = input.length >= 4