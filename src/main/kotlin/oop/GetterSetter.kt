package oop

//var имя_свойства[: тип_свойства] [= инициализатор_свойства]
//    [getter]
//    [setter]

fun main() {
    val getterSetterWithHideGETSET = GetterSetterWithHideGETSET("Vasia", 18, 170)
    getterSetterWithHideGETSET.name //this is getter
    getterSetterWithHideGETSET.name = "Petya"//this is setter

    val getterSetterFullClass = GetterSetterFullClass("Vasia", 18, 170)
    getterSetterFullClass.name
    getterSetterFullClass.name = "Petya"
    getterSetterFullClass.height
    //getterSetterFullClass.height = "ksjdf" //not compile
}

//when you declare properties in the primary constructor like this class above GetterSetterWithHideGETSET
//Kotlin automatically provides default getters and setters for var properties and only a getter for val.
class GetterSetterWithHideGETSET(var name: String, var age: Int, val height: Int)

//the same as
class GetterSetterWithHideGETSETFullClass(
    private var _name: String,
    private var _age: Int,
    private val _height: Int
) {
    var name: String
        get() = _name
        set(value) { _name = value }

    var age: Int
        get() = _age
        set(value) { _age = value }

    val height: Int
        get() = _height
}

class GetterSetterFullClass(name: String, age: Int, height: Int) {

    var name: String = name
        get() = field
        set(value) {
            field = value
        }

    var age: Int = age
        get() = field
        set(value) {
            field = value
        }

    val height: Int = height
        get() = field
}
