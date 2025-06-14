package org.example.lesson2

fun main() {

    val amountOfEmployees = 50
    val amountOfTrainees = 30
    val salaryOfEmployees = 30000
    val salaryOfTrainees = 20000

    val employeesSalaryExpenses = amountOfEmployees * salaryOfEmployees
    val traineesSalaryExpenses = amountOfTrainees * salaryOfTrainees

    println(employeesSalaryExpenses)

    val generalExpenses = employeesSalaryExpenses + traineesSalaryExpenses

    println(generalExpenses)

    val averageSalary = generalExpenses / (amountOfEmployees + amountOfTrainees)

    println(averageSalary)
}