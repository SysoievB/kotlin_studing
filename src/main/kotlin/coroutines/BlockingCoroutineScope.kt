package coroutines

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/**
 * Функция runBlocking блокирует вызывающий поток, пока все корутины внутри вызова
 * runBlocking { ... } не завершат свое выполнение. В этом собственно основное
 * отличие runBlocking от coroutineScope: coroutineScope не блокирует вызывающий
 * поток, а просто приостанавливает выполнение, освобождания поток для использования
 * другими ресурсами.*/

fun main() = runBlocking {
    launch {
        for (i in 0..5) {
            delay(400L)
            println(i)
        }
    }
    println("Hello Coroutines")
}