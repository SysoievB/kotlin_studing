package generics

fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val numbers: List<out Number> = listOf(1, 2, 3) // reading only
    val ints: MutableList<in Int> = mutableListOf<Number>() // writing only

    // the same on Java
    //List<Integer> list = Arrays.asList(1, 2, 3);
    //List<? extends Number> numbers = new ArrayList<Integer>(); // for reading
    //List<? super Integer> ints = new ArrayList<Number>();      // for writing

    val tom: GenericPerson<Int> = GenericPerson(367, "Tom")
    val bob: GenericPerson<String> = GenericPerson("A65", "Bob")

    println("${tom.id} - ${tom.name}")
    println("${bob.id} - ${bob.name}")

    val tom1: GenericDataPerson<Int> = GenericDataPerson(367, "Tom")
    val bob1: GenericDataPerson<String> = GenericDataPerson("A65", "Bob")

    println(tom1.toString())
    println(bob1.toString())

    val result1 = getBiggest(1, 2)
    println(result1)
    val result2 = getBiggest("Tom", "Sam")
    println(result2)
}

class GenericPerson<T>(val id: T, val name: String)
data class GenericDataPerson<T>(val id: T, val name: String)

fun <T> display(obj: T){
    println(obj)
}

fun <T: Comparable<T>> getBiggest(a: T, b: T): T{
    return if(a > b) a
    else b
}

//also can be created custom Type like in Java
fun<T:Message> send(message: T){
    println(message.text)
}

interface Message{
    val text: String
}
class EmailMessage(override val text: String): Message
class SmsMessage(override val text: String): Message