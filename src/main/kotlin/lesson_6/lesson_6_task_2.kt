package lesson_6
/*Создай простой таймер, который запрашивает у пользователя количество секунд, которые нужно засечь.
По истечении заданного времени, выведется сообщение в консоли: “Прошло N секунд”.
Где N – количество секунд, введенных пользователем.*/
fun main() {
    println("Введите количество секунд, которую нужно засечь:")
    val userSecondsTimer = readln().toInt()
    runTimer(userSecondsTimer)
}

fun runTimer(userTimer: Int) {
    Thread.sleep((1000 * userTimer).toLong())
    println("Прошло $userTimer секунд")
}
