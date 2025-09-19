package org.example.lesson17

class Package(val numberOfPackage: Int, initialLocation: String) {
    var locationCounter = 0
        get() = field

    var currentLocation = initialLocation
        set(newLocation) {
            locationCounter++
            println("Package number $numberOfPackage moved from $field to $newLocation")
            println("Amount of movements: $locationCounter")
            field = newLocation
        }

    fun printInfo() {
        println(
            """|Number of package is $numberOfPackage
            |Current location is $currentLocation
            |Amount of movements is $locationCounter
        """.trimMargin()
        )
    }
}

fun main() {

    val package1 = Package(8476583, "Moscow")
    package1.currentLocation = "Vladivostok"
    package1.currentLocation = "Shanghai"
    package1.printInfo()

}