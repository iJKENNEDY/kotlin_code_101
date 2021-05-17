package basic_code

class Lambdas_more {

    fun lambda_111(){
        var unitLambda:() -> Unit = {
            println("Kotlin Apprentice is awesome!")
        }
        unitLambda()

        println()

        var counter = 0
        val incrementCounter= {
            counter +=1
        }
        incrementCounter()
        incrementCounter()
        incrementCounter()
    }

    fun countingLambda():()->Int{
        var counter=0
        val incrementationCounter3:()-> Int={
            counter +=1
            counter
        }
        return incrementationCounter3
    }

    fun custom_sorting_(){
        val names = arrayOf("AAAA","FFFF","BBBB","HHHH","L")
        names.sorted()
        println(names)

        println("comparando con sus longitudes")
        val namesByLength = names.sortedWith(compareBy{
            -it.length
        })
        println(namesByLength)
    }

    fun iteraction_Collection_(){
        val values = listOf(12,43,94,3,59,55,59)
        values.forEach{
            println("$it: ${it*it} ")
        }

        val largePrices = values.filter {
            it > 44
        }
        println(largePrices)
    }






}

































