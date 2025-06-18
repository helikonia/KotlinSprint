package org.example.lesson4

fun main() {
    val weight1 = 20
    val volume1 = 80
    val weight2 = 50
    val volume2 = 100

    println(
        "Cargo weighting $weight1 kg and having a volume of $volume1 l matches the \"Average\" category:" +
                " ${weight1 > MIN_WEIGHT_AVERAGE && weight1 <= MAX_WEIGHT_AVERAGE && volume1 < MAX_VOLUME_AVERAGE}"
    )
    println(
        "Cargo weighting $weight2 kg and having a volume of $volume2 l matches the \"Average\" category:" +
                " ${weight2 > MIN_WEIGHT_AVERAGE && weight2 <= MAX_WEIGHT_AVERAGE && volume2 < MAX_VOLUME_AVERAGE}"
    )


}

const val MIN_WEIGHT_AVERAGE = 35
const val MAX_WEIGHT_AVERAGE = 100
const val MAX_VOLUME_AVERAGE = 100