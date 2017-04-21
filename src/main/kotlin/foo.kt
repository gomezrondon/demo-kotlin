fun main(args: Array<String>) {

    val persona:PersonKT = PersonKT(firstName = "Javier")
    val persona2 = persona.copy()
    val persona3 = persona.copy(lastName = "Gomez")

    val message = if(persona == persona2) "Hello ${persona.firstName}"  else "not equal"

    println(message)

    if (persona3 != persona)
        println("old ${persona.lastName} New ${persona3.lastName}")

}

data class PersonKT(var firstName:String="", var lastName:String="", var age: Int=0)
