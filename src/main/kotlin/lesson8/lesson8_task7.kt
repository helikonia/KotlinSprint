package org.example.lesson8

fun main() {

    print("Enter amount of students")
    val amountOfStudents = readln().toInt()
    val names = Array(amountOfStudents) { "" }
    val grades = IntArray(amountOfStudents)

    for (i in START_COUNTER1 until amountOfStudents) {
        print("Enter name ${i + 1}")
        names[i] = readln()
        print("Enter grade for ${names[i]}")
        grades[i] = readln().toInt()

        if (grades[i] !in MIN_GRADE1..MAX_GRADE1) {
            println("Error!")
            return
        }
    }
    val sum = grades.sum().toFloat() / amountOfStudents
    println("Average grade is %.2f".format(sum))

    for (i in grades.indices) {
        if (grades[i] == MAX_GRADE1)
            println("Highest point: ${names[i]}")
        if (grades[i] < THRESHOLD1)
            println("Lowest point: ${names[i]}")
    }
}

const val START_COUNTER1 = 0
const val MIN_GRADE1 = 1
const val MAX_GRADE1 = 5
const val THRESHOLD1 = 4