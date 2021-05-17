package kt_101

class Lambdas_111 {

    fun iterando_lambdas(){
//        val values = listOf(1,3,4,6,7,8,9,13,23,59,50)
//        values.forEach{
//            println("$it: ${it*it}")
//        }
        println()

        var prices = listOf(1.3,4.94,99.95,55.49)
        val largePrices = prices.filter {
            it > 45.0
        }
        println(largePrices)
        println()

        val salesPrices = prices.map {
            it*0.5
        }
        println(salesPrices)
        println()

        val userInput = listOf("0","123","enigma","945")
        val numbers = userInput.map {
            it.toIntOrNull()
        }
        println("numbers: ${numbers}")
        println()

        var sum123 = prices.fold(0.0){ a,b ->
            a+b
        }
        println("sum = ${sum123}")
        println()

        val stock = mapOf(1.0 to 43, 1.4 to 49, 2.4 to 44.4
                    ,59.9 to 490, 6.0 to 684)
        var stockSum = 0.0

    }

    fun lambda_basico(){
        val multiplyLambda: (Int,Int)-> Int
        multiplyLambda = {a: Int, b: Int -> Int
            a*b
        }
        val lambdaResult = multiplyLambda(123,99)
        println("lambda result = $lambdaResult")

        println()

        val lambdaResultSum2:(Int, Int)-> Int= { a, b ->
          a+b
        }
        val ss3 = lambdaResultSum2(45,85)
        val lambdaResta:(Int, Int)->Int={a, b -> a-b}
        val rest = lambdaResta(544,111)
        println("sum2 = $ss3")
        println("resta = $rest")

        var doubleLambda = {a: Double -> a*4}
        doubleLambda = {2.3 * it}
        val resDouble = doubleLambda(33.33)
        println("rdl = $resDouble")

        val square:(Int)->Int = {it* it}
        val cubeNum:(Int)->Int = {it*it*it}
        println("square = ${square(12)}")
        println("cubeNum = ${cubeNum(4)}")
    }

    fun operateOnNumbers(a:Int, b:Int, operation:(Int,Int)->Int):Int{
        val result = operation(a,b)
        println("result: $result")
        return result
    }

}



























