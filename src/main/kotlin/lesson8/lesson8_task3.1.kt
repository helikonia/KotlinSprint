package org.example.lesson8

fun main() {
    val ingredients = arrayOf(
        "Мука",
        "Яйца",
        "Молоко",
        "Сахар",
        "Соль",
        "Масло"
    )
    println("Enter the ingredient:")
    val input = readln()
    val found = ingredients.any { it.equals(input, ignoreCase = true) }
    if (found) {
        println("Ingredient [$input] is in the recipe")
    } else {
        println("There is no such ingredient in the recipe")
    }
}