package lesson_13
/*Для программы телефонного справочника создай класс,
который будет хранить имя, номер телефона и поле company.
Номер телефона – целочисленное значение.
Нужно учесть ситуацию, что поле с компанией может оставаться незаполненным.
Поля не должны иметь никакой инициализации по умолчанию.*/
fun main() {
    val contact1 = Contact("nikita", 8_925_000_00_09)
    println(contact1)
}

class Contact(val name: String, val phone: Long, val company: String? = null) {

    override fun toString(): String {
        return "Contact(name='$name', phone=$phone, company=$company)"
    }
}