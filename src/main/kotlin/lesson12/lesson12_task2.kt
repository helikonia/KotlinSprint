package org.example.lesson12

class WeatherInDay(
    var dayTemperature: Int,
    var nightTemperature: Int,
    var rainfall: Boolean,
) {

    fun printDay() {
        println("=== Weather Report ===")
        println("Day temperature  : $dayTemperature°C")
        println("Night temperature: $nightTemperature°C")
        println("Rainfall         : ${if (rainfall) "Yes 🌧️" else "No ☀️"}")
        println("======================")
    }
}

fun main() {
    val todayWeather = WeatherInDay(9, 5, true)
    todayWeather.printDay()
}