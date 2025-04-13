package generics

fun main() {
    val email1 = EmailMessage1("Hello METANIT.COM")
    val outlook = Messenger<EmailMessage1>()
    outlook.send(email1)

    val skype = Messenger<SmsMessage1>()
    val sms1 = SmsMessage1("Привет, ты спишь?")
    skype.send(sms1)
}

private class Messenger<T>() where T : Message1, T : Logger {
    fun send(mes: T) {
        mes.log()
    }
}

private interface Message1 {
    val text: String
}

private interface Logger {
    fun log()
}

private class EmailMessage1(override val text: String) : Message1, Logger {
    override fun log() = println("Email: $text")
}

private class SmsMessage1(override val text: String) : Message1, Logger {
    override fun log() = println("SMS: $text")
}