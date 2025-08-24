package org.example.lesson13

class ContactInfo(
    val name: String,
    val phoneNumber: Long,
    val company: String?,
)

fun main() {
    val listOfPersons = mutableListOf<ContactInfo>(
        ContactInfo("Anna", 79384756384, "Google"),
        ContactInfo("Ivan", 9876543210, null),
        ContactInfo("Maria", 555111222, "null"),
        ContactInfo("Alex", 444333222, null),
        ContactInfo("Oleg", 999888777, "Yandex")
    )
    val companies = listOfPersons.mapNotNull { it.company }
    val uniqueCompanies = companies.toSet()
    uniqueCompanies.forEach { println(it) }

}