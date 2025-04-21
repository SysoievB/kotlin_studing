package collections

fun main() {
    val numbers = listOf(1, -2, 3, -4, 5, -6)

    //// using `it` (implicit)
    //.filter { it > 0 }
    //// using named parameter
    //.filter { number -> number > 0 }
    numbers.asSequence()
        .filter { it > 0 }
        .forEach { println(it) }
    println("------------------------")
    numbers.asSequence()
        .filterNot { num -> num < 0 }
        .forEach { println(it) }
    println("------------------------")
    numbers.asSequence()
        .filterIndexed() { index, _ -> index % 2 == 0 }
        .forEach { println(it) }
    println("------------------------")
    val people = listOf("Tom", "Mike", "Sam", "Bob", "Alice", null)
    people.asSequence()
        .filterNotNull()
        .forEach { println(it) }
    println("------------------------")
    people.asSequence()
        .filterIsInstance(String::class.java)
        .forEach { println(it) }
}