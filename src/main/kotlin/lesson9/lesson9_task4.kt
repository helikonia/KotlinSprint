package org.example.lesson9

fun main() {

    val mutableListNames = mutableListOf<String>()

    print("How many names do you want to enter? ")
    val inputAmount = readln().toInt()
    for (i in ZERO until inputAmount) {
        print("Enter the name ")
        val name = readln().trim()
        mutableListNames.add(name)
    }
    val vowels = listOf('а', 'о', 'у', 'э', 'е', 'и', 'ю', 'я')
    val mutableListLowerNames = mutableListNames.map { it.lowercase() }
    val filtered = mutableListLowerNames.filter { it.first() in vowels }

    println("Names starting with vowel: ${filtered.joinToString(" ,")}")
    println("Overall: ${filtered.size}")
}

const val ZERO = 0