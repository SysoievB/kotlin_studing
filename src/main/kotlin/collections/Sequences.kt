package collections

fun main() {
    val people = sequenceOf("Tom", "Sam", "Bob")    //тип Sequence<String>
    println(people.joinToString())  // Tom, Sam, Bob

    people.asSequence()
        .map { name -> name.uppercase() }
        .forEach { println(it) }

    var number = 0
    val numbers = generateSequence{ number += 2; number}
    println(numbers.take(5).joinToString())    // получаем первые 5 элементов последовательности - 2, 4, 6, 8, 10


    //yield() similar to Stream.generate() in Java
    val numbers1 = sequence {
        yield(1)
        yield(4)
        yield(7)
    }
    println(numbers1.joinToString())    // 1, 4, 7

    val numbers2 = sequence { yieldAll(listOf(1, 4, 7)) }
    println(numbers2.joinToString())
}