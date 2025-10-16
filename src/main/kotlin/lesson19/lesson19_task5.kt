package org.example.lesson19

enum class Sex {
    MALE,
    FEMALE
}

class Person(var personsName: String, var sex: Sex?) {
}

fun main() {
    println("Инструкция по вводу данных:")
    println("1. Введите имя человека и нажмите Enter")
    println("2. Введите пол человека (MALE или FEMALE) и нажмите Enter")
    println("Доступные значения пола: MALE, FEMALE")
    println("------------------------------------")


    val listOfPersons = mutableListOf<Person>()
    repeat(5) { index ->
        println("\nВвод данных человека #${index + 1}:")
        print("Введите имя: ")
        val name = readln().trim()
        var sex: Sex? = null
        while (sex == null) {
            print("Введите пол (MALE/FEMALE): ")
            val input = readln().trim().uppercase()

            sex = try {
                Sex.valueOf(input)
            } catch (e: IllegalArgumentException) {
                println("Ошибка! Введите MALE или FEMALE")
                null
            }
        }

        listOfPersons.add(Person(name, sex))
        println("Человек добавлен!")
    }

    println("\nСписок всех людей в картотеке:")
    listOfPersons.forEachIndexed { index, person ->
        println("${index + 1}. ${person.personsName} (${person.sex})")
    }
}