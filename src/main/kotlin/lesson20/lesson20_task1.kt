package org.example.lesson20

fun main() {
    val createMessage: (String) -> String = { username: String -> "Happy New Year, \n$username!" }
    println(createMessage("Anna"))
}