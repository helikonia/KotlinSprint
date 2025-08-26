package org.example.lesson14

open class Ship(
    val name: String,
    val speed: Int = 100,
    val passengerCapacity: Int = 50,
    val cargoCapacity: Int = 150,
    val iceBreaker: Boolean = false,

    ) {
}

class CargoShip(name: String, speed: Int = 50, cargoCapacity: Int = 500) : Ship(name) {
}

class IceBreakerShip(name: String, speed: Int = 50, cargoCapacity: Int = 100, iceBreaker: Boolean = true) : Ship(name) {
}

class Liner(name: String, passengerCapacity: Int = 500) : Ship(name)