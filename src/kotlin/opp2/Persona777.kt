package opp2

class Persona777(documento:String, nombre:String, edad:Int, telefono:String) {

    var documento: String = documento
    var nombre: String = nombre
    var edad: Int = edad
    var telefono : String = telefono

    constructor() :this("","",0,""){
        println("Esta en el constructor")
    }

    init {
        println("valor de edad anterior: $edad")
        if (edad<0){
            this.edad = 0
        }
    }


    fun caminar(){
        println("La persona esta caminando...")
    }

    fun imprimirDatos(){
        var texto = "Nombre: $nombre\nDocumento: $documento\nedad: $edad \ntelefono: $telefono"
        println(texto)
    }
}