package lesson_13
/*Используй класс из первой задачи.
На его основе создай экземпляр. Вместо поля с названием компании пропиши null при инициализации объекта.

Дополни класс методом, который будет печатать информацию о контакте сообщением такого типа (пример):

Имя: Ростислав
Номер: 89123456789
Компания: Reddit

В одном println() и без использования многострочного ввода.
Вместо null значения, в консоль должна выводиться строка [не указано].*/

fun main() {
    val contact1 = Contact2("Nikita", 8_925_000_00_09, null)
    val contact2 = Contact2("Ростислав", 89123456789, "Reddit")
    println(contact1)
    println(contact2)
}

class Contact2(_name: String, _phone: Long, _company: String?) {

    private val name = _name
    private val phone = _phone
    private val company = _company ?: "не указано"


    override fun toString(): String {
        return """
            Имя: $name
            Номер: $phone
            Компания: $company
            
        """.trimIndent()
    }
}

