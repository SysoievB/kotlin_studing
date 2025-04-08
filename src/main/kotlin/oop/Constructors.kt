package oop

fun main() {
    val person = Person("Valia", 25);
    println(person.name)
    println(person.age)

    val employee = Employee("Via", 25);
    println(employee.name)
    println(employee.age)

    val employee1 = Employee("Via", 25, 80.0);
    println(employee1.name)
    println(employee1.age)
    println(employee1.weight)

    val personWithBlock = PersonWithInitBlock("Vasia", 110)
    println(personWithBlock.name)
    println(personWithBlock.age)
}

// primary constructor
class Person(val name: String, var age: Int)

class Employee {
    val name: String
    var age: Int = 0
    var weight: Double = 0.0

    // primary constructor
    constructor(_name: String) {
        name = _name
    }

    // secondary constructor
    constructor(_name: String, _age: Int) {
        name = _name
        age = _age
    }

    constructor(_name: String, _age: Int, _weight: Double) : this(_name, _age) {
        weight = _weight
    }
}

//initialisation block
class PersonWithInitBlock(_name: String, _age: Int) {
    val name: String
    var age: Int = 1//this value will be returned if age will be outside range inside init block

    init {
        name = _name
        if (_age in 1..109) age = _age
    }
}