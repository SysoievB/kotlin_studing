package functions

fun main() {
    println(square(2, 4))
    println(innerFunc(2, 10))
}

//fun имя_функции (параметры_функции) = тело_функции
fun square(a: Int, b: Int): Int = a * b

// Local functions
fun innerFunc(a: Int, b: Int): String {
    fun sum(a: Int, b: Int) = a + b
    val result = sum(a, b)
    return "Result: $result"
}