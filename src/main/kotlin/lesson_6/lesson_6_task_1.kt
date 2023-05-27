package lesson_6
/*Представим, что на этапе авторизации в приложение, пользователь выбрал сначала зарегистрироваться.
Нужно создать блок программы, который сначала предлагает создать логин и пароль, затем запрашивает их,
чтобы войти в приложение.

Если пароль введен неверно, выводится соответствующее сообщение и данные запрашиваются заново.
Если пароль введен правильно, выводится сообщение – “Авторизация прошла успешно”.*/
fun main() {
    println("Придумайте логин: ")
    val userLogin = readln()
    println("Придумайте пароль: ")
    val userPass = readln()
    var valueLogin: String
    var valuePass: String

    do {
        println("Введите логин:")
        valueLogin = readln()
        println("Введите пароль:")
        valuePass = readln()
        if (userLogin != valueLogin || userPass != valuePass) println("Неверный логин или пароль")
    } while (userLogin != valueLogin || userPass != valuePass)

    println("Авторизация прошла успешно")
}
