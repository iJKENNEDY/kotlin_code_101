package kt_101

import lineaSeparacion
import lineaSubTema
import java.util.*

class Funciones101 {


    fun feedTheFish() {
        val day = randomDay()
        val food = fishFood(day)
        println ("Today is $day and the fish eat $food")
        println("Change water: ${shouldChangeWater(day)}")
    }

    fun fishFood(day: String): String {
       return when(day){
           "Monday" -> "flakes"
           "Wednesday" -> "redworms"
           "Thursday" -> "granules"
           "Friday" -> "mosquitoes"
           "Sunday" -> "plankton"
           else -> "nothing"
       }
    }

    fun randomDay(): String {
        val week = arrayOf("Monday","Tuesday","Wenesday","thurday",
        "Friday","Saturday","Sunday")
        return week[Random().nextInt(week.size)]
    }

    fun shouldChangeWater (day: String, temperature: Int = 22, dirty: Int = 20): Boolean {
        return when {
            isTooHot(temperature) -> true
            isDirty(dirty) -> true
            isSunday(day) -> true
            else  -> false
        }
    }

    fun isTooHot(temperature: Int) = temperature > 30

    fun isDirty(dirty: Int) = dirty > 30

    fun isSunday(day: String) = day == "Sunday"


    fun filtrosExamples(){
        val decorations = listOf("rock","pagoda","plastic plant",
        "alligator","flowerpot")

        val eager = decorations.filter { it[0] == 'p' }

        println("eager: $eager")

        val filtered = decorations.asSequence().filter { it[0] == 'p' }
        println("filtered: $filtered")

        val newList = filtered.toList()
        println("new list: $newList")

        lineaSeparacion("♣")
        val lazyMap = decorations.asSequence().map {
            println("access: $it")
            it
        }
        println("lazy: $lazyMap")
        println("-----")
        println("first: ${lazyMap.first()}")
        println("-----")
        println("all: ${lazyMap.toList()}")


        lineaSeparacion()
        val lazyMap2 = decorations.asSequence().filter {it[0] == 'p'}.map {
            println("access: $it")
            it
        }
        println("-----")
        println("filtered: ${lazyMap2.toList()}")
    }

    fun lambdaFunciones(){
        var dirtyLevel = 30
        val waterFilter = {dirty: Int->dirty/2}
        println(waterFilter(dirtyLevel))

        val waterFilter2:(Int)-> Int = {dirty->dirty/2}

    }

    fun ordenSuperior_updateDirty(dirty:Int, operation: (Int)->Int):Int{
        return operation(dirty)
    }

    fun increaseDirty(start: Int) = start +1

    fun resultFunOrdenSup(){
        val waterFilter:(Int)->Int = {dirty -> dirty/2}
        println(ordenSuperior_updateDirty(30,waterFilter))
        println()

        lineaSubTema("forma 2")
        println(ordenSuperior_updateDirty(20,::increaseDirty))
    }

}


















