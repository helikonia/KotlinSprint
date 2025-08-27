package org.example.lesson15

interface Swimming {
    fun startSwimming() {
        println("Swim")
    }

    fun stopSwimming() {
        println("Stop")
    }
}

interface Flying {
    fun startFlying() {
        println("fly")
    }

    fun stopFlying() {
        println("stop")
    }
}

class Duck(val species: String, val color: String, val age: Int) : Swimming, Flying {
    override fun startFlying() {
        println("Duck takes off")
    }
}

class Seagull(val species: String, val color: String, val age: Int) : Flying {
    override fun startFlying() {
        println("Seagull takes off")
    }
}

class Karas(val species: String, val color: String, val age: Int) : Swimming {
    override fun startSwimming() {
        println("Karas goes into water")
    }
}

fun main() {
    val duck1 = Duck("Common", "brown", 2)
    val seagull1 = Seagull("Common", "brown", 2)
    val karas1 = Karas("Common", "brown", 2)

    duck1.startFlying()
    duck1.stopFlying()
    duck1.startSwimming()
    duck1.stopSwimming()

    seagull1.startFlying()
    seagull1.stopFlying()

    karas1.startSwimming()
    karas1.stopSwimming()
}