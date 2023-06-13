package lesson_15
/*Программа, управляющая погодной станцией, должна отправлять сообщения на сервер.
Напиши абстрактный класс базового сообщения с возможностью подключиться к серверу и отправить данные.
Итого будет два метода и одно поле абстрактного класса.
Затем создай подклассы сообщений о температуре и количестве осадков.
Протестируй работу программы.*/

fun main() {
    val SendMessageTemp = SendMessageTemp("температура воздуха 22 градуса")
    SendMessageTemp.connectToServer()
    SendMessageTemp.sendMessage()
    println()

    val SendMessageRainfall = SendMessageRainfall("осадков не будет")
    SendMessageRainfall.connectToServer()
    SendMessageRainfall.sendMessage()
}

class SendMessageRainfall(text: String) : PreparationMessageRainfall(text)

class SendMessageTemp(text: String) : PreparationMessageTemp(text)

abstract class PreparationMessageRainfall(text: String) : SendMessage(text)

abstract class PreparationMessageTemp(text: String) : SendMessage(text)

abstract class SendMessage(val text: String) {

    fun connectToServer() {
        println("Подключиться к серверу")
    }

    fun sendMessage() {
        println(text)
    }
}
