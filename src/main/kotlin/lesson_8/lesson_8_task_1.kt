package lesson_8
/*Скрипт считает количество просмотров рекламы за день.
Напиши программу, которая сохраняет в массив данные просмотров за неделю (числа использовать на свое усмотрение).
Каждая ячейка хранит количество просмотров за день.
Имея массив с данными, нужно посчитать сколько всего было просмотров за неделю.
Результат вычислений выведи в консоль.*/
fun main() {
    val weeklyViews = arrayOf(5, 2, 8, 1, 8, 3, 6)
    var totalViews = 0

    for (views in weeklyViews) {
        totalViews += views
    }

    println("Всего было просмотров за неделю: $totalViews")
}
