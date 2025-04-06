package functions

//(типы_параметров) -> возвращаемый_тип
fun main() {
    val message: () -> Unit = ::hello
    // the same as
    // val message: () -> Unit
    // message = ::hello
    message()

    val sumFunction: (Int, Int) -> Int = ::sumType
    val sumResult: Int = sumFunction(2, 6)
    println(sumResult)
}

//func type --> (Int, Int) -> Int
fun sumType(a: Int, b: Int): Int {
    return a + b
}