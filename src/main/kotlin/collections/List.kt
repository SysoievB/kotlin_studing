package collections

fun main() {
    val listNums = listOf(1, 2, 4, 8, 16)

    for (num in listNums) {
        println(num)
    }

    val firstNum = listNums[0]//throws exception if index is out of bounds
    val secondNum = listNums.get(1)//throws exception if index is out of bounds
    val thirdNum = listNums.getOrElse(3, { 0 })
    println("$firstNum $secondNum $thirdNum")
    val arrayList = arrayListOf("a", "b", "c")//

    val arrayMutableList = mutableListOf("a", "b", "c")
    //Mutable-коллекция может изменяться, в нее можно добавлять, в ней можно изменять, удалять элементы
    // Immutable-коллекция также поддерживает добавление, замену и удаление данных, однако в процессе подобных операций коллекция будет заново пересоздаваться
    arrayList.add("d")
    arrayList.add(1, "e")
    println(arrayList)

    arrayList.remove("d")
    arrayList.removeAt(1)
    println(arrayList)

    val immutableList: List<String> = listOf("x", "y", "z")//Kotlin enforces immutability at the interface level

    //immutableList.add("w") // ❌ Compile-time error — List has no add()
}