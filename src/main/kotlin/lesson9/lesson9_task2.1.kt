package org.example.lesson9

fun main() {
    val recipeList = mutableListOf<String>(
        "2 яйца",
        "500 мл молока",
        "250 г муки"
    )
    println("В рецепте есть базовые ингредиенты: ${recipeList.joinToString(", ")}")
    println("Желаете добавить еще?")
    val input = readln()
    if (input.equals("да", ignoreCase = true)) {
        println("Какой ингредиент вы хотите добавить?")
    } else {
        return
    }
    val ingredientInput = readln()
    recipeList.add(ingredientInput)
    println("Теперь в рецепте есть следующие ингредиенты: ${recipeList.joinToString(", ")}")
}