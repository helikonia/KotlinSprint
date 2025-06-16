package org.example.lesson4

fun main() {

    val trainingDay = 8

    val armExercise = trainingDay % 2 == 1
    val pressExercise = armExercise
    val legsExercise = !armExercise
    val backExercise = legsExercise

    println("""
        Exercises for arms: $armExercise
        exercises for legs: $legsExercise
        exercises for back: $backExercise
        exercises for press: $pressExercise
    """.trimIndent())
}