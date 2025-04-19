package oop

/**
 * fun тип.имя_функции(параметры) : возвращаемый_тип{
 *     тело функции
 * }
 * let you add new functionality to existing classes without modifying their source code.
 *
 * An extension function allows you to "extend" a class with new functions, as if they were part of the class.
 *
 * Things to Keep in Mind:
 *
 * Extensions can't access private/protected members of the class.
 *
 * If a member function and an extension function have the same signature, the member wins.
 *
 * You can also extend nullable types, e.g., fun String?.isNullOrEmpty()*/

fun main() {
    val p = Person11("Alice")
    p.greet()  // Hello, my name is Alice

    val name = "Kotlin"
    println(name.countVowels())  // Output: 2
}

class Person11(val name: String)

fun Person11.greet() {
    println("Hello, my name is $name")
}

fun String.countVowels(): Int {
    return count { it.lowercaseChar() in "aeiou" }
}
