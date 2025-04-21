package collections

fun main() {
    val users = listOf(
        User(1, "Alice"),
        User(2, "Bob"),
        User(3, "Carol")
    )

    users.groupBy { user -> user.name}
        .entries
        .forEach { println("${it.key} -> ${it.value}") }
}

class User(val id: Int, val name: String) {
    override fun toString(): String {
        return "User(id=$id, name='$name')"
    }
}