package org.example.lesson8

fun main() {

    println("Enter amount of grades")

    val amount = readln().toInt()
    val grades = IntArray(amount)

    for (i in START_COUNTER until amount) {
        println("Enter grade ${i + 1}:")
        grades[i] = readln().toInt()
        if (grades[i] !in MIN_GRADE..MAX_GRADE) {
            println("Error!")
            return
        }
    }
    val averageScore = grades.sum().toFloat() / amount.toFloat()
    println("Average score is: %.2f".format(averageScore))

    val maxScore = grades.maxOrNull()
    println("Maximum: $maxScore")

    var underGrades = START_COUNTER

    for (i in grades) {
        if (i < THRESHOLD) {
            underGrades++
        }
    }
    println("Amount of low grades: $underGrades")
}

const val START_COUNTER = 0
const val MIN_GRADE = 1
const val MAX_GRADE = 5
const val THRESHOLD = 4