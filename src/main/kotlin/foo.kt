fun main(args: Array<String>) {

    println("7 * X = "+metodoSiete(5){x, y -> x * y})

}

fun metodoSiete(cinco:Int, func:(Int, Int)-> Int): Int {
    return func(7,cinco)
}

