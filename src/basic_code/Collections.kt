package basic_code

//fun main() {
//    val collecCity = Collections()
//    collecCity.collectionsCity()
//}



class Collections {


    fun collectionsCity(){
        val cyties = listOf<String>("Santiago","Bogota","Brazilian","Tokyo","Tanzania")
        println("the list cyties:: $cyties")
        println()
        println("------ filtro B ------")
        cyties.filter { it.startsWith("B") }
                .sortedBy { it }
                .map { it.toUpperCase() }
                .forEach{ println(it)}
    }
}