package collections

fun main() {
    val people = listOf("Tom", "Mike", "Bob", "Sam", "Alice")
    val numbers = listOf(3, 5, 2, -4, -6, 9, 1)

// сортировка по возрастанию
    val sortedPeople = people.sorted()
    val sortedNumbers = numbers.sorted()
    println(sortedPeople)   // [Alice, Bob, Mike, Sam, Tom]
    println(sortedNumbers)  // [-6, -4, 1, 2, 3, 5, 9]

// сортировка по убыванию
    println(people.sortedDescending())  // [Tom, Sam, Mike, Bob, Alice]
    println(numbers.sortedDescending()) // [9, 5, 3, 2, 1, -4, -6]
//sortedWith using Comparator
    val people1 = listOf(
        Person12("Tom", 37),
        Person12("Bob", 41),
        Person12("Sam", 25)
    )
    val personComparator = Comparator { p1: Person12, p2: Person12 -> p1.age - p2.age }

    val sortedPeople1 = people1.sortedWith(personComparator)
    println(sortedPeople1)   // [Sam (25), Tom (37), Bob (41)]

    //sortedBy(crossinline selector: (T) -> R?): List<T> / Sequence<T>
    //sortedByDescending(crossinline selector: (T) -> R?): List<T> / Sequence<T>
    println("---------------")
    people1
        .sortedBy(Person12::age)
        .forEach { println(it) }

    //reverse и shuffle
    val numbers1 = listOf(1, 2, 3, 4, 5, 6)
    val reversed = numbers1.reversed()
    println(reversed)   // [6, 5, 4, 3, 2, 1]

    val shuffled = numbers1.shuffled()
    println(shuffled)   // [4, 6, 3, 5, 1, 2]
}

private class Person12(val name: String, val age: Int) {
    override fun toString(): String {
        return "Person(name='$name', age=$age)"
    }
}