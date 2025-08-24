package org.example.lesson11

class Category(
    val id: Int,
    val name: String,
    val description: String,
    val picture: String,
) {
}

class Recipe(
    val id: Int,
    val name: String,
    val picture: String,
    val ingredients: List<Ingredient>,
    val portionsAmount: Int,
    val preparation: String,
    val isFavorite: Boolean = false,
) {
}

class Ingredient(
    val name: String,
    val quantity: String,
) {
}