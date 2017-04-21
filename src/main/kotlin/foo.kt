fun main(args: Array<String>) {

    println("7 * X = "+metodoSiete(5,::multiplicaLambda))

}

fun metodoSiete(cinco:Int, func:(Int, Int)-> Int): Int {
    return func(7,cinco)
}


fun multiplicaLambda(cinco:Int, siete:Int):Int{
    return siete * cinco
}