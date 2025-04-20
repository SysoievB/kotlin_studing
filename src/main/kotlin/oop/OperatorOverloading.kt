package oop


fun main() {
    val p1 = Point(1, 2)
    val p2 = Point(3, 4)
    val result = p1 + p2
    println(result)  // Output: Point(x=4, y=6)

    val shelf = BookShelf(listOf("Kotlin", "Java", "Python"))
    println("Kotlin" in shelf)  // Output: true

    val c1 = ComplexNumber(3.0, 2.0)
    val c2 = ComplexNumber(1.0, 4.0)

    println(c1 + c2)  // "4.0 + 6.0i"
    println(c1 - c2)  // "2.0 - 2.0i"
    println(c1 * c2)  // "–5.0 + 14.0i"
}

data class Point(val x: Int, val y: Int) {
    operator fun plus(other: Point): Point {
        return Point(x + other.x, y + other.y)
    }
}

class BookShelf(val books: List<String>) {
    operator fun contains(title: String): Boolean {
        return books.contains(title)
    }
}

class ComplexNumber(val real: Double, val imaginary: Double) {

    // Addition
    operator fun plus(other: ComplexNumber): ComplexNumber {
        return ComplexNumber(real + other.real, imaginary + other.imaginary)
    }

    // Subtraction — fixed name from `subs` to `minus`
    operator fun minus(other: ComplexNumber): ComplexNumber {
        return ComplexNumber(real - other.real, imaginary - other.imaginary)
    }

    // Multiplication — fixed formula and syntax
    operator fun times(other: ComplexNumber): ComplexNumber {
        val realPart = real * other.real - imaginary * other.imaginary
        val imagPart = real * other.imaginary + imaginary * other.real
        return ComplexNumber(realPart, imagPart)
    }

    // Display complex number as string
    override fun toString(): String {
        val sign = if (imaginary >= 0) "+" else "-"
        return "$real $sign ${kotlin.math.abs(imaginary)}i"
    }
}
