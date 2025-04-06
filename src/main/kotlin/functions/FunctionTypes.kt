package functions

fun main() {
    hello()
    helloUnit()
    ordinaryParams("Vasia", 25)
    notNecessaryParams("Petia")
    // we can change order of params
    notNecessaryParams(age = 21, name = "Petia")
    println(sum(1, 5))
}

fun hello() {
    println("hello")
}

//Тип Unit -> the same as void
fun helloUnit(): Unit {
    println("hello unit")
}

fun ordinaryParams(name: String, age: Int) {
    println("Name: $name   Age: $age")
}

fun notNecessaryParams(name: String, age: Int = 18, position: String = "unemployed") {
    println("Name: $name   Age: $age  Position: $position")
}

fun double(n: Int) {
    //n = n * 2   // !Ошибка - значение параметра нельзя изменить
    println("Значение в функции double: $n")
}

fun sum(a: Int, b: Int): Int {
    return a + b
}
