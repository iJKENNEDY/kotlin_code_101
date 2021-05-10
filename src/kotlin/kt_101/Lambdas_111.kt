package kt_101

class Lambdas_111 {

    fun lambda_basico(){
        var multiplyLambda: (Int,Int)-> Int
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

}