package org.example.lesson8

fun main() {

    val numbers = intArrayOf(25, 3, 17, 42, 8, 31)
    var min = numbers[0]
    var max = numbers[0]
    for (i in numbers) {
        if (i < min) {
            min = i
        }
        if (i > max) {
            max = i
        }
    }
    println(
        """|Минимум: $min
        |Максимум: $max""".trimMargin()
    )

}