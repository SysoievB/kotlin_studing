package functions

fun main() {
    // the same code on kotlin
    val adder = makeAdder(10)
    println(adder(5)) // Output: 15
}

fun makeAdder(x: Int): (Int) -> Int {
    return { y -> x + y } // Closure: x is captured from outer scope
}

/*
//java code
 public static void main(String[] args) {
        Function<Integer, Integer> adder = makeAdder(10);
        System.out.println(adder.apply(5)); // Output: 15
    }

    public static Function<Integer, Integer> makeAdder(int x) {
        return (y) -> x + y; // Closure: x is captured from the outer scope
    }
*/