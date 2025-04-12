package oop

fun main() {
    val day: Day = Day.FRIDAY
    println(day)            // FRIDAY
    println(Day.MONDAY)     // MONDAY
    println(Day.WEDNESDAY.ordinal)//2
    println(Day.WEDNESDAY.name)//WEDNESDAY

    val dayTime: DayTime = DayTime.DAY
    println(dayTime.value)        // 1
    println(DayTime.AFTERNOON.value) // 2

    println(Operation.ADD.apply(2,4))//6
    println(Operation.MULTIPLY.apply(2,4))//8
}

enum class Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

enum class DayTime(val value: Int) {
    DAY(1), AFTERNOON(2), NIGHT(3), MIDNIGHT(4)
}

enum class Operation {
    ADD {
        override fun apply(a: Int, b: Int): Int = a + b
    },
    SUBTRACT {
        override fun apply(a: Int, b: Int): Int = a - b
    },
    MULTIPLY {
        override fun apply(a: Int, b: Int): Int = a * b
    },
    DIVIDE {
        override fun apply(a: Int, b: Int): Int = a / b
    };

    abstract fun apply(a: Int, b: Int): Int
}
