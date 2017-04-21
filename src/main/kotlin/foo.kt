fun main(args: Array<String>) {

    val persona:PersonKT = PersonKT(firstName = "Javier")

}

data class PersonKT(var firstName:String="", var lastName:String="", var age: Int=0)
