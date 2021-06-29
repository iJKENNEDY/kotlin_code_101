import java.util.Random

fun main(args: Array<String>) {
    lotto_rango_5()
}

fun lotto_rango_5(){
    

    for (i in 0..15){ 
        val numero1 = (0..35).random()
        val numero2 = (0..35).random()
        val numero3 = (0..35).random()
        val numero4 = (0..35).random()
        val numero5 = (0..35).random()

        println("$i) $numero1 - $numero2 - $numero3 - $numero4 - $numero5")
    }

}