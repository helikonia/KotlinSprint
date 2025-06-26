package org.example.lesson9

fun main() {

    print("How many films do you want to add? ")
    val filmAmount = readln().toInt()
    val titles = mutableListOf<String>()
    val genres = mutableListOf<String>()
    val rating = mutableListOf<Float>()

    for (i in 0 until filmAmount) {
        print("Enter the title ")
        val title = readln()
        titles.add(title)
        print("Enter genre ")
        val genre = readln()
        genres.add(genre)
        print("Enter the rating ")
        val rate = readln().toFloat()
        rating.add(rate)


    }

    for (i in 0 until filmAmount) {
        println("\"${titles[i]}\" (${genres[i]}) - ${rating[i]}")
    }
    val combinedRating = titles.zip(rating)
    val sorted = combinedRating.sortedByDescending { it.second }
    println("Top three films:")
    val topThree = sorted.take(3)
    topThree.forEach { (titles, rating) ->
        println("$titles - $rating")
    }

    val combinedGenres = titles.zip(genres)
    val ifComedy = combinedGenres.filter {
        it.second.trim().lowercase() == "comedy"
    }
    ifComedy.forEach { (titles, genres) -> println("$titles - $genres") }

    val uniqueGenres = genres.toSet()
    println("Unique genres: ${uniqueGenres.joinToString(", ")}")

    val upperTitles = titles.map { it.uppercase() }
    println(upperTitles.joinToString { ", " })
}