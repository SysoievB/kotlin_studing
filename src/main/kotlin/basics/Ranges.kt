package basics

fun main() {

    val range = 1..5

    var isInRange = 5 in range
    println(isInRange)//true

    isInRange = 86 in range
    println(isInRange)//false

    var isNotInRange = 6 !in range
    println(isNotInRange)//true

    isNotInRange = 3 !in range
    println(isNotInRange)//false

    val range1 = 5 downTo 1
    for(c in range1) print(c)//54321
    println()

    val range2 = 'a'..'d'
    for(c in range2) print(c)//abcd
    println()

    for(c in 1..9) print(c)//123456789
    println()

    for(c in 1 until 9) print(c)//12345678
    println()

    for(c in 1..9 step 2) print(c)//13579
}