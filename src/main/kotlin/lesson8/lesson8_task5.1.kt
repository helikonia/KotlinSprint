package org.example.lesson8

fun main() {

    println("enter amount of ingredients:")

    val amountOfIngredients = readln().toInt()
    val arrayOfIngredients: Array<String> = Array(amountOfIngredients) { "" }

    for (i in arrayOfIngredients.indices) {
        println("Enter ingredient ${i + 1}")
        arrayOfIngredients[i] = readln()
    }
    println("You entered:")
    println(arrayOfIngredients.joinToString(", "))
}