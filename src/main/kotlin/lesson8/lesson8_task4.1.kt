package org.example.lesson8

fun main() {
    val ingredients: Array<String> = arrayOf(
        "Мука",
        "Яйца",
        "Молоко",
        "Сахар",
        "Соль",
        "Масло"
    )
    for (i in ingredients) {
        println("ingredient ${ingredients.indexOf(i) + 1}: $i")
    }
    println("Enter ingredient you want to change:")
    val toChange = readln()
    if (toChange !in ingredients) {
        println("There is no such ingredient in the recipe!")
        return
    } else {
        println("Enter ingredient to change into:")
        val isChange = readln()
        val index = ingredients.indexOf(toChange)
        ingredients.set(index, isChange)
    }
    println("You saved the recipe:")
    ingredients.forEach { println(it) }
}