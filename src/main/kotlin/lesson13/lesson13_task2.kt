package org.example.lesson13

class PersonInfo(
    val name: String,
    val phoneNumber: Long,
    val company: String?,
) {
    fun printPerson() {
        println(
            """
            - Name: $name
            -Number: $phoneNumber
            -Company: ${company ?: "Did not mention"}
        """.trimIndent()
        )
    }
}

fun main() {
    val person1: PersonInfo = PersonInfo(
        name = "Aleksandr",
        phoneNumber = 7921456497,
        company = null
    )
    person1.printPerson()

}