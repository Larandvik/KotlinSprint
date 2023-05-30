package lesson_13
/*Скопируй класс из предыдущей задачи с новым уникальным названием.
Для того, чтобы взаимодействовать со всеми записями телефонной книги, как с одним целым, их нужно объединить в список.

Создай пустой список, добавь в него несколько объектов класса-контакта,
инициализируя их с разнообразными данными (в том числе и null).

Напиши функцию, которая будет выводить имя, номер телефона и компанию.
Если какого-либо значения нет – программа должна заменить его на строку [не указано].
С помощью этой функции выведи в консоль все объекты из списка.*/
fun main() {
    val listOfContact3 = mutableListOf<Contact3>()
    val contact1 = Contact3("Nikita", 8_925_000_00_09, null)
    val contact2 = Contact3("Ростислав", 89123456789, "Reddit")

    listOfContact3.add(contact1)
    listOfContact3.add(contact2)
    printContacts(listOfContact3)
}

fun printContacts(list: List<Contact3>) {
    for (contact in list) {
        println(contact)
    }
}

class Contact3(_name: String, _phone: Long, _company: String?) {

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