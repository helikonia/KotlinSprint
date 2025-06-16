package org.example.lesson4

fun main() {

    val bookedToday = 13
    val bookedTomorrow = 9

    val availableToday = TOTAL_AMOUNT_OF_TABLES > bookedToday
    val availableTomorrow = TOTAL_AMOUNT_OF_TABLES > bookedTomorrow

    println("[Availability of tables for today: $availableToday]\n[Availability of tables for tomorrow: $availableTomorrow]")
}

const val TOTAL_AMOUNT_OF_TABLES = 13
