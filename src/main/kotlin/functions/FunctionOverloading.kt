package functions

fun main() {
    val a = sum1(1, 2)
    val b = sum1(1.5, 2.5)
    val c = sum1(1, 2, 3)
    val d = sum1(2, 1.5)
    val e = sum1(1.5, 2)
}

fun sum1(a: Int, b: Int) : Int{
    return a + b
}
fun sum1(a: Double, b: Double) : Double{
    return a + b
}
fun sum1(a: Int, b: Int, c: Int) : Int{
    return a + b + c
}
fun sum1(a: Int, b: Double) : Double{
    return a + b
}
fun sum1(a: Double, b: Int) : Double{
    return a + b
}