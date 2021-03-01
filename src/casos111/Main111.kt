package casos111

import java.util.*

class App{
    companion object {
        @JvmStatic fun main(args: Array<String>){
            //App().run222()
            //App().suma(22,90)

          //  App().numMax()
            App().lineaBreak()
            App().arraysGenericos()
        }
    }

    fun arraysGenericos(){
        var strings = Array<String>(size = 5, init = {index -> " Item #$index"})
        print(Arrays.toString(strings))
        print(strings.size)
    }

    fun lineaBreak(){
        println()
        println("----------------------------")
        println()
    }

    fun run222 (){
        println("qwerty756")
    }

    fun suma(n1: Int, n2 :Int) {
        var resultado = n1+n2
        println("r = ${resultado}")
    }

    fun numMax(){
        print("Ingrese 2 numeros:: ")
        var (a,b) = readLine()!!.split(' ')
        println("Max numero es : ${maxNum2(a.toInt(), b.toInt())}")
    }

    fun maxNum2(a: Int, b:Int):Int {
        var max = if (a > b){
            println("the value of a is $a")
            a
        }else{
            println("the value of b is $b")
            b
        }
        return max
    }
}