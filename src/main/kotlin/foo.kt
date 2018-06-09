import java.util.*
import kotlin.collections.ArrayList

fun main(args: Array<String>) {
// beginning of a DSL
 val persona = PersonKT()

    persona{
        firstName = "Javier"
        lastName = "Gomez"
    }

    println("Persona: $persona")

}


inline operator fun < T: PersonKT> T?.invoke(func: T.() -> Unit): Unit {
    if (this != null) {
        with (this) {func()  }
    }
}


data class PersonKT(var firstName:String?=null, var lastName:String?=null, var age: Int=0)

