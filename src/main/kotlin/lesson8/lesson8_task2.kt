package org.example.lesson8

fun main() {
    val arr = intArrayOf(4, 7, 10, 13, 16, 19, 22)
    for (i in arr) {
        if (i % 2 == 0) print("$i ")
    }
}