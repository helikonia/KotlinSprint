package org.example.lesson18

abstract class Animal(val animalName: String) {
    abstract fun eat()

    fun sleep() {
        println("$animalName -> sleeps")
    }
}


class Fox(name: String = "Fox") : Animal(name) {
    override fun eat() {
        println("$animalName -> eats berries")
    }
}

class Dog(name: String = "Dog") : Animal(name) {
    override fun eat() {
        println("$animalName -> eats bones")
    }
}

class Cat(name: String = "Cat") : Animal(name) {
    override fun eat() {
        println("$animalName -> eats fish")
    }
}

fun main() {
    val animal1: Animal = Fox("Foxy")
    val animal2: Animal = Dog("Bobby")
    val animal3: Animal = Cat("Murzik")

    val listOfAnimals = listOf<Animal>(animal1, animal2, animal3)
    listOfAnimals.forEach {
        it.eat()
    }
}