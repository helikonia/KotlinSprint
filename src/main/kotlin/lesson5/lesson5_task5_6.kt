package org.example.lesson5

fun main() {
    println("Enter your height in centimeters")

    val inputHeight = readln().toFloat()
    val height = inputHeight / CENTIMETER_IM_METER

    println("Enter your weight")
    val weight = readln().toFloat()

    val bodyMassIndex = weight / (height * height)
    when {
        bodyMassIndex < BODY_MASS_LOW_BORDER -> println(
            "Your body mass index is %.2f, insufficient body mass".format(bodyMassIndex)
        )

        bodyMassIndex >= BODY_MASS_LOW_BORDER &&
            bodyMassIndex < BODY_MASS_MEDIUM_BORDER
            -> println(
            "Your body mass index is  %.2f, normal body mass".format(bodyMassIndex)
        )

        bodyMassIndex >= BODY_MASS_MEDIUM_BORDER &&
            bodyMassIndex < BODY_MASS_HIGH_BORDER
            -> println("Your body mass index is  %.2f, excess body mass".format(bodyMassIndex))

        bodyMassIndex >= BODY_MASS_HIGH_BORDER
            -> println("Your body mass index is  %.2f, obesity".format(bodyMassIndex))
    }
}

const val CENTIMETER_IM_METER = 100f
const val BODY_MASS_LOW_BORDER = 18.5f
const val BODY_MASS_MEDIUM_BORDER = 25f
const val BODY_MASS_HIGH_BORDER = 30f