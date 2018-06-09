import java.util.*
import kotlin.collections.ArrayList

fun main(args: Array<String>) {

    // test 1
    val list = listOf("Fowler", "Beck", "Evans")

    var primero =""
    list.notNullOrEmpty {
        primero = firstOrNull().toString()
    }

    println("test 1 = $primero ")


    //test 2 - The same but without a name
    val list2 = listOf(1, 2, 3, 4)
    //val list = ArrayList<String>()

     list2 {
         primero = firstOrNull().toString()
    }

    println("test 2 = $primero ")


    // test 3
    val list3 = ArrayList<String>()

    list3.notNullOrEmpty {
        primero = firstOrNull().toString()
    }

    println("test 3 = $primero ")

}



// Extends the functionality of the Collection class
inline fun <E: Any, T: Collection<E>> T?.notNullOrEmpty(func: T.() -> Unit): Unit {
    if (this != null && this.isNotEmpty()) {
        with (this) { func() }
    }
}


// The same but without a name
inline operator fun <E: Any, T: Collection<E>> T?.invoke(func: T.() -> Unit): Unit {
    if (this != null && this.isNotEmpty()) {
        with (this) { func() }
    }
}



