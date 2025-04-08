package oop.package2

class Message(val text: String)

fun send(message: Message, address: String) {
    println("Message `${message.text}` has been sent to $address")
}