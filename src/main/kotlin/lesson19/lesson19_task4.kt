package org.example.lesson19

enum class Cartridge(val damage: Int) {
    BLUE(5),
    GREEN(10),
    RED(20);
}

class Tank(val model: String) {
    private var currentCartridge: Cartridge? = null

    fun arm(cartridge: Cartridge) {
        currentCartridge = cartridge
        println("Tank armed with ${cartridge.name.lowercase()} cartridges")
    }

    fun shoot() {
        if (currentCartridge == null) {
            println("Tank is not armed!")
            return
        }

        println("Shooting! Dealt ${currentCartridge!!.damage} damage")
    }
}

fun main() {
    val tank = Tank("T-90")

    // Танк изначально не заряжен
    tank.shoot()

    // Заряжаем синими патронами и стреляем
    tank.arm(Cartridge.BLUE)
    tank.shoot()

    // Меняем на зеленые и стреляем
    tank.arm(Cartridge.GREEN)
    tank.shoot()

    // Меняем на красные и стреляем
    tank.arm(Cartridge.RED)
    tank.shoot()
}
