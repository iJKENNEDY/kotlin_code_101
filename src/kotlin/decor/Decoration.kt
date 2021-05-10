package decor

import lineaSeparacion
import lineaSubTema

data class Decoration(val rocks: String) {
}

data class Decoration2(val rock: String, val wood:String, val diver:String)

fun makeDecoration2(){
    val d3 = Decoration2("crystal","wood","diver")
    println(d3)

    val(rock2, wood2, diver2) = d3
    println(d3.rock)
    println(d3.diver)
    println(d3.wood)
}

fun makeDecoration(){
    val decoration2 = Decoration("granite")
    println("rock-1 "+decoration2)

    val decoration3 = Decoration("slate")
    println("rock-2 "+decoration3)

    val decoration4 = Decoration("slate")
    println("rock-3 "+decoration4)

    lineaSeparacion()
    lineaSubTema(subtema = "comparacion de dos datas(2-3) - 1")
    val comparation2 = (decoration3.equals(decoration4))
    println(comparation2)

   lineaSeparacion()
   lineaSubTema(subtema = "comparacion de dos datos(1-2) - 2")
   val comparation3 = (decoration2.equals(decoration3))
    println(comparation3)


}