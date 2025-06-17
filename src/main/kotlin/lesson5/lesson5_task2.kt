package org.example.lesson5

fun main() {
    println("Enter your date of birth")
    val userBirthDate = readln(). toInt()
    val currentYear = 2025
    val userAge = currentYear - userBirthDate

    val resultText = if (userAge >= AGE_OF_MAJORITY) {
        "Show the screen with special content"}
    else if (userAge == 16 || userAge == 17)
    { "Show limited content"}
    else
    {"Back to main screen"}
    println(resultText)
}
const val AGE_OF_MAJORITY = 18