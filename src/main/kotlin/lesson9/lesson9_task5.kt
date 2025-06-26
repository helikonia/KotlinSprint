package org.example.lesson9

fun main() {

    val students = mutableListOf<Pair<String, List<Float>>>()

    print("How many students? ")
    val amount = readln().trim().toIntOrNull() ?: run {
        print("unacceptable input")
        return
    }

    for (i in 0 until amount) {
        print("Enter name ")
        val name = readln()
        print("Enter grades separated by commas ")
        val grades = readln()
            .split(",")
            .map { it.trim().toFloat() }
        students.add(name to grades)
    }
    for ((name, grades) in students) {
        val average = grades.average()
        println("$name: %.2f".format(average))
    }
    val weakStudents = students.filter { it.second.average() < 4 }
    println("Weak students are:")
    weakStudents.forEach { (name, grades) ->

        println("$name: %.2f".format(grades.average()))
    }
}
