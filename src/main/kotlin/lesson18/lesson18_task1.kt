package org.example.lesson18

class Order(val numberOfOrder: Int) {
    fun printOrder(item: String) {
        println("You ordered 1 item: $item")
    }

    fun printOrder(items: List<String>) {
        println("You ordered items: $items")
    }
}

fun main() {
    val order1 = Order(1)
    val order2 = Order(2)

    order1.printOrder("Teddy Bear")
    order2.printOrder(listOf<String>("Screwdriver", "Bag"))
}