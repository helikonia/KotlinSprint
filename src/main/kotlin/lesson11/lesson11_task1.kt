package org.example.lesson11

class User5(
    val id: Int,
    val login: String,
    val password: String,
    val email: String,
) {
}

fun main() {
    val user1: User5 = User5(
        id = 1,
        login = "s[dpkf",
        password = "98fso",
        email = "sd'pojfsp",
    )
    val user2: User5 = User5(
        id = 2,
        login = "dso;fihs",
        password = "sdpojf",
        email = "ospjdf",
    )

    println(user1.id)
    println(user1.login)
    println(user1.password)
    println(user1.email)
    println()
    println(user2.id)
    println(user2.login)
    println(user2.password)
    println(user2.email)
}