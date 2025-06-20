package org.example.lesson6

fun main() {
    while (true) {
        println("Секундочка...")
        Thread.sleep(MILLI_SECOUNDS)
        println("Ждём…")
        Thread.sleep(MILLI_SECOUNDS)
    }

}

const val MILLI_SECOUNDS = 700L