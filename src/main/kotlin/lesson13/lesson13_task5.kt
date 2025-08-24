package org.example.lesson13

class PhoneContactClass(
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
    println("Enter phone number (digits only):")
    val input = readln()


    try {
        val phoneNumber = input.toLong()
        val contact = PhoneContactClass("Anna", phoneNumber, "Google")
        contact.printContact()
    } catch (e: Exception) {
        println("Error ${e::class.simpleName}")
    }
}