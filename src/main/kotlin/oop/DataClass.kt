package oop

fun main() {

    val alice: Person2 = Person2("Alice", 24)
    println(alice.toString())//oop.Person2@34c45dca

    val tom: Person3 = Person3("Tom", 32)
    println(tom.toString())// Person3(name=Tom, age=32)
    val kate = tom.copy(name = "Kate")
    println(kate.toString())//Person3(name=Kate, age=32)

    //decomposition
    val (username, userage) = kate
    println("Name: $username  Age: $userage") // Name: Kate  Age: 32
}

private class Person2(val name: String, val age: Int)
//При этом чтобы класс определить как data-класс, он должен соответствовать ряду условий:
//Первичный конструктор должен иметь как минимум один параметр
//Все параметры первичного конструктора должны предваряться ключевыми словами val или var, то есть определять свойства
//Свойства, которые определяются вне первичного конструктора, не используются в функциях toString, equals и hashCode
//Класс не должен определяться с модификаторами open, abstract, sealed или inner
private data class Person3(val name: String, val age: Int)
//При компиляции такого класса компилятор автоматически добавляет в класс
// функции с определенной реализацией, которая учитывает свойства класса,
// которые определены в первичном конструкторе:
//equals(): сравнивает два объекта на равенство
//hashCode(): возвращает хеш-код объекта
//toString(): возвращает строковое представление объекта
//copy(): копирует данные объекта в другой объект
