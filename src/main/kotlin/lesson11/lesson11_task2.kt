package org.example.lesson11

class User1(
    val id: Int,
    val login: String,
    var password: String,
    val email: String,
    var bio: String? = null
) {
    fun output() {
        println("ID: $id")
        println("Login: $login")
        println("Password: $password")
        println("Email: $email")
        println("Bio: ${bio ?: "No bio"}")

    }

    fun inputBio(): String? {
        println("Enter your bio:")
        val bioInput = readln()
        bio = bioInput
        return bio
    }

    fun changePassword() {
        println("Enter your password:")
        val passwordInput = readln()
        if (passwordInput == password) {
            println("Enter new password")
            val newPassword = readln()
            password = newPassword
            println("password has changed")
        } else {
            println("enter valid password")
            return
        }
    }
}

fun main() {
    val user1 = User1(
        id = 1,
        login = "dshfios",
        password = "0000",
        email = "spdjkfspo",
    )

    user1.inputBio()
    user1.changePassword()
    user1.output()
}