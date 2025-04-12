package oop

fun main() {
    val userAcc = Person1.Account("qwerty", "123456");
    userAcc.showDetails()

    val acc = BankAccount(3400);
    acc.Transaction(2400).pay()
}

//nested classes
private class Person1 {
    class Account(val username: String, val password: String) {

        fun showDetails() {
            println("UserName: $username  Password: $password")
        }
    }
}

interface SomeInterface {
    class NestedClass
    interface NestedInterface
}

class SomeClass {
    class NestedClass
    interface NestedInterface
}

//inner
//Чтобы вложенный класс мог иметь доступ к свойствам и функциям внешнего класса,
//необходимо определить вложенный класс с ключевым словом inner.
private class BankAccount(private var sum: Int) {

    fun display() {
        println("sum = $sum")
    }
    // Но что если свойства и функции внутреннего класса называются также, как и
    // свойства и функции внешнего класса? В этом случае внутренний класс может
    // обратиться к свойствам и функциям внешнего через конструкцию
    // this@название_класса.имя_свойства_или_функции
    inner class Transaction(private var sum: Int) {
        fun pay() {
            this@BankAccount.sum -= this@Transaction.sum
            display()
        }
    }
}