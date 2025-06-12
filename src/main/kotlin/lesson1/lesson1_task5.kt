package org.example.lesson1

fun main() {

    val totalSecondsInSpace: Int = 6480
    val hours: Int = totalSecondsInSpace / 3600
    val remainingSeconds: Int = totalSecondsInSpace % 3600
    val minutes: Int = remainingSeconds / 60
    val seconds: Int = remainingSeconds % 60

    val formattedTime = String.format("%02d:%02d:%02d", hours, minutes, seconds)

    println(formattedTime)

}