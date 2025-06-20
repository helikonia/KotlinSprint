package org.example.lesson7

fun main() {

    println("Enter passwords with spaces")
    val passwordString = readln().split(" ")

    fun checkPasswords(passwordString: List<String>) {

        for (password in passwordString) {
            if (password.length < 6) {
                println("Too short")
                continue
            }
            if (' ' in password) {
                println("Unacceptable symbol")
                continue
            }
            if ("admin" in password.lowercase()) {
                println("Suspicious password $password")
                return
            }
            if (password.any { it.isDigit() } &&
                password.any { it.isUpperCase() }) println("Reliable password")
            else println("Weak password")
        }
    }
    checkPasswords(passwordString)
}