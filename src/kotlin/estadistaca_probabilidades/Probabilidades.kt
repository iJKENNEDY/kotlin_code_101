package estadistaca_probabilidades

import lineaSeparacion

class Probabilidades {

    fun numerosAleatorios(){
        val cantidadAgrupacion: Int =5
        val cantidadMuestraAleatoria: Int= 22
        val resultado= mutableListOf<Any>()
        for (i in 1..cantidadMuestraAleatoria){
            val numer1 = (1..35).random()
            val numer2 = (1..35).random()
            val numer3 = (1..35).random()
            val numer4 = (1..35).random()
            val numer5 = (1..35).random()

            //var raleatorio = "${numer1}-${numer2}-${numer3}-${numer4}-${numer5}"
           // println(raleatorio)

            val lista = listOf(numer1,numer2,numer3,numer4,numer5)
            //val array = mutableListOf(lista)
            resultado.add(lista)
        }
        lineaSeparacion()
        resultado.forEach { println("${it}") }
        //println("${resultado}")


    }
}