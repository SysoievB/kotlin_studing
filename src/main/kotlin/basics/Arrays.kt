package basics

fun main() {
    val numbers: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    println(numbers.contentToString())
    for (number in numbers) {
        if (number == 2) {
            println("$number is the first number")
        }
        println(number)
    }

    println("First element: " + numbers[0].toString())

    val nulls = arrayOfNulls<Int>(3)
    for (num in nulls) {
        println(num)//null null null
    }

    val array = Array(3, {5})
    println(array.contentToString())//[5, 5, 5]
    println(array.size)//3
    println(2 in array)//false
    println(5 in array)//true

    val ints: IntArray = intArrayOf(1, 2, 3, 4, 5)
    val doubles: DoubleArray = doubleArrayOf(2.4, 4.5, 1.2)
    val longs: LongArray = longArrayOf(1L, 2L, 3L)
}