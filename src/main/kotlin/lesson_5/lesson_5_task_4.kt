package lesson_5
/*Для входа в приложение нужно ввести логин и пароль.
Предположим, что у нас есть зарегистрированный пользователь с логином Batman и паролем password.

Сначала нужно предложить пользователю ввести логин. Программа должна в первую очередь проверить,
зарегистрирован ли пользователь. Если нет – предложить зарегистрироваться и все.

Если пользователь уже зарегистрирован – проверить пароль.
При успешной авторизации вывести приветственное сообщение, иначе вывести сообщение об ошибке авторизации.*/
fun main() {

    val userName = "Batman"
    val userPass = "password"

    logInApp(userName, userPass)
}

fun logInApp(userName: String, userPass: String) {
    println("Введите логин:")
    val name = readln()
    if (userName != name) return println("вам нужно зарегистрироваться")

    println("Введите пароль:")
    val pass = readln()
    if (userName == name && userPass == pass) println("Добро пожаловать $name")
    else println("Неверный логин или пароль")
}