package lesson_5

/*Нужно написать часть модуля для авторизации пользователя.
Для входа в приложение пользователь должен доказать, что он не бот.
Для этого программа предлагает решить простой математический пример –
сложить два числа (сообщить об этом пользователю).

Имитируй эти действия в консоли, путем считывания данных с клавиатуры.
При успешном решении вход в программу символизируется сообщением “Добро пожаловать!".
В противном случае вывести сообщение "Доступ запрещен."*/
fun main() {

    val firstRandomValue = random(1, 10)
    val secondRandomValue = random(1, 10)

    println("Для входа решите задачу: $firstRandomValue + $secondRandomValue = ?")
    val answer = readln().toInt()

    if (answer == firstRandomValue + secondRandomValue) println("Добро пожаловать!")
    else println("Доступ запрещен.")
}

fun random(start: Int, end: Int): Int {
    return (start until end).random()
}