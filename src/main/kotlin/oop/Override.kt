package oop

/**
 * В Kotlin есть следующие модификаторы видимости:
 * * private: классы, объекты, интерфейсы, а также функции и свойства, определенные
 * вне класса, с этим модификатором видны только в том файле, в котором они
 * определены. Члены класса с этим модификатором видны только в рамках своего класса
 * * protected: члены класса с этим модификатором видны в классе, в котором они
 * определены, и в классах-наследниках
 * * internal: классы, объекты, интерфейсы, функции, свойства, конструкторы с
 * этим модификатором видны в любой части модуля, в котором они определены.
 * Модуль представляет набор файлов Kotlin, скомпилированных вместе в одну
 * структурную единицу. Это может быть модуль IntelliJ IDEA или проект Maven
 * * public: классы, функции, свойства, объекты, интерфейсы с этим модификатором
 * видны в любой части программы. (При этом если функции или классы с этим
 * модификатором определены в другом пакете их все равно нужно импортировать)
 * */

fun main() {
    val base = Base("John", "Doe", 180, 42)
    println(base.fullInfo)
    base.height = 230       // prints warning

    val derived = Derived("Alice", "Smith", 170)
    println(derived.fullInfo)
}

//Kotlin auto-generates get() and set() for properties:
//var → Generates both get() and set()
//val → Generates only get() (read-only)
open class Base(
    public val name: String,
    internal val surname: String,
    height: Int,
    private var privateVar: Int,
    protected open val age: Int = 18
) {
    open val fullInfo: String
        get() = "Base $surname - $age (height: $height)"

    open var height: Int = height  // uses parameter as initial value
        set(value) {
            if (value in 150..220) field = value
            else println("Invalid height: $value. Must be between 150 and 220.")
        }

    protected fun logPrivateVar() {
        println("PrivateVar value: $privateVar")  //privateVar accessible only within Base
    }

    final fun finalFunction() {
        println("Final function: $fullInfo")
    }

    open fun superFunction() {
        println("Super function: $fullInfo")
    }
}

class Derived(
    name: String,
    surname: String = "DefaultSurname",
    height: Int = 150,
    privateVal: Int = 0 //will be used this value
) : Base(name, surname, height, privateVal) {
    override val age: Int = 30

    // Overriding fullInfo with additional information
    override val fullInfo: String
        get() = "Derived $surname, age $age (height: $height cm)"

    init {
        println("Derived instance created: ${this.fullInfo}")
        logPrivateVar()
    }

    //override fun finalFunction() {} //'finalFunction' in 'Base' is final and cannot be overridden

    final override fun superFunction() {
        super.superFunction()
        println("Super function: $fullInfo")
    }
}

// Также переопределить свойство можно сразу в первичном конструкторе:
//open class Person(val name: String, open var age: Int = 1)
//open class Employee(name: String, override var age: Int = 18): Person(name, age)