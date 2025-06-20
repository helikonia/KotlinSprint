package org.example.lesson7

fun main() {

    val passwords = listOf("abc", "qwerty", "12345", "Pass123", "Admin!", "StrongP@ss1")
    for (password in passwords) {
        if (password.length < 6) continue
        if (password.any { it.isUpperCase() })
            if (password.any { it.isDigit() }) {
                println("Password is accerted - $password")
                return
            }
    }
}