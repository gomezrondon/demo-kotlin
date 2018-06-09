import util.coffeNow

fun main(args: Array<String>) {

    println("Hola " add "Mundo!") //infix function
    
}

infix fun String.add(str:String):String{
    return this + str
}

