package collections

fun main() {

    //minOrNull() && maxOrNull() && average() && sum() && count()
    val numbers = listOf(4, 6, 3, 5, 1, 2)
    val people = listOf("Alice", "Tom", "Sam", "Kate", "Bob")

    println(numbers.minOrNull())   // 1
    println(numbers.maxOrNull())   // 6

    println(people.minOrNull())   // Alice
    println(people.maxOrNull())   // Tom

    println(numbers.average())//3.5
    println(numbers.sum())//21
    println(numbers.count())//6

    //minByOrNull() && maxByOrNull()
    println("-------------------")
    val people1 = listOf( Person13("Tom", 37), Person13("Bob",41), Person13("Sam", 25))
    // минимальный возраст
    val personWithMinAge = people1.minByOrNull { it.age }
    println(personWithMinAge)     // Sam (25)
    // максимальный возраст
    val personWithMaxAge = people1.maxByOrNull { it.age }
    println(personWithMaxAge)     // Bob (41)

    //minOfOrNull() && maxOfOrNull()
    println("-------------------")
    // минимальный возраст
    val minAge = people1.minOfOrNull { it.age }
    println(minAge)     // 25
    // максимальный возраст
    val maxAge = people1.maxOfOrNull { it.age }
    println(maxAge)     // 41

    //minWithOrNull() & maxWithOrNull() -- using Comparator inside
    //maxOfWithOrNull(comparator: Comparator<in R>, selector: (T) -> R): R?
    //minOfWithOrNull(comparator: Comparator<in R>, selector: (T) -> R): R?
    println("-------------------")
    val colors = listOf("red", "green", "blue", "yellow")
    val minColor = colors.minWithOrNull(compareBy {it.length})
    val maxColor = colors.maxWithOrNull(compareBy {it.length})
    println(minColor)   // red
    println(maxColor)   // yellow

    //reduce() && fold()
    println("-------------------")
    val reducedValue = numbers.reduce{ a, b -> a + b + 10 }
    println(reducedValue)   // 71

    //Функция fold также сводит все элементы потока в один.
    // Но в отличие от reduce в качестве первого параметра принимает начальное значение
    println("-------------------")
    val foldedValue = people.fold("People:", { a, b -> "$a $b" })
    println(foldedValue)   // People: Tom Bob Kate Sam Alice
}
private class Person13(val name: String, val age: Int){
    override fun toString(): String = "$name ($age)"
}