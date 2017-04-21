fun main(args: Array<String>) {

    println("7 * X = "+metodoSiete(5)(7))

}

fun metodoSiete(cinco:Int): (x:Int)-> Int {
    return {x -> x * cinco}
}

