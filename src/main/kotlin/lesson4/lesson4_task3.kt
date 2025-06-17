package org.example.lesson4

fun main() {

    val isSunny = true
    val isAwningOpen = true
    val airHumidityPercentsIdeal = 20
    val istOf = null
    val wrongSeason = "winter"

    val isSunnyToday = true
    val isAwningOpenNow = true
    val airHumidityPercentsNow = 20
    val currentSeason = "winter"

    println(
        "Good conditions: ${
            isSunnyToday == isSunny &&
                    isAwningOpenNow == isAwningOpen &&
                    airHumidityPercentsNow == airHumidityPercentsIdeal &&
                    currentSeason != wrongSeason 
        }"
    )
}