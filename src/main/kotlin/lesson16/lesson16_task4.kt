package org.example.lesson16

class Order(private val numberOfOrder: Int = 1) {

    var isReady: Boolean = false

    fun changeStatus(managerDecision: Boolean) {

        if (managerDecision) {
            println("Enter new status:")
            val newStatus = readln().toBooleanStrictOrNull()
            if (newStatus != null) {

                isReady = newStatus
                println("Success! New status is $isReady!")

            } else println("Invalid number")
            return
        } else println("Manager did not approve changes!")
    }
}

fun main() {

    val order = Order()
    order.changeStatus(true)
}