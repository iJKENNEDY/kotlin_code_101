package casos111



fun main(args: Array<String>) {


    arrayOf(12,34,59).map { 2* it +10 }.average().apply (::println)

    sequenceOf("a1","b2","c3","d4")
            .map { it.substring(1) }
            .map (String::toInt)
            .max().apply (::println)

    println()

    (1..10).map { "a$it" }.forEach(::println)
}