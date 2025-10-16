package org.example.lesson19

enum class Fish {
    GUPPY,
    ANGEL,
    GOLD,
    SIAMESE_FIGHTING
}

fun main() {
    println("You can add these fishes:")
    for (i in Fish.entries) {
        println(i)
    }
}