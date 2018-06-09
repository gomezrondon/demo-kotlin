fun main(args: Array<String>) {

    println("8 * X = "+metodoSiete(8)(5))

}

// high level function with lambda
fun metodoSiete(number:Int): (x:Int)-> Int {
    return {x -> x * number}
}

