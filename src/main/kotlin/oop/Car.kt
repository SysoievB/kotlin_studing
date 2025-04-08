package oop

class Car {
    var name: String = "Undefined"
    var productionDate: Int = 18

    fun go(location: String){
        println("$name goes to $location")
    }

    fun carToString() : String{
        return "Name: $name  production date: $productionDate"
    }
}

fun main() {
    val car = Car()
    println(car.name)
    println(car.carToString())
}