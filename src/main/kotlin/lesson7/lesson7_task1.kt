package org.example.lesson7

fun main() {

    for (i in 1..20) {

        if (i % 4 == 0)
            continue
        println("client $i")
    }
}
