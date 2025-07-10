package org.example.lesson7

fun main() {
    println("Enter end number:")
    val endNumber = readln().toIntOrNull()
    if (endNumber == null) {
        println("Invalid number")
        return
    }
    for (i in 0..endNumber step 2) {

        println(i)
    }
}