package lines_break

import lineaSeparacion

fun inputDescriptionVar(texto: String){
    val chStart: Char = '*'
    print("${chStart})Ingrese un ${texto}...> ")
}

fun baner(){
    val txtBanner = """
        ----------------
        |0000000000000/
        |000000000000/
        |00000000000/      
        |0000000000/
        |000000000/
        |00000000/
        |00000000\
        |000000000\
        |0000000000\
        |00000000000\
        |000000000000\
        |0000000000000\
        --------------- 
    """.trimIndent()
    println(txtBanner)
}

fun textTrim(){
    val stringBanner: String = """
        | este es un texto de prueba
        | aqui es otra linea de mensaje
        | esta es la tercera linea
    """.trimIndent()
    val  txtBanner = """
        | este es un texto de prueba
        | aqui es otra linea de mensaje
        | esta es la tercera linea
    """.trimMargin()
    println(stringBanner)
    lineaSeparacion()
    println(txtBanner)
}

