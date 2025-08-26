package org.example.lesson14

import kotlin.math.PI

abstract class Figure(val color: String) {
    abstract fun area(): Double
    abstract fun perimeter(): Double
}

class Circle(
    color: String,
    val radius: Double,
) : Figure(color = color) {
    override fun area(): Double = PI * radius * radius
    override fun perimeter(): Double = 2 * PI * radius

}

class Rectangle(
    color: String,
    val length: Double,
    val width: Double,
) : Figure(color = color) {
    override fun area(): Double = length * width
    override fun perimeter(): Double = (length + width) * 2
}

fun main() {
    val circle1 = Circle("black", 6.00)
    val circle2 = Circle("white", 9.00)
    val rectangle1 = Rectangle("black", 40.00, 30.00)
    val rectangle2 = Rectangle("white", 90.00, 40.00)

    val listOfFigures = listOf(circle1, circle2, rectangle1, rectangle2)

    val blackPerimeterSum = listOfFigures
        .filter { it.color.equals("black", ignoreCase = true) }
        .sumOf { it.perimeter() }
    println(blackPerimeterSum)

    val whiteAreaSum = listOfFigures
        .filter { it.color.equals("white", ignoreCase = true) }
        .sumOf { it.area() }
    println(whiteAreaSum)
}