package org.example.lesson16

class Circle(private val radius: Double) {
    private val pi = 3.14

    fun countLength() = 2 * pi * radius
    fun countArea() = pi * radius * radius
}

fun main() {
    val circle = Circle(7.00)
    println(circle.countLength())
    println(circle.countArea())
}