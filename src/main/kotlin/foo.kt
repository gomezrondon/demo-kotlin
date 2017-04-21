fun main(args: Array<String>) {

    val persona:PersonKT = PersonKT(firstName = null)

  //  println("name is: ${persona.firstName!!.length}") //KotlinNullPointerException

    println("name is: ${persona.firstName?.length}")

}

data class PersonKT(var firstName:String?=null, var lastName:String?=null, var age: Int=0)
