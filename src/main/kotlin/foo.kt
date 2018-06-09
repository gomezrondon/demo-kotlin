fun main(args: Array<String>) {

    //Coparing the Copy method "impl by kotlin"
    val persona:PersonKT = PersonKT(firstName = "Javier")
    val persona2 = persona.copy()
    val persona3 = persona.copy(lastName = "Gomez")

    if(persona == persona2){
        println("Hello ${persona.firstName}")
    }else{
        println("not equal")
    }


}

data class PersonKT(var firstName:String="", var lastName:String="", var age: Int=0)
