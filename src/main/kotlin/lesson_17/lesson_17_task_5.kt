package lesson_17

/*Написать класс, описывающий пользователя.
У него есть логин и пароль. При попытке изменить пароль в консоль должно выводиться «Вы не можете изменить пароль».
При попытке прочитать его – вместо букв должны отображаться звездочки (по количеству символов пароля).
При изменении логина в консоли должно печататься сообщение об успешной смене логина.
Создай пользователя с произвольными данными и протестируй изменение логина и пароля.
Вся реализация должна быть на сеттерах и геттерах.*/
fun main() {
    val user = User175("Batman", "asdf")
    user.login = "Robin"
    println(user.login)

    user.password = "asdfasdf"
    println(user.password)
}

class User175(
    login: String,
    password: String,
) {

    var password: String = password
        set(value) {
            println("Вы не можете изменить пароль")
        }
        get() = "*".repeat(field.length)

    var login: String = login
        set(value) {
            println("Логин успешно изменён")
            field = value
        }
}