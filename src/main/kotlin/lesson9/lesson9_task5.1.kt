package org.example.lesson9

fun main() {

    val ingredientsList = mutableListOf<String>()
    val ingredientsAmount = 5
    for (i in 0 until ingredientsAmount) {
        println("Enter ingredient:")
        val ingredient = readln()
        ingredientsList.add(ingredient)
    }
    val uniqueIngredients = ingredientsList.toSet()
    val sortedIngredients = uniqueIngredients.sortedBy { it.lowercase() }
    val formattedIngredients = sortedIngredients.mapIndexed { index, ingredient ->
        if (index == 0)
            ingredient.replaceFirstChar { it.uppercaseChar() }
        else
            ingredient
    }
    println(formattedIngredients.joinToString(", "))
}