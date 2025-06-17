package org.example.lesson5

fun main() {
    val num1 = 4
    val num2 = 39
    println("Enter 2 numbers from 0 to 42 separated by spase")

    val numInput = readln()
    val parts = numInput.split(" ")
    val inputNum1 = parts[0].toInt()
    val inputNum2 = parts[1].toInt()
    if ((inputNum1 == num1 &&
                inputNum2 == num2) ||
        (inputNum1 == num2 &&
                inputNum2 == num1)
    )
        println(
            """Congratulations! You won the grand prize!
            |Right numbers were 4 and 39!
        """.trimMargin()
        )
    else if (inputNum1 == num1 ||
        inputNum2 == num1 ||
        inputNum1 == num2 ||
        inputNum2 == num2
    )
        println(
            """Congratulations! You won a sonsolation prize!
            |Right numbers were 4 and 39!
        """.trimMargin()
        )
    else
        println(
            """Failure!
            |Right numbers were 4 and 39!
        """.trimMargin()
        )
}