import util.coffeNow

fun main(args: Array<String>) {

    val count = PersonKT.staticMethodCountLetters("Javier")

    println("count: $count")

}


data class PersonKT(var firstName:String="", var lastName:String="", var age: Int=0){

    constructor(firstName:String="") : this(firstName,lastName="",age=0)

    companion object{
        @JvmStatic()
        fun staticMethodCountLetters(str:String)=str.length
    }

}
