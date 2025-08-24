package org.example.lesson12

class WeatherInfo(
    dayTemperatureKelvin: Int,
    _nightTemperatureKelvin: Int,
    _rainfall: Boolean,
) {
    val dayTemperatureCelsius: Int = dayTemperatureKelvin - 273
    val nightTemperatureCelsius: Int = _nightTemperatureKelvin - 273
    val rainfall = _rainfall

    fun printDay() {
        println("=== Weather Report ===")
        println("Day temperature  : $dayTemperatureCelsius°C")
        println("Night temperature: $nightTemperatureCelsius°C")
        println("Rainfall         : ${if (rainfall) "Yes 🌧️" else "No ☀️"}")
        println("======================")
    }
}

fun main() {
    val weatherDay1 = WeatherInfo(299, 279, true)
    weatherDay1.printDay()
}