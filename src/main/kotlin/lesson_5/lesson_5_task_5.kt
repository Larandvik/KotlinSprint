package lesson_5

import kotlin.random.Random

/*Для алгоритма улучшенного приложения-лотереи, нужно угадать два числа от 1 до 100.
Если угадать только одно – игрок получает утешительный приз.

Напиши программу, проверяющую выигрыш. Пользователь должен вводить числа в консоль.
Выйгрышные числа должны меняться при каждом запуске
(то есть не должны быть проинициализированы заранее, как в задаче 3).

Точно также надо оформить ввод чисел подсказками, в конце распечатать выйгрышные числа.
*/
fun main() {

    val value1 = Random.nextInt(1,101)
    val value2 = Random.nextInt(1,101)

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