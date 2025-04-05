package basics

fun main() {
    //when
    val isEnabled = true
    when(isEnabled){
        false -> println("isEnabled off")
        true -> println("isEnabled on")
    }

    //when-else
    val a = 30
    when(a){
        10 -> println("a = 10")
        20 -> println("a = 20")
        else -> println("неопределенное значение")
    }

    val b = 10
    when(b){
        in 10..19 -> println("a в диапазоне от 10 до 19")
        in 20..29 -> println("a в диапазоне от 20 до 29")
        !in 10..20 -> println("a вне диапазона от 10 до 20")
        else -> println("неопределенное значение")
    }

    //when-return
    val day = 2
    var dayOfweek = when (day) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        else -> "Unknown"
    }
    println(dayOfweek)      // Tuesday
}