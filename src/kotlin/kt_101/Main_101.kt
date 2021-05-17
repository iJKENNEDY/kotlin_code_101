package kt_101

fun main() {
    val estrDatos = Estructuras_datos()
    //estrDatos.sepPostNegat()

    val lambdas111 = Lambdas_111()
    lambdas111.lambda_basico()

    val addLambda = {a:Int, b:Int ->a+b}
    lambdas111.operateOnNumbers(5,10,operation = addLambda )


}