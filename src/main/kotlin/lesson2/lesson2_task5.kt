package org.example.lesson2

fun main() {

    val initialAmount = 70000
    val amountOfYears = 20


    val finalAmount = initialAmount * Math.pow(1 + INTEREST_RATE, amountOfYears.toDouble())

    val roundedFinalAmount = String.format("%.3f", finalAmount)

    println(roundedFinalAmount)
}

const val INTEREST_RATE = 0.167
