package oop

//val property: Type by delegate

val greeting: String by lazy {
    println("Computed!")
    "Hello, Kotlin!"
}

fun main() {
    println(greeting) // prints "Computed!" then "Hello, Kotlin!"
    println(greeting) // prints only "Hello, Kotlin!" (cached)
}
