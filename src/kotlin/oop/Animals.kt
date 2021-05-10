package oop

open class Animals {
    open fun onomatopeyas()
    {
        println("mmmmmmmmm....")
    }

    open fun tipoAnimal(){
        println("tipo de animal")
    }

    fun colorAnimal(color: String):String{
        return color
    }
}

class Terrestres_animals: Animals(){
    override fun onomatopeyas() {

    }

    override fun tipoAnimal() {
        println(".... terrestres ....")
    }

}

class Acuaticas_animals: Animals(){
    override fun onomatopeyas() {
        super.onomatopeyas()
    }

    override fun tipoAnimal() {
        super.tipoAnimal()
    }

    override fun toString(): String {
        return super.toString()
    }
}