package org.example.lesson10

fun main() {
    val a = 4
    val b = 7
    println(maxOfTwo(a, b))

}

fun maxOfTwo(a: Int, b: Int): Int = if (a > b) a else b