package basics

fun main() {
    val byteMax: Byte = Byte.MAX_VALUE
    val byteMin: Byte = Byte.MIN_VALUE

    val shortMax: Short = Short.MAX_VALUE
    val shortMin: Short = Short.MIN_VALUE

    val intMax: Int = Int.MAX_VALUE
    val intMin: Int = Int.MIN_VALUE

    val longMax: Long = Long.MAX_VALUE
    val longMin: Long = Long.MIN_VALUE

    println(byteMin)
    println(byteMax)

    println(shortMin)
    println(shortMax)

    println(intMin)
    println(intMax)

    println(longMin)
    println(longMax)

    println("<-------------Целочисленных типы без знака-------------->")

    val byteUMax: UByte = UByte.MAX_VALUE
    val byteUMin: UByte = UByte.MIN_VALUE

    val shortUMax: UShort = UShort.MAX_VALUE
    val shortUMin: UShort = UShort.MIN_VALUE

    val intUMax: UInt = UInt.MAX_VALUE
    val intUMin: UInt = UInt.MIN_VALUE

    val longUMax: ULong = ULong.MAX_VALUE
    val longUMin: ULong = ULong.MIN_VALUE

    println(byteUMin)
    println(byteUMax)

    println(shortUMin)
    println(shortUMax)

    println(intUMin)
    println(intUMax)

    println(longUMin)
    println(longUMax)

    println("<-------------Числа с плавающей точкой-------------->")

    val floatMax: Float = Float.MAX_VALUE
    val floatMin: Float = Float.MIN_VALUE

    val doubleMax: Double = Double.MAX_VALUE
    val doubleMin: Double = Double.MIN_VALUE

    println(floatMin)
    println(floatMax)

    println(doubleMin)
    println(doubleMax)

    println("<-------------Strings-------------->")

    val text: String = "SALT II was a series of talks between United States \n and Soviet negotiators from 1972 to 1979"

    val stringTemplate: String = """
                        SALT II was a series of talks between United States
                        and Soviet negotiators from 1972 to 1979.
                        It was a continuation of the SALT I talks.
    """

    val firstName = "Tom"
    val lastName = "Smith"
    val welcome = "Hello, $firstName $lastName"

    println(text)
    println("<------------------------------->")
    println(stringTemplate)
    println("<------------------------------->")
    println(welcome)

    println("<---------------Any---------------->")

    var name: Any = "Tom"
    println(name)

    name = 12345L
    println(name)

    var age: Long = 123L
    println(age)

    var ageInt: Int = age.toInt()
    println(ageInt)
}