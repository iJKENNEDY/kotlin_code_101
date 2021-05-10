package oop

open class Aquarium (
    open var width: Int = 43,
    open var height: Int =93,
    open var length: Int = 200){

    open var volumen: Int
        get() = width*height*length/1000
        set(value) {
            height = (value*1000)/(width*length)
        }
    open val shape = "Rectangle"

    open var water: Double = 0.0
    get() = volumen* 0.9

    init {
        println("inicializacion de la clase")
    }


    fun  printSize(){
        println("width: $width \nheight: $height \nlenght: $length")
        println("volumen: $volumen")
    }

    override fun toString(): String {
        return "w: $width cm h: $height cm l: $length cm"
    }
}