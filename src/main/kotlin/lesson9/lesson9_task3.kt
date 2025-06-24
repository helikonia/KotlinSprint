package org.example.lesson9

fun main() {

    val names = listOf("Анна", "Иван", "Мария", "Олег", "Юлия", "Катерина")
    val upperNames = names.map { it.uppercase() }
    upperNames.forEach { println(it) }
}