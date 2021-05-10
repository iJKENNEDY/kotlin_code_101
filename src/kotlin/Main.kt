import dataClasses.Perros
import decor.makeDecoration
import decor.makeDecoration2
import estadistaca_probabilidades.Probabilidades
import kt_101.BasicosCode
import kt_101.Estructuras_datos
import kt_101.Funciones101

import lines_break.PrintPoints
import lines_break.baner
import oop.Aquarium
import oop.Plecostomus
import oop.Shark
import oop.ToweTank
import opp2.Car_777
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

    val probabilidad = Probabilidades()
   // probabilidad.numerosAleatorios()

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
fun func_car(){
    val listaCars: MutableList<Car_777> = mutableListOf()
    val car2 = Car_777("BZK","b777","blue","CF4-0I4",4)
    val car3 = Car_777("HUMMER","b777","blue","CF4-0I4",4)
    val car4 = Car_777("KENZKOR","b777","blue","CF4-0I4",4)
    val car5 = Car_777("ZAROK","b777","blue","CF4-0I4",4)

     println("marca: ${car2.marca}, \nmodelo: ${car2.modelo}" +
             "\ncolor: ${car2.color}\nplaca: ${car2.placa}\nn° puertas: ${car2.nPuertas}")

    println("........................")
    listaCars.add(car4)
    listaCars.add(car3)
    listaCars.add(car2)
    listaCars.add(car5)

    for (item in listaCars){
        println("marca: ${item.marca} \npuertas: ${item.nPuertas}")
    }
    println("........................")
    val car6 = Car_777("KILLBILL","Fep32","green","VFD-4FF",0)
    println("car: ${car6.marca} \nnumPuertas: ${car6.nPuertas} " +
            "\nplaca: ${car6.placa}")
    println("________________________")
    val car7 = Car_777("KILLBILL","JKHZ-22","green","YUS-23D",0)
    println("car: ${car7.marca} \nnumPuertas: ${car7.nPuertas} " +
            "\nplaca: ${car7.placa} \nmodelo: ${car7.modelo}")

}

fun iniciarPersona777(){
    println("--------- oop ----------")
    var persona777:Persona777 = Persona777("5904304","Fatima",
        -21, "599999999")
    persona777.imprimirDatos()
    println("---------------------------")
    var persona771:Persona777 = Persona777("5895555","Balkor",
        18, "85555444")
    persona771.imprimirDatos()
    /*
    var listaPersonas: MutableList<Persona777> = mutableListOf()
    listaPersonas.add(persona777)
    listaPersonas.add(Persona777("111111","Jenny", 25, "5546453"))
    listaPersonas.add(Persona777("222222","Greyc", 45, "5546453"))
    listaPersonas.add(Persona777("333333","Lenny", 15, "5546453"))
    listaPersonas.add(Persona777("444444","Patry", 65, "5546453"))
    listaPersonas.add(Persona777("555555","Redy", 34, "5546453"))
    listaPersonas.add(Persona777("666666","Holly", 93, "5546453"))
    listaPersonas.add(Persona777("777777","Linlin", 25, "5546453"))

    println(listaPersonas)
    for (pers in listaPersonas){
        println("#${pers.imprimirDatos()}")
    }*/

//    persona777.nombre = "Jkennedt"
//    persona777.documento = "9030043"
//    persona777.edad = 20
//    persona777.telefono = "9400000"

//    println("El nombre de la persona es ${persona777.nombre}")
//    persona777.caminar()
//    persona777.imprimirDatos()

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

    lineaSeparacion()

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

fun lineaSeparacion(puntos: String="♣", cantidad:Int=18){
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
