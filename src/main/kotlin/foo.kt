fun main(args: Array<String>) {

    5.multiply(7).show()

}

val show: Int.() -> Unit = {println("7 * X = $this")}

val multiply: Int.(x: Int)  -> Int = { x ->
    this * x
}

