package oop

/**
 * Также, стоит отметить, что все классы по умолчанию наследуются от класса Any,
 * даже если класс Any явным образом не указан в качестве базового. Поэтому любой
 * класс уже по умолчанию будет иметь все свойства и функции, которые определены
 * в классе Any. Поэтому все классы по умолчанию уже будут иметь такие функции как
 * equals, toString, hashcode.
 * */
fun main() {
    val superClass = SuperClass("SuperClass")
    println(superClass.name)

    val subClass1 = SubClass1()
    println(subClass1.name)

    val subClass2 = SubClass2("SubClass2")
    println(subClass2.name)

    val bob = Child("Bob", "JetBrains")
    bob.printName()
    bob.printCompany()
}

open class SuperClass(var name: String)

class SubClass1 : SuperClass("sub")
class SubClass2 : SuperClass {
    constructor(name: String) : super(name)
}

open class Parent(val name: String) {
    fun printName() = println(name)
}

class Child(empName: String, val company: String) : Parent(empName) {

    fun printCompany() = println(company)
}