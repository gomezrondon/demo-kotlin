fun main(args: Array<String>) {

    val persona:PersonKT = PersonKT(firstName = null)

    val name = persona.firstName ?: "Elvis Operator"

    println("name is: $name")

}

data class PersonKT(var firstName:String?=null, var lastName:String?=null, var age: Int=0)


