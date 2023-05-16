package lesson_4

/*В агрокомплексе установлена автоматизированная система анализа выращивания растений.
Напиши программу, которая информирует сотрудников о благоприятных условиях для конкретного вида культур.
Для роста бобовых существует ряд условий, а именно: солнечная погода, раскрытый тент,
влажность 20% и время года не зима.

Напиши условие и выведи его результат сообщением такого вида в консоль:
“Благоприятные ли условия сейчас для роста бобовых? true/false”

Данные для сегодняшнего дня (объяви и проинициализируй исходные переменные):
 – солнечная погода;
 – тент раскрыт;
 – влажность 20;
 – время года зима.
 */
fun main() {

    val isSunny = true
    val isAwningOpen = true
    val humidity = 20
    val isWinter = true

    println(
        "Благоприятные ли условия сейчас для роста бобовых? " +
                "${conditionsFavorable(isSunny, isAwningOpen, humidity, isWinter)}"
    )
}

fun conditionsFavorable(isSunny: Boolean, isAwningOpen: Boolean, humidity: Int, isWinter: Boolean): Boolean {
    return isSunny && isAwningOpen && humidity == 20 && !isWinter
}
