package org.example.lesson6

fun main() {
    println("Enter the number")
    val inputNum = readln().toInt()
    println("Enter the step")
    val inputStep = readln().toInt()
    var counter = inputNum
    while (counter > STOP) {
        println(counter)

        counter -= inputStep
        Thread.sleep(MILLIS)
        if (
            counter < STOP
        ) {
            println(STOP)
            break
        }
    }
}

const val MILLIS = 500L
const val STOP = 0