package org.example.lesson2

fun main() {

    val studentAssessment1 = 3f
    val studentAssessment2 = 4f
    val studentAssessment3 = 3f
    val studentAssessment4 = 5f

    val averageScore: Float = (studentAssessment1 + studentAssessment2 + studentAssessment3 + studentAssessment4)/ AMOUNT_OF_STUDENTS
    println(averageScore)
}

const val AMOUNT_OF_STUDENTS = 4