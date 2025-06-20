package org.example.lesson7

fun main() {
    val temps = listOf(22, 25, 29, 33, 37, 45, 51, 49)
    for (i in temps) {
        if (i >= 50) {
            println("temperature: $i - too high")
            break
        }
        println("temperature: $i - normal")
    }
}