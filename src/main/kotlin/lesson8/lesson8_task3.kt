package org.example.lesson8

fun main() {
    val data = arrayOf<String>("Кот", "Собака", "Попугай", "Хомяк", "Лиса")

    for (i in data.lastIndex downTo 0)
        println(data[i])
}