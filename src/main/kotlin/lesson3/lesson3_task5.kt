package org.example.lesson3

fun main() {

    val chessMove = "D2-D4;0"

    val (fromTo, moveNumber) = chessMove.split(";")
    val (from, to) = fromTo.split("-")

    println("From: $from")
    println("To: $to")
    println("Move number: $moveNumber")
}