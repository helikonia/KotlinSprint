package org.example.lesson2

fun main() {

    val minedCrystalOre = 7
    val minedIronOre = 11
    val miningBuffPercentage = 0.2f

    val buffGainedCrystalOre = minedCrystalOre * miningBuffPercentage
    val wholeBuffGainedCrystalOre = buffGainedCrystalOre.toInt()
    val buffGainedIronOre = minedIronOre * miningBuffPercentage
    val wholeBuffGainedIronOre = buffGainedIronOre.toInt()

    println(wholeBuffGainedCrystalOre)
    println(wholeBuffGainedIronOre)

}