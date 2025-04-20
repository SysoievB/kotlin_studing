package collections

fun main() {
    val map = mapOf(1 to "one", 2 to "two", 3 to "three")
    println(map)

    println(map.keys)
    println(map.values)
    println(map.entries)

    val people = mutableMapOf(220 to "Tom", 225 to "Sam", 228 to "Bob") // MutableMap<Int, String>
    people[221] = "Kate"
    println(people)

    val linkedMap = linkedMapOf(220 to "Tom", 225 to "Sam", 228 to "Bob")  // объект типа LinkedHashMap<Int, String>
    val hashMap = hashMapOf(220 to "Tom", 225 to "Sam", 228 to "Bob")   // объект типа HashMap<Int, String>

    hashMap.entries
        .forEach { println("${it.key} = ${it.value}") }
}