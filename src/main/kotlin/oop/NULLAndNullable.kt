package oop

fun main() {
    // val n : Int = null  //! ошибка, Int не допускает значение null
    var d: Int? = null // норм, Int? допускает значение null the same as Integer from Java
    println(d)
    d = 32
    println(d)

    var bob: Person10 = Person10("Bob")
    // bob = null // ! Ошибка - bob представляет тип Person и не допускает null
    var tom: Person10? = Person10("Tom")
    tom = null  // норм - tom представляет тип Person? и допускает null

    var message : String? = "Hello"
    // у типа String свойство length возвращает длину строки
    //println("Message length: ${message.length}")    // ! Ошибка

    var message1 : String? = "Hello"
    //val hello: String = message1     // ! Ошибка - hello не допускает значение null
}

private class Person10(val name: String)

//String? и Int? - это не то же самое, что и String и Int. Nullable типы имеют ряд ограничений:
//Значения nullable-типов нельзя присвоить напрямую переменным, которые не допускают значения null
//У объектов nullable-типов нельзя вызвать напрямую те же функции и свойства, которые есть у обычных типов
//Нельзя передавать значения nullable-типов в качестве аргумента в функцию, где требуется конкретное значение, которое не может представлять null