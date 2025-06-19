package org.example.lesson6

fun main() {

    var counter = START
    while (counter >= FINISH) {
        println("$counter")
        counter--
        Thread.sleep(DELAY)
    }
    println("Пуск!")
}

const val START = 5
const val FINISH = 1
const val DELAY = 1000L