package oop

import kotlin.math.PI

class ToweTank(override var height: Int, var diameter: Int):
    Aquarium(height=height, width = diameter, length = diameter) {

    override var volumen: Int
        get() = (width/2 * length/2 * height/1000* PI).toInt()
        set(value) {
            height = ((value * 1000 / PI) / (width/2 * length/2)).toInt()
        }

    override var water= volumen* 0.8

    override val shape: String= "Cilynder"

}