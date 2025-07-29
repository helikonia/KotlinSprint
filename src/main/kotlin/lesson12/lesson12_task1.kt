package org.example.lesson12

class WeatherDay() {

    var dayTemperature: Int = 5
    var nightTemperature: Int = 7
    var rainfall: Boolean = false

    init {
        println("Weather day is added")
    }

    fun printDay() {
        println("=== Weather Report ===")
        println("Day temperature  : $dayTemperature°C")
        println("Night temperature: $nightTemperature°C")
        println("Rainfall         : ${if (rainfall) "Yes 🌧️" else "No ☀️"}")
        println("======================")
    }
}

fun main() {
    val day1 = WeatherDay()
    day1.dayTemperature = 9
    day1.nightTemperature = 3
    day1.rainfall = true
    day1.printDay()


    val day2 = WeatherDay()
    day2.dayTemperature = 22
    day2.nightTemperature = 20
    day2.rainfall = false
    day2.printDay()

}