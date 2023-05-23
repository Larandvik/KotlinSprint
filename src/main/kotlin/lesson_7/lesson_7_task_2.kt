package lesson_7
/*Создай программу, имитирующую авторизацию по коду из смс.
Программа будет “высылать” код из четырех цифр (случайное число от 1000 до 9999).
Выведи его в консоль с текстом “Ваш код авторизации: N”. Далее программа запрашивает ввод кода, чтобы авторизоваться.

Если код введён неверно – программа вышлет новый (отобразит в консоли)
и снова будет запрашивать его ввод для попытки авторизации.
Если код введен верно – программа отображает приветствие и завершает работу.*/
fun main() {

    do {
        val smsCode = (1000 until 10000).random()
        println("""
            Ваш код авторизации: $smsCode
            Введите код:
        """.trimIndent())
        val userPass = readln().toInt()
    } while (userPass != smsCode)
    println("Добро пожаловать")
}
