package kt_101

fun String.hasSpaces(): Boolean {
    val found = this.find { it == ' ' }
    return found != null
}

fun String.hasSpaces2() = find { it == ' ' } != null

class AquariumPlant2(val color: String, private val size: Int)

fun AquariumPlant2.isRed() = color == "red"    // OK
//fun AquariumPlant.isBig() = size > 50         // gives error

open class AquariumPlant(val color: String, private val size: Int)

class GreenLeafyPlant(size: Int) : AquariumPlant("green", size)

fun AquariumPlant.print() = println("AquariumPlant")
fun GreenLeafyPlant.print() = println("GreenLeafyPlant")


fun  resultExtensions()
{
    println("Does it have spaces?".hasSpaces())


    val plant = GreenLeafyPlant(size = 10)
    plant.print()
    println("\n")
    val aquariumPlant: AquariumPlant = plant
    aquariumPlant.print()  // what will it print?


}
