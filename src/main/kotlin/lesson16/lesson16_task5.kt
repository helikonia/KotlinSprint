package org.example.lesson16

class Player(val playerName: String, private var strength: Int = 10, var health: Int = 100) {

    var isDead = false
    fun dealDamage(amountOfDamage: Int): Int {
        health -= amountOfDamage
        println("$amountOfDamage damage have been done to $playerName! $health hp is left")
        return if (health <= 0) death()
        else
            health
    }

    fun heal(amountOfHealing: Int): Int {
        if (isDead) {
            println("Cannot heal dead player $playerName")
            return health
        }
        health += amountOfHealing
        println("$playerName healed $amountOfHealing hp! $health hp is left!")
        return health
    }

    private fun death(): Int {
        strength = 0
        health = 0
        isDead = true
        println("player $playerName is dead! Strength is $strength, health is lower than $health")
        return health
    }
}

fun main() {
    val player = Player("Oleg")
    player.dealDamage(50)
    player.heal(30)
    player.dealDamage(90)
    player.heal(40)
}