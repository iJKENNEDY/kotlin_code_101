package pairs_triples

import lineaSeparacion

fun pairsExample(){
    val equipement =  "fish net" to "catching fish"
    println("first: ${equipement.first}, second: ${equipement.second}")

    lineaSeparacion()

    val equipement2 = ("fish net" to "catching fish") to "equipement2"
    println("to ${equipement2.first} is ${equipement2.second}")
    println("${equipement2.first.second}")

    lineaSeparacion()
    val fruitColor = "pineapple" to "yellow"
    val(fruit, color) = fruitColor
    println("fruit: ${fruit}, color:${color}")

    lineaSeparacion()
}

fun tripleExample(){
    val numbers = Triple(234,955,1999)
    println(numbers.toString())
    println(numbers.toList())

    val(n1,n2, n3) = numbers
    println("n1: ${n1} n2: ${n2} n3: ${n3}")
}

