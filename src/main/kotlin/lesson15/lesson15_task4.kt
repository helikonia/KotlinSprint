package org.example.lesson15

abstract class Item(val name: String, val amount: Int) {
}

class Instrument(name: String, amount: Int) : Item(name = name, amount = amount) {
    private val components = mutableListOf<Component>()

    fun addComponent(component: Component) {
        components.add(component)
    }

    fun componentSearch(): List<String> {
        println("Searching...")
        return components.map { it.name }
    }

    fun printComponents() {
        println("Components for $name:")
        components.forEach {
            println("- ${it.name} (Amount: ${it.amount})")
        }
    }
}

class Component(name: String, amount: Int, componentTo: Instrument) : Item(name = name, amount = amount)


fun main() {
    val instrument1 = Instrument("Guitar", 14)
    val component1 = Component("Mediator", 40, instrument1)
    val component2 = Component("Capodastr", 30, instrument1)

    instrument1.addComponent(component1)
    instrument1.addComponent(component2)
    instrument1.componentSearch()
    instrument1.printComponents()
}