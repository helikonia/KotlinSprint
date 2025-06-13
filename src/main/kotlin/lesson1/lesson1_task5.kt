package org.example.lesson1

fun main() {

    val hours: Int = GAGARIN_SECONDS_IN_SPACE / SECONDS_IN_HOUR
    val remainingSeconds: Int = GAGARIN_SECONDS_IN_SPACE % SECONDS_IN_HOUR
    val minutes: Int = remainingSeconds / MINUTES_IN_HOUR
    val seconds: Int = remainingSeconds % MINUTES_IN_HOUR

    val formattedTime = String.format("%02d:%02d:%02d", hours, minutes, seconds)

    println(formattedTime)

}

const val GAGARIN_SECONDS_IN_SPACE: Int = 6480
const val SECONDS_IN_HOUR: Int = 3600
const val MINUTES_IN_HOUR: Int = 60
