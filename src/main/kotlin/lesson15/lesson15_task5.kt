package org.example.lesson15

import java.time.temporal.TemporalAmount

interface VehiclesMoving {
    fun move()
}

interface CarryPassengers {
    val maxPassengers: Int
    fun loadPassengers(): Int
    fun unloadPassengers()
}

interface CarryCargo {
    val maxCargo: Int
    fun loadCargo(): Int
    fun unloadCargo()
}


class Car(
    override val maxPassengers: Int = 3
) : VehiclesMoving, CarryPassengers {

    override fun move() {
        println("Car is moving")
    }

    override fun loadPassengers(): Int {
        println("Passengers loaded")
        return maxPassengers
    }

    override fun unloadPassengers() {
        println("Passengers unloaded")
    }
}

class Van(
    override val maxPassengers: Int = 1, override val maxCargo: Int = 2
) : VehiclesMoving, CarryPassengers, CarryCargo {
    override fun move() {
        println("van is moving")
    }

    override fun loadPassengers(): Int {
        println("Passengers loaded")
        return maxPassengers
    }

    override fun unloadPassengers() {
        println("Passengers loaded")
    }

    override fun loadCargo(): Int {
        println("Cargo loaded")
        return maxCargo
    }

    override fun unloadCargo() {
        println("Cargo unloaded")
    }
}

fun main() {

    var passengers = 6
    var cargo = 2
    while (cargo > 0 && passengers > 0) {
        val van = Van()
        cargo -= van.loadCargo()
        passengers -= van.loadPassengers()
        van.move()
        van.unloadCargo()
        van.unloadPassengers()
    }
    while (passengers > 0) {
        val car = Car()
        passengers -= car.loadPassengers()
        car.move()
        car.unloadPassengers()
    }
}