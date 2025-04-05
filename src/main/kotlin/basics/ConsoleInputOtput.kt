package basics

fun main() {
    println("Input name:")
    var name = readlnOrNull()
    println("Input age:")
    var age = readln().toInt()
    println("Your name: $name, your age: $age")
}