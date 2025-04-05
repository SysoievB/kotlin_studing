package basics

class Variables {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            var age: Int = 23
            println("var = " + age)
            val age1: Int = 32
            println("val = " + age1)
        }
    }
}