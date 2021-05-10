package play_tuto_kt

fun main() {

    val func666 = Funciones_666()
    println("...............................")
    func666.opr333()
    func666.printAll("aaa","vvv","ccc","ddddd","fffff")

    println("...............................")
    func666.printAllWithPrefix("enigna","holas","trion","rana",prefix = "Kennedt")

    println()
    println("................................")
    func666.log("manzana","banana","fresa","uva","cafe")




















    //..................................................
    func666.multiply(44,95)
    func666.printMessage("Kennedt")
    func666.printMessageWithPrefix("Kovin")
    func666.sssuma(342,9055)

    println("......................")
    // ---func_infijas....
    infix fun Int.times(str: String) = str.repeat(this)
    println(2 times "qwerty ")

    println()
    val pair = "qwerty" to "enigma"
    println(pair)

    println()
    infix fun  String.onto(other: String) = Pair(this, other)
    val myPair = "McLaren" onto "Maria"
    println(myPair)

    println()

    val sophia = Person("Sophia")
    val claudia = Person("Claudia")
    sophia likes claudia




}

class Person(val name: String){
    val likedPeople = mutableListOf<Person>()
    infix fun likes(other: Person){ likedPeople.add(other)}
}