package org.example.lesson2

fun main() {

    val interestRate = 16.7
    val initialAmount = 70000
    val amountOfYears = 20

    val interestRateFractional = interestRate / PERCENTAGE

    val finalAmount = initialAmount * Math.pow(1 + interestRateFractional, amountOfYears.toDouble())

    val roundedFinalAmount = String.format("%.3f", finalAmount)

    println(roundedFinalAmount)
}

const val PERCENTAGE = 100
