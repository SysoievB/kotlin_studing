package collections

fun main() {
    val people = listOf("Tom", "Kate", "Sam", "Alice", "Bob")

    val resultAny: Boolean = people.any({it.length <= 3})
    println(resultAny)

    val resultAll: Boolean = people.all({it.length <= 3})
    println(resultAll)

    val resultNone: Boolean = people.none({it.length <= 3})
    println(resultNone)
}