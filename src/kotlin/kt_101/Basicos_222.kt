

class Basicos_222 {

    fun basic_max_result(){
        println("Ingrese 2 numeros: ")
        var (a,b) = readLine()!!.split(' ')
        println("El numero maximo es: ${max_bsc(a.toInt(), b.toInt() )}")

    }

    fun max_bsc(a:Int, b:Int):Int{
        var max = if (a>b){
            println("el valor de a = $a")
            a
        }else{
            println("el valor de b = $b")
            b
        }
        return max
    }
}