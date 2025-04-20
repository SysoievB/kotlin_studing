package collections

fun main() {
    val numbers1: HashSet<Int> = hashSetOf(5, 6, 7)
    val numbers2: LinkedHashSet<Int> = linkedSetOf(25, 26, 27)
    val numbers3: MutableSet<Int> = mutableSetOf(35, 36, 37)

    val people = setOf("Tom", "Sam", "Bob", "Mike")
    val employees = setOf("Tom", "Sam", "Kate", "Alice")

//  объединение множеств
    val all = people.union(employees)
// пересечение множеств
    val common = people.intersect(employees)
// вычитание множеств
    val different = people.subtract(employees)

    println(all)        // [Tom, Sam, Bob, Mike, Kate, Alice]
    println(common)     // [Tom, Sam]
    println(different)  // [Bob, Mike]
}