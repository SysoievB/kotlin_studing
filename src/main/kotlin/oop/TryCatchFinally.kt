package oop

fun main() {
    //try-catch-finally
    try {
        val n1 = 2
        val n2 = 0
        val result = n1 / n2
        println(result)
    } catch (e: Exception) {
        println(e.message)
        for (line in e.stackTrace) {
            println("at $line")
        }
    } finally {
        println("Program has been finished")
    }

    //try-catch
    try {
        val nums = arrayOf(1, 2, 3, 4)
        println(nums[6])
    } catch (e: ArrayIndexOutOfBoundsException) {
        println("Out of bound of array")
    } catch (e: Exception) {
        println(e.message)
    }

    checkAge(5)
    checkAge(-115)
}

fun checkAge(age: Int): Int {
    if (age < 1 || age > 110) {
        throw Exception("Invalid value $age. Age must be greater than 0 and less than 110")
    }

    println("Age $age is valid")
    return age
}