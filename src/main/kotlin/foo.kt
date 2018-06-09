import util.coffeNow

fun main(args: Array<String>) {


    val personaJ = PersonaJava("Pepe","Perez",20) // Java in Kotlin
    println("Java: ${personaJ.toString()}")

}


data class PersonKT(var firstName:String="", var lastName:String="", var age: Int=0)
