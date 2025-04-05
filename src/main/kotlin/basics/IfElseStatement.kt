package basics

fun main() {
    val name = readlnOrNull()
    if (name != "") {
        println("Your name: $name")
    } else {
        println("Your name is invalid")
    }

    val a = 20
    val b = 20
    val c = if (a > b) 1 else if (a < b) -1 else 0

    println(c)  // 0
}