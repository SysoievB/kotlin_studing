package collections
//flatMap() -> Maps + flattens
//flatten() -> Just flattens
fun main() {
    val personal = listOf(listOf("Tom", "Bob"), listOf("Sam", "Mike", "Kate"), listOf("Tom", "Bill"))
    val people = personal
        .map { innerList -> innerList.map { it.uppercase() } }
        .flatten() //the same as .flatMap { it }

    println(people)

}