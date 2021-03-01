import java.util.*

fun main() {
    //-lineaSeparacion("-")
    //-arraysBoleanos()
    //lineaSeparacion("*")
    //itercionArray()
    //lineaSeparacion("$")
    //crearMatriz()
    //arraysDoubles()

    lineaSeparacion()
    lineaSeparacion("-0-",11)
   // repeticiones2()
    arraysIndices()
    lineaSeparacion()


   // misFrutas()

    lineaSeparacion("-%-", 11)
    autosFavoritosForEach()
    lineaSeparacion("♠",11)
    codeLanguageForIndex()

    lineaSeparacion("♥♣", 6)
    mapGanador()

    lineaSeparacion("•○",12)
    var skills = arrayOf("Programador ninja","DevOps mobile", " econimics")
    variosArgumentos("soy",*skills)

    lineaSeparacion("#-#",9)
    var sum2 = suma(123,434)
    println(sum2)
}

fun suma(n1:Int, n2:Int)= n1+n2

fun variosArgumentos(greeting:String, vararg itemsToGreet: String ){

    itemsToGreet.forEach { itemsToGreet->
        println("$greeting - $itemsToGreet")

    }

}

fun mapGanador(){
    val premiosxMedallas = mapOf<Int, String>(1 to "medalla de Oro",
            2 to "medalla de Plata", 3 to "medalla de bronce")
    premiosxMedallas.forEach{ clave, valor ->
        println("$clave° puesto - $valor")
    }
}


fun codeLanguageForIndex(){
    var lengCode = listOf<String>("Java","Cpp","C#","Kotlin","Python","Bash")
    lengCode.forEachIndexed { index, s ->
        println("$index) ==> $s.")
    }
}

fun autosFavoritosForEach(){
    var autos = listOf<String>("Buggaty","Covett","Mazaratti","Ferrari",
            "Lamborguini","Hammer")
    autos.forEach{ cars->
        println(cars)
    }

}

//-------------------------------------------------------
fun repeticiones2(){
    repeat(9){
        i -> println("This line will be printed 10 times")
        println("We are no the ${i+3}. loop iterator")
    }
}

fun arraysIndices(){
    val frutas= listOf<String>("naranjas","papaya", "limon","pera")
    for ((index, valor) in frutas.withIndex()){
        println("[$index]... ${valor}")
    }
    lineaSeparacion("-#-",9)
    val misColors = listOf<String>("Verde","Morado","Rojo","Azul","Amarillo","Rosado")
    for ((index, valores) in misColors.withIndex()){
        println("${index}||||- ${valores}")
    }

    lineaSeparacion("-|||-",11)
}

fun misFrutas(){

    var inDatos:String
  var miList:Any =""
    for (i in 0..2){
        print("ingrese 3 frutas::: ")
        inDatos = readLine().toString()
        miList = listOf<String>(inDatos)
    }
    val scanF = listOf<String>(miList.toString())
    for (i in scanF){
        print("#${i}")
    }

}


//-------------------------------------------------------
fun arraysDoubles(){
    var re2 = doubleArrayOf(12.33,132.43,9034.23, 444.33)
    var re3 = Array<Double>(size = 5, init={i->i*2.2})
    for (r in re2){
        print("[$r]-")
    }
    lineaSeparacion("$")
    for (rr in re3){
        print("[$rr]")
    }
    lineaSeparacion("!")
}

fun itercionArray(){
    val asc = Array(5, {u -> (u*u).toString()})
    for (s: String in asc){
        print("-${s}")
    }
}

fun crearMatriz(){
    val a = arrayOf(23,43,99,20)
    print(a)
    for (i2 in a){
        println(i2)
    }
    lineaSeparacion("=")
    // utilizando un cierre
    val a2= Array(5){i -> i*3 }
    for (a21 in a2){
        println(a21)
    }
    lineaSeparacion("-|-")
    //crear una matriz sin inicializar
    val a4 = arrayOfNulls<Int>(3)
    for (a1 in a4){
        println(a1)
    }

}

fun arraysBoleanos(){
    var bool9 = Array<Boolean>(size=4, init = {i -> true})
    println(bool9.size)

    var arrayBol = booleanArrayOf(true, false,false, true)

}



fun lineaSeparacion(tipoLinea: String=".", cantidad:Int=19){
    println()
    for (i in 0..cantidad){
        print("$tipoLinea")
    }
    println()
}

fun inDatosComunes(){
    print("Escribe un nombre::: ")
    var a = readLine()
    println("Bienvenido: ${a}")
    println(".............................")
    for (i in 1..3){
        print("dato $i _:: ")
        val datos = readLine()
        println("dato ${datos}..")
    }
}