package org.example.lesson9

fun main() {
    val recipeList = listOf(
        "2 яйца",
        "500 мл молока",
        "250 г муки",
        "1 ст. ложка сахара",
        "щепотка соли",
        "2 ст. ложки растительного масла"
    )
    println("В рецепте есть следующие ингредиенты:")
    recipeList.forEach { println(it) }
}