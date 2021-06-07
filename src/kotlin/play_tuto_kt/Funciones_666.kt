package play_tuto_kt

class MutableStack<E>(vararg items: E){
    private val elements = items.toMutableList()
    fun push(element: E) = elements.add(element)
    fun peek(): E = elements.last()
    fun pop(): E = elements.removeAt(elements.size-1)
    fun isEmpty() = elements.isEmpty()
    fun size() = elements.size

    fun <E> mutableStackOf(vararg  elements2: E) = MutableStack(*elements2)


    override fun toString()="MutableStack(${elements.joinToString()})"
}

class Funciones_666 {



    fun printMessage(message: String): Unit{
        println(message)
    }

    fun printMessageWithPrefix(message: String, prefix: String="Info"){
        println("[$prefix] $message")
    }

    fun sssuma(x: Int, y: Int): Int{
        return x+y
    }

    fun multiply(x:Int, y: Int) = x*y

    fun opr333(){
        operator3()}

    fun printAll(vararg messages: String){
        for (m in messages) println(m)
    }

    fun printAllWithPrefix(vararg messages: String, prefix: String){
        for (m in messages) println(prefix + m)
    }

    fun log(vararg entries: String){
        printAll(*entries)
    }
}

fun operator3(){
    //Funciones del operador Algunas funciones se
// pueden "actualizar" a los operadores, permitiendo sus
// llamadas con el símbolo de operador correspondiente.
    //operator fun Int.times2(str2: String)= str2.repeat(this)
    operator fun String.get(range: IntRange) = substring(range)  // 3
    val str = "Always forgive your enemies; nothing annoys them so much."
    println(str[0..14])

}

