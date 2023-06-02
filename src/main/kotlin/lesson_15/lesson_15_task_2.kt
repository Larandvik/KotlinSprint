package lesson_15
/*Программа, управляющая погодной станцией, должна отправлять сообщения на сервер.
Напиши абстрактный класс базового сообщения с возможностью подключиться к серверу и отправить данные.
Итого будет два метода и одно поле абстрактного класса.
Затем создай подклассы сообщений о температуре и количестве осадков.
Протестируй работу программы.*/

fun main() {
    val messageTemp = SendMessageTemp("температура воздуха 22 градуса")
    messageTemp.connectToServer()
    messageTemp.sendMessage()
    println()

    val messageRainfall = SendMessageRainfall("осадков не будет")
    messageRainfall.connectToServer()
    messageRainfall.sendMessage()
}

class SendMessageRainfall(text: String) : SendMessage(text) {

    init {
        println("Подготовить сообщение об осадках")
    }
}

class SendMessageTemp(text: String) : SendMessage(text) {

    init {
        println("Подготовить сообщение о температуре")
    }
}

abstract class SendMessage(val text: String) {

    fun connectToServer() { println("Подключиться к серверу") }

    fun sendMessage() { println(text) }
}
