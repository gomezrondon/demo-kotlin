
fun main(args: Array<String>) {

    val count = PersonKT.staticMethodCountLetters("Javier")
    val foo = PersonKT.FOO
    println("count: $count")
    println("foo: $foo")

}


data class PersonKT(var firstName:String="", var lastName:String="", var age: Int=0){

    companion object{
      //  @JvmStatic()
        fun staticMethodCountLetters(str:String)=str.length
       //const val FOO = 1
       val FOO = 1
    }

}
