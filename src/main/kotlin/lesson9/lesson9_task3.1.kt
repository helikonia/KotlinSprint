package org.example.lesson9

fun main() {

    val recipeList = listOf<Int>(2, 50, 15)
    println("How many portions do you want?")
    val portions = readln().toInt()
    println(
        "For $portions portions you will need: Eggs - ${recipeList[0] * portions}, milk - ${
            recipeList[1] *
                portions
        }, butter - ${recipeList[2] * portions}"
    )
}