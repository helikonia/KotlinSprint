package org.example.lesson14

abstract class CelestialBody(val name: String, val atmosphere: Boolean, val landingPossibility: Boolean)

class Planets(
    name: String,
    atmosphere: Boolean,
    landingPossibility: Boolean,
    val satellites: List<Satellites>,
) : CelestialBody(name = name, atmosphere = atmosphere, landingPossibility = landingPossibility)

class Satellites(
    name: String,
    atmosphere: Boolean,
    landingPossibility: Boolean,
) : CelestialBody(name = name, atmosphere = atmosphere, landingPossibility = landingPossibility)

fun main() {
    val satellite1 = Satellites("Phobos", true, false)
    val satellite2 = Satellites("Deimos", false, true)

    val planet1 = Planets(
        "Mars", atmosphere = true, landingPossibility = true, (listOf<Satellites>(
            satellite1,
            satellite2
        ))
    )

    println(planet1.name)
    planet1.satellites.forEach { println(it.name) }
}