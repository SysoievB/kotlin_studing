package collections

fun main() {
    val people = listOf("Tom", "Sam", "Kate", "Bob", "Alice")
    // получаем элемент по индексу 1
    println(people.elementAt(1))     // Sam
    println(people.elementAtOrNull(5)) //null
    println(people.elementAtOrNull(1)) //Sam
    println(people.elementAtOrElse(1){"Undefined"})     // Sam
    println(people.elementAtOrElse(6){"Undefined"})     // Undefined
    println(people.first())     // Tom
    println(people.last())     // Alice
    println(people.random())
    println(people.randomOrNull())//id collection is empty returns null
}