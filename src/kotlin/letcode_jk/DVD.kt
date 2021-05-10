package letcode_jk

// The actual code for creating an Array to hold DVD's.
// A simple definition for a DVD.
class DVD(var name: String, var releaseYear: Int, var director: String) {
    override fun toString(): String {
       return   name + ", directed by " + director + ", released in " + releaseYear

    }
}

fun sonparesarray(narra: IntArray):Int{
    val sizeArra= narra.size
    val residuo = sizeArra/2
    val modulo2 = sizeArra % 2
    if (modulo2 == 0){
        residuo
    }
    return residuo
}
