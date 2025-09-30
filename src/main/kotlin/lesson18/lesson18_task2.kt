package org.example.lesson18

import kotlin.random.Random

abstract class Dice(val sides: Int) {
    open fun throwDice() = 0

    fun printThrow() {
        val result = throwDice()
        println("Dice with $sides sides: rolled $result")
    }
}

class Dice4() : Dice(4) {
    override fun throwDice(): Int {
        val randomDice = Random.nextInt(1, sides + 1)
        return randomDice
    }
}

class Dice6() : Dice(6) {
    override fun throwDice(): Int {
        val randomDice = Random.nextInt(1, sides + 1)
        return randomDice
    }
}

class Dice8() : Dice(8) {
    override fun throwDice(): Int {
        val randomDice = Random.nextInt(1, sides + 1)
        return randomDice
    }
}

fun main() {
    val dice1: Dice = Dice4()
    val dice2: Dice = Dice6()
    val dice3: Dice = Dice8()

    val arrayOfDices = arrayOf(dice1, dice2, dice3)

    arrayOfDices.forEach {
        it.printThrow()
    }

}