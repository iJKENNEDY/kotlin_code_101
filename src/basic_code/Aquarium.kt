package basic_code


interface Base{
    fun printMessage()
    fun printMessageLine()
}

class BaseImp(val x: Int): Base{
    override fun printMessage() {
        println(x)
    }

    override fun printMessageLine() {
        print(x)
    }
}
class Derived(b:Base): Base by b{
    override fun printMessage() {
        print("adfsf")
    }
}

val lazyValue: String by lazy {
    println("computed!")
    "enigma"

}
val lazyNumber: Int by lazy {
    println("mi,,ber")
    333
}
//fun main() {
//
////    println("%.0f".format(29.0%12.3))
////    val b = BaseImp(12)
////    Derived(b).printMessage()
////    Derived(b).printMessageLine()
//    println(lazyValue)
//    println(lazyValue)
//    println(lazyNumber)
//}
