package org.example.lesson9

fun main() {

    val names = listOf("Анна", "Иван", "Мария", "Олег", "Юлия")
    names.forEach { println(it) }
    println("amount of names: ${names.size}")
    println("first name: ${names.first()}, last one: ${names.last()}")
}