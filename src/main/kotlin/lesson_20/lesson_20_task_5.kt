package lesson_20

/*Программируем робота. Робот умеет говорить и работать с модификаторами речи. Речь реализуется методом say().
Модификатор устанавливается функцией setModifier(), принимающий лямбду.
Робот произносит одну из случайных 5 фраз (придумай фразы самостоятельно).
Реализуй модификатор, инвертирующий слова робота.*/

fun main() {
    val robot = Robot()

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
    fun setModifier(preModifier: (String) -> String): (String) -> String  =

    var preModifier: (String) -> String = { it }

    fun say() {
        println(phrases.random())
    }
}
