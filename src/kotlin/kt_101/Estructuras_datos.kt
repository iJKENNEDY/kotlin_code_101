package kt_101

class Estructuras_datos {

    //de una lista extraer los + y - , cada en uno arrays separados
    fun sepPostNegat(){
        val listaGeneral = listOf(12,-43,65,-76,89,-45,-6,65,70,33,-6903,656)
        var listaA = listOf<Int>()
        var listaB = listOf<Int>()
        for (i in 0..listaGeneral.size){
            listaA += listaGeneral[i]
        }

        println(listaA)
    }


    fun reverseArray(a: Array<Int>): Array<Int>{
        var valores = mutableListOf<Int>()

        var tempArray:Array<Int> = arrayOf(a.size)
        for (i in tempArray.indices -1 ){
            tempArray.set(i,a[i])
            valores.add(a[i])
        }
        valores.reversed()
        println(valores)
        return tempArray
    }

    fun arreglos111(){
        var arreglo: Array<String> = Array(5, {i: Int -> "$i" })
        //println(arreglo)

        arreglo[0] = "enigma"
        arreglo[1] = "jason"
        arreglo[2] = "naria"

        for (i in arreglo){
            println(i)
        }
    }

    fun arregloNums(tamn: Int=0){

        var numeros = intArrayOf(tamn)
        var resN = mutableListOf<Int>()
        println("cantidad de numeros a ingresar es _ $tamn _")

        for (i in  0..tamn-1){
            print("ingrese $i:: ")
            val ninp: Int = readLine()!!.toInt()
           resN.add(ninp)

        }
        var suma = 0
        var resta = 0
        var producto = 1
        for (i in resN.indices){
            val nn1:Int = resN.get(i)
            suma += nn1
            producto *= nn1
            resta -= nn1
        }
        println("lista: $resN")
        println("suma: ${suma}")
        println("resta: ${resta}")
        println("producto: ${producto}")

    }
}