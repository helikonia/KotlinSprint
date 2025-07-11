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
    for (ingredient in ingredients) {
        if (input == ingredient) {
            println("Ingredient [$input] is in the recipe")
            return
        }
    }
    println("There is no such ingredient in the recipe")
}