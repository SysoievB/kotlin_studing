package collections

fun main() {
    //zip(other: Iterable<R>/Sequence<R>): List<Pair<T, R>>/Sequence<Pair<T, R>>
    //zip(other: Iterable<R>,transform: (a: T, b: R) -> V): List<V>
    //zip(other: Sequence<R>,transform: (a: T, b: R) -> V): Sequence<V>
    val english = listOf("red", "blue", "green")
    val russian = listOf("красный", "синий", "зеленый")
    val words = english.zip(russian)
    println(words)//[(red, красный), (blue, синий), (green, зеленый)]

    for (word in words)
        println("${word.first}: ${word.second}")
    //red: красный
    //blue: синий
    //green: зеленый

    // Uppercase the second property:
    words.map { pair ->
        Pair(pair.first, pair.second.uppercase())
    }
        .forEach { println("${it.first}: ${it.second}") }

    //unzip
    val unzipped = words.unzip()
    println("-------------------------")
    println(unzipped.first)
    println("-------------------------")
    println(unzipped.second)
}