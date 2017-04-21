import util.coffeNow

fun main(args: Array<String>) {

    val persona:PersonKT = PersonKT(firstName = "Javier")
    val persona2 = persona.copy()
    val persona3 = persona.copy(lastName = "Gomez")

    val message = if(persona == persona2) "Hello ${persona.firstName}"  else "not equal"

    println(message)

    if (persona3 != persona)
        println("old ${persona.lastName} New ${persona3.lastName}")

    for(i in 1..3){
        println("zz $i zz".coffeNow()) //Extension Functions
    }

    println("Hola " add "Mundo!") //infix function

    val personaJ = PersonaJava("Pepe","Perez",20) // Java in Kotlin
    println("Java: ${personaJ.toString()}")

}

infix fun String.add(str:String):String{
    return this + str
}

data class PersonKT(var firstName:String="", var lastName:String="", var age: Int=0)
