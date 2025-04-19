package oop

fun main() {
    //?: — Elvis operator (null-coalescing)
    //If name is not null → use name
    //If name is null → use "Guest"
    val name: String? = null
    val displayName = name ?: "Guest"
    println(displayName)

    //?. — Safe call operator
    //Safely calls user.name.length
    //If any value in the chain is null, the whole expression returns null — no crash
    val user: User? = null
    val length = user?.name?.length

    //!! — Not-null assertion operator
    //Forces the compiler to treat a nullable variable as non-null
    //If it's actually null → throws NullPointerException
    val name1: String? = null
    val length1 = name!!.length  // Throws NullPointerException if name is null

}
private class User(val name: String)