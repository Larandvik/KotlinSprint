package lesson_4
/* Программа тренировок разбивает упражнения на несколько групп: упражнения для мышц рук, ног, спины и пресса.
Она рекомендует делать упражнения на каждую группу мышц через день. Пользователь начал занятия с рук и пресса.
Напиши программу, которая будет сообщать, какие упражнения нужно выполнить сегодня.

Предположим, что сегодня 5 день тренировок. В первый день выполнялись упражнения для рук и пресса.
Выведи сообщение для пятого дня в виде нескольких красивых ровных строк.

Вывод должен быть таким:
Упражнения для рук:       true
Упражнения для ног:       false
Упражнения для спины:  false
Упражнения для пресса: true

 – Все сообщение должно печататься в одном println();
 – При изменении значения переменной дня тренировки на 1 день вперед, вывод должен меняться.
 */
fun main() {
    var dayCounter: Int = 5
    getProgramGym(dayCounter)
    dayCounter++
    getProgramGym(dayCounter)
}

fun isEvenDay(dayCounter: Int): Boolean = dayCounter % 2 == 0

fun getProgramGym(dayCounter: Int) {
    val isArmExercises = isEvenDay(dayCounter).not()
    val isLegExercises = isEvenDay(dayCounter)
    val isBackExercises = isEvenDay(dayCounter)
    val isAbsExercises = isEvenDay(dayCounter).not()

    println("""
        Упражнения для рук:    $isArmExercises
        Упражнения для ног:    $isLegExercises
        Упражнения для спины:  $isBackExercises
        Упражнения для пресса: $isAbsExercises
        
    """.trimIndent())
}



