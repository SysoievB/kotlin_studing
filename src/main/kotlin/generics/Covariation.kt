package generics

//Вид	                 Ключевое слово	     Описание
//Инвариантность	     —	                 Нет подстановки типов
//Ковариантность	     out	             Только чтение (Producer)
//Контравариантность	 in	                 Только запись (Consumer)

fun main() {
    val numbers: List<out Number> = listOf(1, 2, 3) // reading only
    val ints: MutableList<in Int> = mutableListOf<Number>() // writing only

    //the same for Java
    //List<? extends Number> numbers = new ArrayList<Integer>(); // for reading
    //List<? super Integer> ints = new ArrayList<Number>();      // for writing
}