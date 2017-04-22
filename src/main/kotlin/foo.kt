import java.util.*
import kotlin.collections.ArrayList

fun main(args: Array<String>) {

    val list = listOf("Fowler", "Beck", "Evans")
   //val list = listOf(1, 2, 3, 4)
    //val list = ArrayList<String>()

    var primero = ""
    list.notNullOrEmpty {
        primero =firstOrNull().toString()
    }



/*
    println("primero = $primero ")

   val counter = list.notNullOrEmpty2 {
                   // stream().count().toInt()
                   firstOrNull().toString()
                }

    println("counter = $counter ")

    list {
        stream().forEach( {x -> println(x)})
    }
*/
}


inline operator fun <E: Any, T: Collection<E>> T?.invoke(func: T.() -> Unit): Unit {
    if (this != null && this.isNotEmpty()) {
        with (this) { func() }
    }
}

inline fun <E: Any, T: Collection<E>> T?.notNullOrEmpty(func: T.() -> Unit): Unit {
    if (this != null && this.isNotEmpty()) {
        with (this) { func() }
    }
}

inline fun <E: Any, T: Collection<E>> T.notNullOrEmpty2(func: T.() -> Any): Any? {
    if (this != null && this.isNotEmpty()) {
        with (this) { return func()}
    } else return null
}

data class PersonKT(var firstName:String?=null, var lastName:String?=null, var age: Int=0)

