package org.example.lesson3

fun main() {

    val chessMove = "D2-D4;0"

    val (from, to, moveNumber) = chessMove.split("-", ";")

    println("From: $from")
    println("To: $to")
    println("Move number: $moveNumber")
}