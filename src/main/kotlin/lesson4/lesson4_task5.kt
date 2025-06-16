package org.example.lesson4

fun main() {

    println("Enter with spaces: the ship has no damage: true/false, amount of crew members, amount of provision boxes, weather quality is good: true/false")

    val input = readLine()
    if (input != null) {
        val parts = input.split(" ")

        if (parts.size >= 4) {
            val noDamageInput: Boolean? = parts[0].toBooleanStrictOrNull()
            val crewMembersInput: Int? = parts[1].toIntOrNull()
            val provisionBoxesInput: Int? = parts[2].toIntOrNull()
            val goodWeatherInput: Boolean? = parts[3]. toBooleanStrictOrNull()

            val shipIsReady = (noDamageInput == SHIP_NO_DAMAGE_IDEAL && crewMembersInput in SHIP_CREW_MIN .. SHIP_CREW_MAX && provisionBoxesInput!! > PROVISION_BOXES_MIN && (goodWeatherInput == GOOD_WEATHER_QUALITY_IDEAL || goodWeatherInput != GOOD_WEATHER_QUALITY_IDEAL) ) || (noDamageInput != SHIP_NO_DAMAGE_IDEAL && crewMembersInput == SHIP_CREW_MAX && goodWeatherInput == GOOD_WEATHER_QUALITY_IDEAL && provisionBoxesInput!! >= PROVISION_BOXES_MIN)


            println("Ship is ready for an expedition: $shipIsReady!")


            if (noDamageInput != null && crewMembersInput != null && provisionBoxesInput != null && goodWeatherInput != null )
                println("You entered: ship has no damage - $noDamageInput, amount of crew members - $crewMembersInput, amount of provision boxes - $provisionBoxesInput, good weather quality - $goodWeatherInput")

                else {
                println("Error: transformation process failed")
            }
        } else {
            println("Error: not enough data")
        }
    } else {
        println("Input is empty")

    }



}

const val SHIP_NO_DAMAGE_IDEAL = true
const val SHIP_CREW_MIN = 55
const val SHIP_CREW_MAX = 70
const val PROVISION_BOXES_MIN = 50
const val GOOD_WEATHER_QUALITY_IDEAL = true