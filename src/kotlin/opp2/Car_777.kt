package opp2

import java.awt.Color

 class Car_777(marca:String, modelo:String, color:String, placa:String,
                nPuertas: Int)
 {
        var marca: String? = marca
            get() = field
            set(value) {
                field = value
            }
        var modelo: String? = modelo
            get() = field
            set(value) {
                if (value == null){
                    field = "no tiene placa"
                }else{
                    field = value
                }
            }
        var color: String = color
            get() = "gray"
            set(value) {
                field =value
            }
        var placa: String = placa
            get() = field
            set(value) {
                if (value.isEmpty()){
                    field = value
                }else{
                    field = "sin placa"
                }
            }
        var nPuertas: Int = nPuertas
            get() = 2
            set(value) {
                if (value <0){
                    field = 2
                }else{
                    field = value
                }
            }

        override fun toString(): String {
            val resulCar = "marca: $marca \nmodelo: $modelo \ncolor: $color" +
                    " \nplaca: $placa \ncantPuertas: $nPuertas"
            return super.toString()
        }
}