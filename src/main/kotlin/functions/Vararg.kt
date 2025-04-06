package functions

fun main() {
    printStrings("Tom", "Bob", "Sam")
    printStrings("Kotlin", "JavaScript", "Java", "C#", "C++")
    var array = intArrayOf(1,4,6);
    changeNumbers(*array, koef=2)
}

fun printStrings(vararg strings: String) {
    for (str in strings)
        println(str)
}

// vararg should be the last among method params
fun printUserGroup(count: Int, vararg users: String) {
    println("Count: $count")
    for (user in users)
        println(user)
}

// spread operator(*)
fun changeNumbers(vararg numbers: Int, koef: Int) {
    for (i in numbers) {
        println(i * koef)
    }
}