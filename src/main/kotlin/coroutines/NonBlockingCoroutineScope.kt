package coroutines

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

suspend fun main() {
    doWork()

    println("Hello Coroutines")
}

suspend fun doWork(): CoroutineScope = coroutineScope {
    launch {
        for (i in 0..5) {
            println(i)
            delay(400L)
        }
    } as CoroutineScope
    launch {
        for (i in 6..10) {
            delay(400L)
            println(i)
        }
    } as CoroutineScope
}