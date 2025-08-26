package org.example.lesson14

import kotlin.String

open class Ship2(
    val type: String,
    val name: String,
    val speed: Int = 100,
    val passengerCapacity: Int = 50,
    val cargoCapacity: Int = 150,
    val iceBreaker: Boolean = false,
    val cargoLoading: String,

    ) {
    fun printData() {
        println(
            """|Type - $type
            |Name - $name
            |Speed - $speed
            |Passenger capacity - $passengerCapacity
            |Cargo capacity - $cargoCapacity
            |Ice breaker availability - $iceBreaker
            |Cargo loading - $cargoLoading
            |
        """.trimMargin()
        )
    }
}

class CargoShip2(
    type: String = "Cargo",
    name: String,
    speed: Int = 50,
    cargoCapacity: Int = 500,
    cargoLoading: String = "активирует погрузочный кран",
) : Ship2(
    type = type,
    name = name,
    speed = speed,
    cargoCapacity = cargoCapacity,
    cargoLoading = cargoLoading
) {
}

class IceBreakerShip2(
    type: String = "Ice Breaker",
    name: String,
    speed: Int = 50,
    cargoCapacity: Int = 100,
    iceBreaker: Boolean = true,
    cargoLoading: String = "открывает ворота со стороны кормы",
) : Ship2(
    type = type,
    name = name,
    speed = speed,
    cargoCapacity = cargoCapacity,
    iceBreaker = iceBreaker,
    cargoLoading = cargoLoading,
) {
}

class Liner2(
    type: String = "Liner",
    name: String,
    passengerCapacity: Int = 500,
    cargoLoading: String = "выдвигает горизонтальный трап со шкафута",
) : Ship2(
    type = type,
    name = name,
    passengerCapacity = passengerCapacity,
    cargoLoading = cargoLoading
) {

}

fun main() {
    val cargo1 = CargoShip2(name = "Big boy")
    cargo1.printData()
    val iceBreaker1 = IceBreakerShip2(name = "Queen")
    iceBreaker1.printData()
    val liner1 = Liner2(name = "Delight")
    liner1.printData()
}
