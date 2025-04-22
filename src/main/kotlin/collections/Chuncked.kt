package collections

fun main() {
    //chunked(size: Int): List<List<T>>       // для коллекций
    //chunked(size: Int): Sequence<List<T>>  // для последовательностей

    val people = listOf("Tom", "Sam", "Kate", "Bob", "Alice", "Mike")
    val parts = people.chunked(3)
    println(parts)     // [[Tom, Sam, Kate], [Bob, Alice, Mike]]


}