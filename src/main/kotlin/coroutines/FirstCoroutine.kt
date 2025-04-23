package coroutines

import kotlinx.coroutines.*

suspend fun main(): kotlin.Unit = coroutineScope {
    launch {
        for (i in 0..5) {
            delay(400L)
            println(i)
        }
    }

    println("Hello Coroutines")
}