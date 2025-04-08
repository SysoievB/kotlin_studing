package oop

import oop.package2.send
import oop.package2.Message as EmailMessage

fun main() {
    val myMessage = EmailMessage("Hello Kotlin")

    send(myMessage, "tom@gmail.com")
}