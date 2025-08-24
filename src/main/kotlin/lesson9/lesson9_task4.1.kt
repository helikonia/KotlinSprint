package org.example.lesson9

fun main() {

    println("Enter 5 ingredients, separated by commas and spaces")
    val ingredients = readln().split(", ").toList()
    val sortedIngredients = ingredients.sortedBy { it }

    println(sortedIngredients)
}
