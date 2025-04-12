package oop

fun main() {

    val person = object { //anonymous object
        val name = "Tom"
        var age = 37
        fun sayHello() {
            println("Hi, my name is $name")
        }
    }
    println("Name: ${person.name}  Age: ${person.age}")
    person.sayHello()
}