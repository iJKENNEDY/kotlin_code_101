package kt_101

import lineaBreakTitle
import lineaSeparacion
import lineaSubTema
import java.util.Arrays.toString

class BasicosCode {

    fun comparacionesBool()
    {
        val verdad: Boolean = true
        val falso : Boolean = false
        val and1 = verdad && falso
        println(and1)
    }

    fun comparacion2Variables()
    {
        val p = listOf<Boolean>(true,true,false,false)
        val q = listOf<Boolean>(true,false,true,false)
        for (i in 0..p.size-1){
//            for (r in 0..q.size-1){
//               val  rbool=  p[i] && q[r]
//                print("${rbool}")
//            }
            print("${i+1})${p[i]} && ${q[i]} == ")
            print(p[i] && q[i])
            println()
        }
    }

    fun comparacion3Var(){
        val p = listOf<Boolean>(true,true,true,true,false,false,false,false)
        val q = listOf<Boolean>(true,true,false,false,true,true,false,false)
        val r = listOf<Boolean>(true,false,true,false,true,false,true,false)

        for (pqr in 0..q.size-1){
            println("${pqr+1})${p[pqr]} && ${q[pqr]} ==${p[pqr] && q[pqr]}")
        }
        lineaSeparacion()
        for (pqr in 0..q.size-1){
            println("${pqr+1})${r[pqr]} || ${q[pqr]} ==${p[pqr] || r[pqr]}")
        }
    }


    fun listas3000(){
        lineaSubTema(subtema = "manejo de listas")
        val listasEscritorio  = mutableListOf("Cuaderno","Lapicero","Plumon","Libros")
        println("-lista escritorio: ${ listasEscritorio }")
        lineaSeparacion(".")
        listasEscritorio.add("pintura colors")
        listasEscritorio.add("crayones")
        listasEscritorio.add("borrador")
        lineaSeparacion("◘")
        val lista2 = mutableListOf("papel bond","toner","archivador")

        listasEscritorio.addAll(lista2)
        println("nuevos utiles: ${lista2}")
        lista2.clear()
        lista2.remove("papel bond")
        lista2.remove("toner")
        lineaSeparacion("_")
        println("-se agrego : ${listasEscritorio.get(listasEscritorio.size-1)}")
        lineaSeparacion("♦")

        listasEscritorio.removeAt(2)
        listasEscritorio.removeAt(0)

        println("............................")
        println("-nueva lista:: ${listasEscritorio}")

        println("............................")
        println("-tamaño lista: ${listasEscritorio.size + 1}")
        println("primer item: ${listasEscritorio.first()}")
        println("ultimo item: ${listasEscritorio.last()}")

    }

    fun lista2(){
        val lista222 = listOf<String>("book","pencil","notebook")
        for (item in lista222.listIterator()){
            println("$item")
        }
    }

    fun hashes_2(){

        val clanes = hashMapOf<String, String>("madara" to "uchiha",
                                "naruto" to "uzumaki",
                                "kabuto" to "sonido")
        println(clanes.get("madara"))
        println(clanes["naruto"])
        println(clanes.getOrDefault("nara","el clan no esta en la lista"))

        lineaSeparacion()

        val inventory = mutableMapOf("fish net" to 1)
        inventory.put("tank scrubber", 3)
        println(inventory.toString())
        inventory.remove("fish net")
        println(inventory.toString())

    }

    fun while_use(){
        var bubbles = 0
        while (bubbles < 50) {
            bubbles++
        }
        println("$bubbles bubbles in the water\n")

        do {
            bubbles--
        } while (bubbles > 50)
        println("$bubbles bubbles in the water\n")

        repeat(2) {
            println("A fish is swimming")
        }
    }

    fun arraysEjemplos(){
        lineaSubTema("listas::  tienen versiones mutables e inmutables")
        val school = listOf("mackerel", "trout", "halibut")
        println(school)

        val myList = mutableListOf("tuna", "salmon", "shark")
        myList.remove("shark")
        println()

        lineaSubTema("arrays: el tamaño es fijo.")
        val school2 = arrayOf("shark", "salmon", "minnow")
        println(toString(school2))
        println("use for__ ")
        for (element in school2) {
            print(element + " ")
        }
        for ((index, element) in school2.withIndex()) {
            println("Item at $index is $element\n")
        }
        val numbers = intArrayOf(1,2,3)
        numbers.forEach { print("array numb: ${it} ") }


    }

    fun nulabilidades(){
        var comidaFavorita: String? = null

        if (comidaFavorita == null){
          println("existe null")
        }else {
            println("comida favorita es: $comidaFavorita")
        }
        println()
        var fishFoodTreats = 9
        fishFoodTreats = fishFoodTreats?.dec() ?: 0
        println(fishFoodTreats)

        println("A point about null pointers (!!)")
        val s: String = "werrwer"
        val len = s!!.length   // throws NullPointerException if s is null
        println(len)
    }

    fun comparacionesIfElse(){
        val miDinero : Int = 2549
        val tuDinero : Int = 433

        print("condionales mi dinero($miDinero):-- tu tienes ($tuDinero):: ")
        if (miDinero == tuDinero ){
            println("cantidades iguales")
        }else if (miDinero > tuDinero){
            println("tengo mas ")
        }else{
            println("posees mas que yo")
        }
        println()

        val rmv:String = if (miDinero in 2000..5555) "sueldo promedio" else "rango no verificado"
        print("rmv $miDinero promedio: $rmv")
        println()

        val mayorEdad: Int = 43
        val determinacionEdad = when(mayorEdad){
            0 -> "a un no nace"
            in 1..17 -> "menor de edad"
            18 -> "acaba de ser mayor de edad"
            in 18..33 -> "es una persona adulta-joven"
            in 33..60 -> "persona adulta-adulta"
            else -> "persona de 3ra edad"
        }
        println("edad $mayorEdad:  $determinacionEdad")



    }

    fun conversionValores(){
        val valor3 = "12"
        val vconvInt = valor3.toInt()
        val vconvDouble = valor3.toDouble()
        val vconvChar = valor3.toCharArray()

        print("valor string: $valor3 cast: \n")
        println("int: $vconvInt")
        println("double: $vconvDouble")
        println("char: $vconvChar")

    }


    fun funAritmeticos(){
        println("jkennedt-code-kotlin-")

        var numero2 = 123
        print("plus():: ")
        var sum3 = numero2.plus(990)
        println(sum3)

        lineaSeparacion()
        print("minus:: ")
        var restar = numero2.minus(90)
        println(restar)

    }


}