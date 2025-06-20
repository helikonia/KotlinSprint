package org.example.lesson6

fun main() {

    println("Enter amount of seconds")
    val input = readln().toInt()
    var timer = input


    while (timer > ZERO) {
        val secondWord = if (timer == 1) "second" else "seconds"
        val progress = SYMBOL.repeat(input - timer + 1)
        println(
            """|$timer $secondWord left
            |Progress: $progress
        """.trimMargin()
        )
        timer -= STEP
        Thread.sleep(SECOND)
    }
    println("Timer is up!")
}


const val ZERO = 0
const val STEP = 1
const val SECOND = 1000L
const val SYMBOL = "█"