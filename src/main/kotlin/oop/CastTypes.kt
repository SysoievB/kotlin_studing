package oop

/**
 * Для smart-преобразований действуют следующие правила:
 *
 * 1.smart-преобразования применяются к локальным val-переменным (за исключением делегированных свойств)
 *
 * 2.smart-преобразования применяются к val-свойствам, за исключением свойств с модификатором open (то есть открытых к переопределению в производных классах) или свойств, для которых явным образом определен геттер
 *
 * 3.smart-преобразования применяются к локальным var-переменным (то есть к переменным, определенным в функциях), если переменная не изменяет своего значения в промежутке между проверкой и использованием и не используется в лямбда-выражении, которое изменяет ее, а также не является локальным делегированным свойством
 *
 * 4.к var-свойствам smart-преобразования не применяются*/

fun main() {
    val s: String = "12"
    val i: Int = s.toInt()
    val b: Byte = s.toByte()
    val sh: Short = s.toShort()
    val l: Long = s.toLong()
    println(i)
    println(b)
    println(sh)
    println(l)

    println("-----------Smart cast-----------")

    printLength("Hello")//5
    printLength(12)//prints nothing

    println("-----------Manual cast-----------")

    printLength1("Hello")//5
    //printLength1(12)//throws ClassCastException

    println("-----------Safe Version Using as?-----------")

    printLengthSafe("Hello")//5
    printLengthSafe(12)//Not a string
}

//Smart cast
fun printLength(value: Any) {
    if (value is String) {
        println(value.length)  // Smart cast: value is treated as String
    }
}

//as Operator — Manual cast
fun printLength1(value: Any) {
    val str = value as String  // Unsafe cast: will throw if value is not a String
    println(str.length)
}

//Safe Version Using as?
fun printLengthSafe(value: Any) {
    val str = value as? String  // Safe cast: returns null if not a String
    if (str != null) {
        println(str.length)
    } else {
        println("Not a string")
    }
}
