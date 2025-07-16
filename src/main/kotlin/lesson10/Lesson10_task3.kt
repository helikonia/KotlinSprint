package org.example.lesson10

fun main() {
    print("Enter your weight: ")
    val weight = readln().toFloat()
    print("Enter your height: ")
    val height = readln().toFloat()
    val BMI: Float = calculateBMI(weight = weight, height = height)
    println("Your BMI is : %.2f".format(BMI))
}

fun calculateBMI(weight: Float, height: Float) = weight / (height * height)
