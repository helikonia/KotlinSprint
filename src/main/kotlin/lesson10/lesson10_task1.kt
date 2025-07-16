package org.example.lesson10

fun main() {
    val a = 5
    val b = 3
    val result = sum(a = a, b = b)
    println(result)

}

fun sum(a: Int, b: Int): Int = a + b