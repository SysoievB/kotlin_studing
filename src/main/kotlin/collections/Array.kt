package collections

fun main() {
    val array = arrayOf(1, 2, 3)
    val numbers = Array(3, {5}) // [5, 5, 5]

    var i = 1;
    val numbers2 = Array(3, { i++ * 2}) // [2, 4, 6]

    array.forEach { println(it) }

    println(array.get(0))
    println(numbers[0])
    println(numbers.getOrNull(0))
}