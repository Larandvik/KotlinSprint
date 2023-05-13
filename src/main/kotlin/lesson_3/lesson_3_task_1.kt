package lesson_3
/*При входе в приложение высвечивается приветствие.
Представим, что мы пишем функцию, которая будет выводить приветствие с именем пользователя на экран
(в нашем случае в консоль). Tекст приветствия может меняться в зависимости от времени суток.
(Так, например, выводится приветствие при входе в приложение Сбербанка).

Приветствие и имя пользователя должны храниться в отдельных переменных.
Вывести в консоль два приветствия (для дня и для вечера),
перезаписывая данные в одну исходную переменную.
*/
fun main() {

    val userName: String
    val isDay: Boolean = true

    println(greetings(true, "Андрей"))
    println(greetings(false, "Мария"))
}

fun greetings(isDay: Boolean, userName: String): String {
    var greetings: String = ""
    when {
        isDay ->  greetings = "Добрый день, $userName"
        !isDay -> greetings = "Добрый вечер, $userName"
    }
    return greetings
}