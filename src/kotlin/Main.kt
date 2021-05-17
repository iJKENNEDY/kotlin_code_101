import decor.makeDecoration
import decor.makeDecoration2

import kt_101.BasicosCode

import oop.Aquarium
import oop.Plecostomus
import oop.Shark
import oop.ToweTank
import opp2.Persona777
import pairs_triples.pairsExample
import pairs_triples.tripleExample
import play_tuto_kt.Colecciones
import read_line_input.Funciones_111


fun main() {

    //play tutos_kt
    val colecciones = Colecciones()
    colecciones.flatMaps()

    //baner()
    //---- input dates ......
    val fun111 = Funciones_111()
  //  fun111.inputVariables()


    val basic101 = BasicosCode()
    //basic101.comparacionesBool()
    //basic101.comparacion2Variables()
    //basic101.comparacion3Var()

//    val estructurasDatos = Estructuras_datos()
//    estructurasDatos.arreglos111()
//    val n:Int = 4
//    estructurasDatos.arregloNums(n)
//    val arrayCant: Array<Int> = arrayOf(12,43,44,5,51,1)
//    val erev = estructurasDatos.reverseArray(arrayCant)
//    erev.forEach { a->
//        println(a)
//    }

    //..data class
//    val chow = Perros(333,"Jeans","Akita","mostaza",3.1)
//    val chow2 = Perros(444,"Toby","Labrador","negro",1.0)
//    val chow3 = Perros(555,"Martesa","Pitbul","blanco-negro",3.0)
//    val chow4 = Perros(666,"Iota","Chow","plomo",2.1)

//    val perrosRazas = mutableListOf<Perros>(chow,chow2,chow3,chow4)
//   lineaSeparacion()
//    println(perrosRazas)
//    lineaSeparacion()
//    println(chow)
//
//    lineaSeparacion()
//    for (itemP in 1..perrosRazas.size){
//        println("${itemP} ${ perrosRazas[itemP]}")
//    }
//    perrosRazas.forEach { println(it.nombre) }
//    val ch = chow.copy(id = 333, nombre = "Term")
//    println(ch)

    //--OOP--
    //lineaBreakTitle(mensaje = "clases - poo")
    //buildAquarium()

    //makeFish()
    //buildDecoration3()

    //buildExtensionTest()
    // val basicosCode2 = BasicosCode()
//    basicosCode2.hashes_2()
//basicosCode2.listas3000()
    //iniciarPersona777()

   // func_car()



}
fun buildExtensionTest(){
    pairsExample()
    tripleExample()
}

fun buildDecoration3()
{
    lineaBreakTitle(mensaje = "class data")
    makeDecoration()

    lineaSubTema(subtema = "decoracion 2")
    makeDecoration2()
}

fun makeFish(){
    val testShark = Shark()
    val testPlecostomus = Plecostomus()

    lineaBreakTitle(mensaje = "Herencia interface- abstract")

    println("shark color ${testShark.color}")
    testShark.eat()


    println("plecostomus ${testPlecostomus.color}")
    testPlecostomus.eat()
}

fun buildAquarium(){
    val aquarium = Aquarium()
    aquarium.printSize()
    aquarium.length=188

    val aquarium2 = Aquarium(width = 30)
    val aquarium3 = Aquarium(width = 20, height = 25)
    val aquarium4 = Aquarium(length = 12)
    // println("volumen ${aquarium4.length*aquarium4.width*aquarium4.height/1000} l")

    lineaSubTema("aquarium 2")
    aquarium2.printSize()
    lineaSeparacion()

    lineaSubTema("aquarium 3")
    aquarium3.printSize()
    lineaSeparacion()

    lineaSubTema("aquarium 4")
    aquarium4.printSize()
    lineaSeparacion()
    aquarium.printSize()
    lineaSeparacion()
    println(aquarium.toString())

    lineaBreakTitle(mensaje = "herencia")
    val myTower = ToweTank(diameter = 25, height = 40)
    myTower.printSize()

}



fun basic_101(){

    /*
    val bscode = BasicosCode()
    bscode.funAritmeticos()

    lineaSeparacion()

    bscode.conversionValores()

    lineaSeparacion()
    bscode.comparacionesIfElse()

    lineaBreakTitle(mensaje = " nulabilidad")
    bscode.nulabilidades()

    lineaBreakTitle(mensaje = "listas - arrays")
    bscode.arraysEjemplos()

    lineaBreakTitle(mensaje = "while")
    bscode.while_use()

    println()
    lineaBreakTitle(mensaje = "funciones")
    val fun101 = Funciones101()
    fun101.feedTheFish()

    println()
    lineaBreakTitle(mensaje = "func filtros")
    fun101.filtrosExamples()

    println()
    lineaBreakTitle(mensaje = "lambda")
    fun101.lambdaFunciones()

    println()
    lineaBreakTitle(mensaje = "fun orden superior")
    fun101.resultFunOrdenSup()

     */
}


fun lineaSubTema(subtema: String="tema vacio"){
    println("==> $subtema ")
}

fun lineaSeparacion2(puntos: String="♣", cantidad:Int=18){
    repeat(cantidad){
        print(puntos)
    }

    println()
}

fun lineaBreakTitle(puntos: String="#", cantidad:Int=32,
                    mensaje: String=""){
    println()
    lineaSeparacion(puntos,cantidad)
    print("-->:tema > ${mensaje.toUpperCase()} :<--")
    println()
    lineaSeparacion("-",cantidad)

}
