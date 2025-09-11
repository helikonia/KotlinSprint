package org.example.lesson17

class Ship(name: String, averageSpeed: Int, motherPort: String) {

    var name = name
        set(value) {
            {
                println("You can not change the name!")
            }
        }
}

fun main() {
    val ship = Ship("Poseidon", 250, "Dallas")

    println(ship.name)
    ship.name = "Mermaid"
}