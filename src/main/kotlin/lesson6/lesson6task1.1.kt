package org.example.lesson6

fun main() {

    println("Enter login for registration:")
    val loginReg = readln()

    println("Enter password for registration:")
    val passwordReg = readln()

    println("Enter your login:")
    var loginInput = readln()

    println("Enter your password:")
    var passwordInput = readln()
    while (loginReg != loginInput || passwordReg != passwordInput) {
        println("Login or password incorrect. Try again.")
        println("Enter your login:")
        loginInput = readln()
        println("Enter your password:")
        passwordInput = readln()
    }
    if (loginReg == loginInput && passwordReg == passwordInput) {
        println("Authorization succeeded")
    }
}