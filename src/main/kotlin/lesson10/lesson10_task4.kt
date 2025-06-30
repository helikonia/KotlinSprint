package org.example.lesson10

fun main() {
    print("Enter your weight: ")
    val weight = readln().toFloat()
    print("Enter your height: ")
    val height = readln().toFloat()
    val bmi: Float = calculateBMI1(weight = weight, height = height)
    println("Your BMI is : %.2f".format(bmi))
    printBMICategory(bmi)
}

fun calculateBMI1(weight: Float, height: Float) = weight / (height * height)

fun printBMICategory(bmi: Float) {
    when {
        (bmi < 18.5) -> println("Недовес")
        (bmi in 18.5..24.9) -> println("Норма")
        (bmi in 25.0..29.9) -> println("Избыточный вес")
        (bmi >= 30.0) -> println("Ожирение")
    }
}