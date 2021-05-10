package play_tuto_kt

class Colecciones {





    fun flatMaps(){
        val fruitsBag = listOf("orange","apple","banana","grapes")
        val clotesBag = listOf("shirts","jeans","pans")
        val cart = listOf(fruitsBag,clotesBag)
        val mapBag = cart.map { it }
        val flagMapBag = cart.flatMap { it }

        val nimpares = listOf(3,11,31,29,45,85)
        val npares = listOf(2,94,48,68,84)
        val nCombin = listOf(nimpares, npares)
        val nnmap = nCombin.map { it }
        val flagm = nnmap.flatMap { it }
        val norder = nimpares.sorted()
        println("n ordern:: ${nimpares}")

        println("cart:: ${cart}")
        println()
        println("mapBag:: ${mapBag}")
        println()
        println("flagMapBag:: ${flagMapBag}")
        println()
        println("numers: ${flagm}")
    }
}