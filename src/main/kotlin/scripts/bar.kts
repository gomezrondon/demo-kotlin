import java.io.File


val lines = File("hola.txt").readLines()
lines.forEach { println(it) }

//how to execute:
//> kotlinc -script bar.kts