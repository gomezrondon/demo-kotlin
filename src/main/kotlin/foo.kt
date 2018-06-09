import java.io.File

fun main(args: Array<String>) {

    //Lambda Expressions
    val lines = File("C:/temp/mock_data.csv").readLines() //Where is the try catch?
    lines.map { it.toLowerCase() }
            .map { it.split(",")}
            .filter { it[1].startsWith("ant") }
            .slice(1..5) // limit
            .forEach { println(it) }

}

