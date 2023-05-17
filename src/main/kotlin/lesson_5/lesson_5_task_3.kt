package lesson_5
/*Для алгоритма простого приложения-лотереи, нужно угадать два числа от 1 до 100.
Если угадать только одно – игрок получает утешительный приз. Напиши программу, проверяющую выигрыш.

Пользователь должен вводить числа в консоль. Правильные числа заранее известны и хранятся в переменных.
Оформить ввод текстовыми подсказками о том, что нужно вводить.
Вывести отдельным сообщением, какие числа были нужны для победы.

 – Если оба числа угаданы вывести “Поздравляем! Вы выиграли главный приз!”
 – Если угадано только одно число, вывести “Вы выиграли утешительный приз!”
 – Если не угадано ничего, вывести “Неудача! Крутите барабан!”
 */
fun main() {

    val value1 = 33
    val value2 = 66

    println("""
        Вам нужно угадать 2 числа от 1 до 100
        Введите первое число
    """.trimIndent())
    val userValue1 = readln().toInt()
    println("Введите второе число")
    val userVAlue2 = readln().toInt()
    println("Мы загадали числа $value1 и $value2")

    val resultText = if ((value1 == userValue1 && value2 == userVAlue2)
                      || (value1 == userVAlue2 && value2 == userValue1))
        "Поздравляем! Вы выиграли главный приз!"
    else if ((value1 == userValue1 || value2 == userVAlue2) || (value1 == userVAlue2 || value2 == userValue1))
        "Вы выиграли утешительный приз!"
    else "Неудача! Крутите барабан!"

    println(resultText)
}