package basic_code


fun main() {
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

    lineaSeparacion("%")

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