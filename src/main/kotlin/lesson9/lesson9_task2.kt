package org.example.lesson9

fun main() {

    val names = listOf("Анна", "Иван", "Мария", "Олег", "Юлия", "Катерина")
    val longNames = names.filter { it.length > 4 }
    longNames.forEach { println(it) }
    println("Overall: ${longNames.size}")
}