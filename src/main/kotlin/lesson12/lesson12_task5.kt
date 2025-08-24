package org.example.lesson12

import kotlin.random.Random

class WeatherInfo2(
    dayTemperatureKelvin: Int,
    nightTemperatureKelvin: Int,
    _rainfall: Boolean,
) {
    val dayTemperatureCelsius: Int = dayTemperatureKelvin - 273
    val nightTemperatureCelsius: Int = nightTemperatureKelvin - 273
    val rainfall = _rainfall

    init {
        println("=== Weather Report ===")
        println("Day temperature  : $dayTemperatureCelsius°C")
        println("Night temperature: $nightTemperatureCelsius°C")
        println("Rainfall         : ${if (rainfall) "Yes 🌧️" else "No ☀️"}")
        println("======================")
    }
}


fun main() {
    val listOfDays: MutableList<WeatherInfo2> = mutableListOf()
    for (i in 0 until 30) {
        val dayTemp = Random.nextInt(260, 297)
        val nightTemp = Random.nextInt(260, 297)
        val isRainy = Random.nextBoolean()
        listOfDays.add(WeatherInfo2(dayTemp, nightTemp, isRainy))
    }
    val dayTemps = listOfDays.map { it.dayTemperatureCelsius }
    val nightTemps = listOfDays.map { it.nightTemperatureCelsius }
    val avgDay = dayTemps.average()
    val avgNight = nightTemps.average()
    println("Средняя дневная температура: %.2f".format(avgDay))
    println("Средняя ночная температура: %.2f".format(avgNight))
    val rainyAmount = listOfDays.count() { it.rainfall }
    println("Amount of rainy days is $rainyAmount")
}