package basics

fun main() {
    val a: Int = 10
    val b: Int = 20
    val c: Int = 30
    println((a < b) or (b > c))//true
    println((a < b) and (b > c))//false
    println(!(a < b) and (b > c).not())//false
    println(40 !in a..c)//true
}