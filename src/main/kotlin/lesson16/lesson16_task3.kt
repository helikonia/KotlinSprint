package org.example.lesson16

class User(val login: String, private val password1: String = "12345M") {

    fun passwordValidation(password: String): Boolean {
        return password == password1
    }
}

fun main() {
    val user = User("Meow")

    when {
        user.passwordValidation("12345M") -> println("Password is correct")
        else -> println("Access denied")
    }
}