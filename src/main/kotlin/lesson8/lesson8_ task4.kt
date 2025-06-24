package org.example.lesson8

fun main() {

    val animals = arrayOf("Кот", "Собака", "Попугай", "Хомяк", "Лиса")
    var maxLength = 0
    var longest = ""
    for (animal in animals) {
        if (animal.length > maxLength) {
            maxLength = animal.length
            longest = animal
        }
    }
    println("Самое длинное слово: $longest")
}