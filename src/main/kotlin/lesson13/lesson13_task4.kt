package org.example.lesson13

class PhoneContact(
    val name: String,
    val phoneNumber: Long,
    val company: String?,
) {
    fun printContact() {
        println(
            """
            - Name: $name
            - Number: $phoneNumber
            - Company: ${company ?: "Did not mention"}
            """.trimIndent()
        )
    }
}

fun main() {

    val phoneBook = mutableListOf<PhoneContact>()
    println("How many contacts do you want to enter?")
    val amount = readln().toIntOrNull()
    if (amount == null) {
        return
    } else
        for (contact in 0 until amount) {
            println("Enter name: ")
            val name = readln()
            println("Enter phone number: ")
            val phoneNumber = readln().toLongOrNull()
            if (phoneNumber == null) {
                println("Enter valid phone number!")
                continue
            }
            println("Enter company: ")
            val company = readLine()
            phoneBook.add(PhoneContact(name, phoneNumber, company))
        }
    phoneBook.forEach { it.printContact() }
}