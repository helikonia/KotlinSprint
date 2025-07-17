package org.example.lesson10

import kotlin.random.Random

fun main() {
    println("Enter login:")
    val login = readln()
    println("Enter password:")
    val password = readln()
    val token = authorize(login, password)

    if (token != null) {
        println("Authorization is successful. Your token is: $token")
        val userCart = getCart(token)
        println("Your cart is:")
        if (userCart != null) {
            userCart.forEach { println(it) }
        } else {
            println("Cart is empty or invalid number")
        }
    } else {
        println("Authorization mistake")
    }
}

fun authorize(login: String, password: String): String? {
    return if (
        login.equals(CORRECT_LOGIN, ignoreCase = true) &&
        password == CORRECT_PASSWORD
    ) {
        generateToken()
    } else {
        null
    }
}

fun generateToken(): String {
    val chars = ('a'..'z') + ('A'..'Z') + ('0'..'9')
    return List(32) { chars.random() }.joinToString("")
}

fun getCart(token: String): List<String>? {
    return if (token.length == 32)
        cart
    else null
}

val cart = listOf("Ноутбук", "Книга", "Чайник", "Флешка")
const val CORRECT_LOGIN = "user123"
const val CORRECT_PASSWORD = "securePassword"