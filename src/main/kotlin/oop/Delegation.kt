package oop

fun main() {
    val logger = AppLogger(ConsoleLogger())
    logger.log("Hello from Kotlin delegation!")
}

interface Logger {
    fun log(message: String)
}

class ConsoleLogger : Logger {
    override fun log(message: String) {
        println("Console: $message")
    }
}

// Delegating Logger implementation to ConsoleLogger
class AppLogger(logger: Logger) : Logger by logger
