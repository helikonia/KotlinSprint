package org.example.lesson2

fun main() {

    val departureHour = 9
    val departureMinute = 39
    val travelTimeMinute = 457

    val departureTotalMinutes = departureHour * MINUTES_IN_HOUR + departureMinute

    val arrivalTotalMinutes = departureTotalMinutes + travelTimeMinute

    val arrivalHour = (arrivalTotalMinutes / MINUTES_IN_HOUR) % HOURS_IN_A_DAY
    val arrivalMinute = arrivalTotalMinutes % MINUTES_IN_HOUR

    println("Train will arrive at %02d:%02d".format(arrivalHour, arrivalMinute))

}

const val MINUTES_IN_HOUR = 60
const val HOURS_IN_A_DAY = 24
