package collections

fun main() {
    val people = listOf("Tom", "Bob", "Sam")
    // добавляем один объект
    val result1: List<String> = people.plus("Alice")//creates new list
    println(result1)  // [Tom, Bob, Sam, Alice]

    val employees = listOf("Mike", "Kate")
    // добавляем коллекцию объектов
    val result2 = people.plus(employees)
    println(result2)  // [Tom, Bob, Sam, Mike, Kate]

    val result3 = people + listOf("Jake", "Peter")
    println(result3)

    // вычитаем один объект
    val result4 = people.minus("Bob")
    println(result4)  // [Tom, Sam, "Kate"]

    // вычитаем коллекцию
    val result5 = people.minus(employees)
    println(result5)  // [Tom, Bob, Sam]

    val result6 = people - listOf("Bob", "Kate")
    println(result6)
}