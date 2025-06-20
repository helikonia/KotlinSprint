package org.example.lesson7

fun main() {

    println("Enter the first number")
    val start = readln().toInt()
    println("Enter the second number")
    val end = readln().toInt()

    if (start <= end) {
        for (i in start..end) {
            if (i % 2 != 0) continue
            if (i % 8 == 0) {
                println("Stop on $i number")
                break
            }
        }
    } else {
        for (i in start downTo end) {
            if (i % 2 != 0) continue
            if (i % 8 == 0) {
                println("Stop on $i number")
                break
            }
        }
    }
}