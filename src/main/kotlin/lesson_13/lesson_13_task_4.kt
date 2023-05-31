package lesson_13
/*Допиши функцию, для программы, которая позволит пользователю добавлять записи в телефонную книгу.
Функция должна валидировать следующие случаи: пользователь ввел имя и номер,
пользователь не ввел имя или компанию (вместо пустой строки должен быть null),
пользователь не ввел номер телефона (такая запись не должна добавляться).

После добавления первой записи, пользователя спрашивают “Если хотите добавить новую запись, введите \“да\””.
В любом другом случае функция завершает работу.
Программа должна добавлять столько записей, сколько пользователю нужно,
а затем печатать все записи в консоли в компактном виде.*/
fun main() {
    val listOfContact4 = mutableListOf<Contact4>()
    do createContact(listOfContact4)
    while (isAddMoreContact())
    printContacts(listOfContact4)
}

fun isAddMoreContact(): Boolean {
    println("Желаете добавить ещё контакт?")
    return readlnOrNull()?.lowercase() == "да"
}

fun createContact(listOfContact4: MutableList<Contact4>) {
    println("Для новой записи введите имя:")
    val name = readlnOrNull()
    println("Введите номер телефон:")
    val phone = readlnOrNull()?.toLongOrNull()
    println("Введите компанию:")
    val company = readlnOrNull()

    if (phone == null) {
        println("Без телефона - запись невозможна")
        return
    }
    else {
        val newContact = Contact4(name, phone, company)
        listOfContact4.add(newContact)
    }
}

fun printContacts(list: List<Contact4>) {
    println("Телефонная книга содержит контакты:")
    for (contact in list) {
        println(contact)
    }
}

class Contact4(_name: String?, _phone: Long?, _company: String?) {

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