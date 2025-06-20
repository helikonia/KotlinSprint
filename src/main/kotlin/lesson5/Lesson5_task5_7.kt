package org.example.lesson5

fun main() {
    println("Enter the distance in kilometers")
    val distance = readln().toFloat()

    println("Enter the fuel consumption for 100 kilometers in liters")
    val fuelConsumption = readln().toFloat()

    println("Enter current price of fuel per liter")
    val price = readln().toFloat()

    val fuelSum = (distance * fuelConsumption) / KILOMETERS
    val totalPrice = fuelSum * price

    println("The sum of fuel will be %.2f liters, final price will be %.2f".format(fuelSum, totalPrice))

}

const val KILOMETERS = 100