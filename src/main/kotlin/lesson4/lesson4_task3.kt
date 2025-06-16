package org.example.lesson4

fun main() {

    val sunnyWeatherIdeal: Boolean = true
    val openedTentIdeal: Boolean = true
    val airHumidityPercentsIdeal = 20
    val seasonIdeal = "not winter"

    val sunnyWeatherToday = true
    val openedTentNow = true
    val airHumidityPercentsNow = 20
    val currentSeason = "winter"

    println("Good conditions: ${sunnyWeatherToday == sunnyWeatherIdeal && openedTentNow == openedTentIdeal && airHumidityPercentsNow == airHumidityPercentsIdeal && currentSeason == seasonIdeal}")
}