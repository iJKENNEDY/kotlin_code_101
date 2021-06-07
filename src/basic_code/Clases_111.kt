package basic_code


fun main() {
    /*
    val car2 = CarOne()
    val rc3 = car2.wheels
    println(rc3)
    car2.mensajeStatica()

    lineaSeparacion()

    val account = Account3("name", "persona")
    println(account.toString())
    lineaSeparacion()
    lineaSeparacion("$")

    val cadenaStr = stringReturn()
    println(cadenaStr)

    lineaSeparacion()
    val book2 = Book("Android dev Kt", "Knned Jher", 2020)
    println(book2)
    val aniomas = book2.anio++
    println(book2)

    lineaSeparacion()
    listasFlag()
*/
    lineaSeparacion("%")
    basic_101_kt()

    lineaSeparacion()
    val generateval = generateAnswerString()
    println(generateval)
    println()

    longitudLetter()
}

fun longitudLetter(){
    val stringLengthFunc: (String) -> Int = { input ->
        input.length
    }

    val r_long_letter = stringLengthFunc("enigma")
    println("longitud: $r_long_letter")

}

fun generateAnswerString(): String {
    val counter = 34
    val answerStr = if (counter == 42){
        "I have the answer"
    }else{
        "The answer elude me"
    }
    return answerStr
}

fun basic_101_kt(){
    var count: Int = 10
    count = 129

    val nombreLang: String = "kotlin"
    println(nombreLang)

    val mayus_nombre: String = nombreLang.toUpperCase()
    println(mayus_nombre)

    val nombre_kt: String? = null
    println(nombre_kt)

    val this_year_is: Int = 2021
    if(this_year_is == 2021){
        println("is actual year")
    }else{
        println("is not year")
    }

    println()
    val nota_matematica: Int = 20
    val notaExamen: String = if (nota_matematica == 20){
        "nota perfecta"
    }else if(nota_matematica < 18){
        "nota buena"
    }else if(nota_matematica < 15){
        "nota asequible"
    }else{
        "nota baja"
    }
    println("la nota es : $nota_matematica")

    val nota_promedio: Int = (nota_matematica+19+18)/3
    println("nota: $nota_promedio")

    val elPromedioEs = when {
        nota_promedio == 20 -> println("perfect")
        nota_promedio >= 18 -> println("casi-perfect")
        nota_promedio in 14..17 -> println("nota regular")
        nota_promedio in 11..13 -> println("nota bajo")
        else -> println("desaprobo")
    }

    println("promedio es: $nota_promedio entonces es $elPromedioEs")
    println()

    val titulo_lang: String? = null
    val isNullTitle =if (titulo_lang == null){
        "esta vacio el titulo"
    }else{
        titulo_lang.toUpperCase()
    }
    println("titulo es:: ------ $isNullTitle ------")
    println()

}



class Wheel{
    fun enigma(){
        TODO()
    }
}
class CarOne {
    val wheels = listOf<Wheel>()
    val enigma: String = "qwerty"
    companion object{
        private const val TAG = "eNIGMA CODE silence"
    }

    fun mensajeStatica ()
    {
        TAG
        print(TAG)
        println()
        val nombreMensaje = "mI Mensaje minimo"
        print(nombreMensaje)

    }
}

class Account3(nomb:String, tipo:String){

    init {
        println("........class empty .............................")
    }
}


fun listasFlag(){
    val capitales = listOf("Peru" to "Lima","Chile" to "Santiago", "Colombia" to "Bogota")
    for ((country, city) in capitales){
        println("Capital de $country is $city")
    }

    lineaSeparacion("*")
    println(".... forma 2 ..............")
    capitales.forEach{(cap, cit) ->
        println("capital de $cap is $cit")
    }
    lineaSeparacion("=")

    println("--- mapeo ......")

    val text = capitales.map { (country, _)->country.toUpperCase() }
            .onEach { println(it) }
            .filter { it.startsWith("P") }
            .joinToString (prefix = "Countries prefix P:" )
    println(text)

}

data class Book(var titulo:String, var autor:String, var anio:Int)

fun  stringReturn(){
    val nombre:String = "Kennedy"
    if (nombre.isEmpty())
        return
}

fun lineaSeparacion(linea:String="-",cantidad:Int=14){
//    println()
    repeat(cantidad){
        print(linea)
    }
    println()
}