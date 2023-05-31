package lesson_13

/*Номер телефона хранится в формате Long.
Для получения номера от пользователя программа считывает ввод пользователя как строку и затем приводит её к типу Long.
Если пользователь вводит вместо цифр буквы, программа падает.
В консоли выводится сообщение об ошибке (необходимо воспроизвести ошибку).

Пример кода:
    val number: Long
    val strNumber = readLine().toString()
    number = strNumber.toLong()

Задача – вместо ошибки сообщать пользователю, что номер может содержать только  цифры.
Нельзя использовать операторы ветвления и элвис оператор.*/
fun main() {
    var number: Long? = null
    do {
        println("Введите номер телефона:")
        try {
            val strNumber = readLine().toString()
            number = strNumber.toLong()
            println(number)
        } catch (e: NumberFormatException) {
            println("Можно использовать только цифры")
        }
    } while (number == null)
}