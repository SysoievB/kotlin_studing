package coroutines

import kotlinx.coroutines.*
import kotlinx.coroutines.channels.*

suspend fun main() = coroutineScope {

    val users = getUsers()
    users.consumeEach { user -> println(user) }
    println("End")
}

fun CoroutineScope.getUsers(): ReceiveChannel<String> = produce {
    val users = listOf("Tom", "Bob", "Sam")
    for (user in users) {
        send(user)
    }
}