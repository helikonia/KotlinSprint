package org.example.lesson15

abstract class WeatherInfoStats() {
    open fun getData() {
        println("Get weather")
    }
}

class Temperature(day: Int) : WeatherInfoStats() {
    override fun getData() {
        println("Get temperature")
    }
}

class PrecipitationAmount(day: Int) : WeatherInfoStats() {
    override fun getData() {
        println("Get precipitation")
    }
}

class WeatherServer() : WeatherInfoStats() {
    fun getWeather(weather: WeatherInfoStats) {
        getData()
    }
}

fun main() {
    val temperature1 = Temperature(1)
    val precipitation1 = PrecipitationAmount(1)
    val weatherServer = WeatherServer()

    weatherServer.getWeather(temperature1)
    weatherServer.getWeather(precipitation1)


}