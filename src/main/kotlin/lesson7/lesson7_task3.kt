package org.example.lesson7

fun main() {
    val names = listOf("Анна", "", "Li", "Алексей", "Мар", "Анна123", "Елена")
    for (name in names) {
        if (name.isBlank()) continue
        if (name.length < 3) continue
        if (name.any { it.isDigit() }) {
            println("Error! Unacceptable name: $name")
            return
        }
        println("$name is accepted!")
    }
}