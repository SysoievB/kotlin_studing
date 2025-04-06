package functions

fun main() {
    helloKotlin();
    { println("Hello Kotlin...") }();

    println(returnLambda(2,6))
}

val helloKotlin: () -> Unit = { println("Hello Kotlin") }

val returnLambda = {a: Int, b: Int ->
    val result = a + b
    result
}