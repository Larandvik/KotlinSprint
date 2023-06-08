package lesson_11
/*Создай сущность Contact на основании скриншота из телефонной книги и определи поля и методы для экрана.
Для свойств, описывающих иконки, использовать строки с релевантными названиями файлов.
В блоке с контактами в нижней части скриншота – прикрепленные контакты близких людей.
После проектирования создай объект класса Contact с данными из скриншота.*/

fun main() {
    val mother = FavoriteContact("мама")

    val contact: Contact = Contact(
        "First Name",
        "Second Name",
        "8 (999) 999-42-42",
        "8 (999) 888-42-42",
        iCloud = "mail@mail.ru",
        mother,
    )
}

class Contact(

    private val name: String = "Name",
    private val secondName: String = "Surname",
    private val cellularPhone: String,
    private val homePhone: String,
    private val iCloud: String,
    private val favoriteContacts: FavoriteContact,
    private val photo: String = "photo",

    ) {
    fun runFaceTimeCall() {
        println("аудиозвонок по FaceTime")
    }

    fun runFaceTimeVideoCall() {
        println("видеозвонок по FaceTime")
    }

    fun sendMessage(text: String) {
        println("отправляем cмс $text, на номер $cellularPhone")
    }

    fun runCall() {
        println("аудиозвонок на номер $cellularPhone")
    }

    fun runVideoCall() {
        println("видеозвонок по номеру $cellularPhone")
    }

    fun sendEmail() {
        println("Открываем экран для отправки email по адресу $iCloud")
    }
}

class FavoriteContact(val name: String)