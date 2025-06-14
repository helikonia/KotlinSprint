package org.example.lesson1

fun main() {

    val secondsInSpace = 6480
    val hours: Int = secondsInSpace / SECONDS_IN_HOUR
    val remainingSeconds: Int = secondsInSpace % SECONDS_IN_HOUR
    val minutes: Int = remainingSeconds / MINUTES_IN_HOUR
    val seconds: Int = remainingSeconds % MINUTES_IN_HOUR

    val formattedTime = String.format("%02d:%02d:%02d", hours, minutes, seconds)

    println(formattedTime)

}

const val SECONDS_IN_HOUR: Int = 3600
const val MINUTES_IN_HOUR: Int = 60
