package collections

fun main() {
    val people = listOf("Tom", "Bob", "Sam", "Kate", "Alice", "Mike")

    println(people.slice(1..3))     // [Bob, Sam, Kate]
    println(people.slice(0..5 step 2))  // [Tom, Sam, Alice]
    println(people.slice(listOf(1, 3, 5, 1)))   // [Bob, Kate, Mik

    println(people.take(3))     // ["Tom", "Bob", "Sam"]
    // получаем три последних элемента
    println(people.takeLast(3))     // ["Kate", "Alice", "Mike"]

    val part = people.takeWhile{it.length == 3}
    println(part)     // ["Tom", "Sam"]

    val part1 = people.takeLastWhile{it.length !=3} // длина НЕ равна 3
    println(part1)     // ["Alice", "Mike"]

    val part2 = people.drop(3) // пропускаем первые 3 элемента
    println(part2)     // [Bob, Alice, Mike]

    val part3 = people.dropLast(2) // пропускаем последние 2 элемента
    println(part3)     // [Tom, Sam, Kate, Bob]

    val part4 = people.dropWhile { it.length == 3 }
    println(part4)     // [Kate, Bob, Alice, Mike]
}
