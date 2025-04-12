package oop

/**
 * Use companion objects for:
 * Factory methods
 * Constants related to the class
 * Static-like utility functions
 *
 * Consider naming your companion object if:
 * It implements an interface
 * You need to reference it explicitly in Java code
 *
 * Remember:
 * Companion objects are initialized when the class is loaded
 * They can inherit from other classes/interfaces
 * They can be used as receivers for extension functions
 * */

// companion almost the same as static in Java
fun main() {
    Car3.printCar("BMW")

    val myCar = Car4.create("Tesla")
    println(myCar.model)  // Tesla

    println(Car5.MAX_SPEED)  // 300
    Car5.printMaxSpeed()     // Max speed: 300

    Car6.Logger.log("Engine started")  // [CAR] Engine started

    println(Car7.create("Audi"))  // Created Audi
}

private class Car3(val name: String) {
    companion object {
        fun printCar(name: String) {
            println(name)
        }
    }
}

//Factory Pattern with Companion
class Car4(val model: String) {
    companion object Factory {
        fun create(model: String): Car4 {
            return Car4(model)
        }
    }
}

//Companion with Constants
class Car5 {
    companion object {
        const val MAX_SPEED = 300
        fun printMaxSpeed() = println("Max speed: $MAX_SPEED")
    }
}

//Named Companion Object
class Car6 {
    companion object Logger {
        fun log(message: String) {
            println("[CAR] $message")
        }
    }
}
// Interface Implementation
interface CarFactory {
    fun create(model: String): String
}

class Car7 {
    companion object : CarFactory {
        override fun create(model: String) = "Created $model"
    }
}