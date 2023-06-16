package lesson_20

/*Программируем робота. Робот умеет говорить и работать с модификаторами речи. Речь реализуется методом say().
Модификатор устанавливается функцией setModifier(), принимающий лямбду.
Робот произносит одну из случайных 5 фраз (придумай фразы самостоятельно).
Реализуй модификатор, инвертирующий слова робота.*/

fun main() {
    val robot = Robot()
    println(robot.say())

    println(setModifier(robot.say(), robot.reverseModifier))
}

fun setModifier(string: String, preModifier: (String) -> String): String = preModifier(string)

class Robot(
    val phrases: List<String> = listOf(
        "первая фраза",
        "вторая фраза",
        "третья фраза",
        "четвертая фраза",
        "пятая фраза"
    ),
) {
    val reverseModifier: (String) -> String = { s: String -> s.reversed() }

    fun say(): String = phrases.random()
}
