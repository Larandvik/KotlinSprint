package lesson_20

/*Программируем робота. Робот умеет говорить и работать с модификаторами речи. Речь реализуется методом say().
Модификатор устанавливается функцией setModifier(), принимающий лямбду.
Робот произносит одну из случайных 5 фраз (придумай фразы самостоятельно).
Реализуй модификатор, инвертирующий слова робота.*/

fun main() {
    val robot = Robot()
    robot.say()

    robot.setModifier { phrase: String -> phrase.reversed() }
    robot.say()
}

class Robot(
    val phrases: List<String> = listOf(
        "первая фраза",
        "вторая фраза",
        "третья фраза",
        "четвертая фраза",
        "пятая фраза"
    ),
) {
    fun setModifier(modifier: (String) -> String) {
        this.modifier = modifier
    }

    private var modifier: (String) -> String = { it }

    fun say() {
        println(modifier(phrases.random()))
    }
}
