package coroutines

import kotlinx.coroutines.*

/**
 * async-корутина возвращает объект Deferred, который ожидает
 * получения результата корутины. (Интерфейс Deferred унаследован от интерфейса
 * Job, поэтому для также доступны весь функционал, определенный для интефейса Job)
 *
 * Для получения результата из объекта Deferred применяется функция await().*/

suspend fun main() = coroutineScope {

    val message: Deferred<String> = async { getMessage() }
    println("message: ${message.await()}")
    println("Program has finished")
}

suspend fun getMessage(): String {
    delay(500L)
    return "Hello"
}