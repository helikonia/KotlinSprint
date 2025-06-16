package org.example.lesson2

fun main() {

    val minedCrystalOre = 7
    val minedIronOre = 11
    val miningBuffPercents = 20f
    val miningBuffPercentage: Float = miningBuffPercents / PERCENTAGE_MINING

    val buffGainedCrystalOre = minedCrystalOre * miningBuffPercentage
    val wholeBuffGainedCrystalOre = buffGainedCrystalOre.toInt()
    val buffGainedIronOre = minedIronOre * miningBuffPercentage
    val wholeBuffGainedIronOre = buffGainedIronOre.toInt()

    println(wholeBuffGainedCrystalOre)
    println(wholeBuffGainedIronOre)

}

const val PERCENTAGE_MINING = 100