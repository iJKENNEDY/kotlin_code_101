package read_line_input

import lineaSeparacion
import lineaSubTema
import lines_break.inputDescriptionVar
import java.util.ArrayList

class Funciones_111 {

    fun inputVariables(){
/*        inputDescriptionVar("numero1")
        val inpN1 = readLine()!!.toInt()

        inputDescriptionVar("numero 2")
        val inpN2:Int = readLine()!!.toInt()

        val sum2 = suma(inpN2,inpN1)
        println(sum2)

        lineaSeparacion()

        lineaSubTema(subtema = "agenda")
        inputDescriptionVar("codigo")
        val cod = readLine()!!.toInt()
        inputDescriptionVar("nombre")
        val nom = readLine().toString()
        inputDescriptionVar("telefono")
        val telf = readLine().toString()
        val resagenda = agenda333(cod, nom, telf)
        println(resagenda)*/
        //seleccion111()
        //trimestralMes()

        fechaHappyBhirsday()
    }

    fun fechaHappyBhirsday()
    {
        val texto= """Ingrese dia-mes-año:::"""
        println(texto)
        inputDescriptionVar("dia ")
        val dia: Int = readLine()!!.toInt()
        inputDescriptionVar("mes")
        val mes= readLine()
        inputDescriptionVar("año")
        val anio= readLine()
        lineaSeparacion()
        println("${dia}/${mes}/$anio")
        lineaSeparacion()

    }

    fun trimestralMes(){
        //var rangoMes:Int = 0
        inputDescriptionVar("mes (numeros)")
        val inpuRango: Int = readLine()!!.toInt()
        when(inpuRango){
            1,2,3,4 -> println("primer trimestre")
            5,6,7,8 -> println("segundo trimestre")
            9,10,11,12 -> println("tercer trimestre")
            else -> println("no esta en el rango")
        }
    }

    fun seleccion111(){
         //val nc: Int = opcionOthers(nnn)
        inputDescriptionVar("mes(numeros): ")
        val input111 = readLine()!!.toInt()

        when(input111){
            1 ->  "Enero"
            2 ->   "Febrero"
            else ->  "No esta en el rango"
        }

    }
    fun opcionOthers(n: Int):Int{
        return n
    }

    fun agendas111(id:Int, nombre: String,ocio: String ):String{
        return "id: ${id} nombre: ${nombre} ocio: ${ocio}"
    }


    fun agenda333(codigo: Int,nombre: String,telf: String):String{
        return "codigo: ${codigo}, nombre: ${nombre}, telf: ${telf}."
    }

    fun suma(numero2: Int, numero3:Int): Int{
        return numero2 + numero3
    }

}