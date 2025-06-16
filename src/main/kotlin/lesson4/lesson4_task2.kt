package org.example.lesson4

fun main() {
    val minWeightAverage = 35
    val maxWeightAverage = 100
    val maxVolumeAverage = 100

    val weight1 = 20
    val volume1 = 80
    val weight2 = 50
    val volume2 = 100

    println("Cargo weighting $weight1 kg and having a volume of $volume1 l matches the \"Average\" category: ${weight1 > minWeightAverage && weight1 <= maxWeightAverage && volume1 < maxVolumeAverage}")
    println("Cargo weighting $weight2 kg and having a volume of $volume2 l matches the \"Average\" category: ${weight2 > minWeightAverage && weight2 <= maxWeightAverage && volume2 < maxVolumeAverage}")


}