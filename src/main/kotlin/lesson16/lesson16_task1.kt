package org.example.lesson16

import kotlin.random.Random

class BoneRandom() {
    private val randomSide = Random.nextInt(1, 7)
    fun printSide() {
        println("Number is $randomSide")
    }
}

fun main() {
    val bone = BoneRandom()
    bone.printSide()
}