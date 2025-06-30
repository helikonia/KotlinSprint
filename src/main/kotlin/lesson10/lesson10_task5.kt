package org.example.lesson10

fun main() {
    print("Enter thr price: ")
    val price = readln().toFloat()
    print("Enter the discount percent: ")
    val discount = readln().toInt()
    if (discount !in 0..100) {
        println("Error")
        return
    }
    println("Original price: %.2f".format(price))
    println("Discount (%): $discount%")
    println("Final price: %.2f".format(calculateDiscountedPrice(price, discount)))
}

fun calculateDiscountedPrice(price: Float, discount: Int) = price - (price * (discount.toFloat() / PERCENTAGE))

const val PERCENTAGE: Float = 100f