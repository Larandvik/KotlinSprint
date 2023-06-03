package lesson_16
/*Создай класс, описывающий пользователя.
У него должен быть логин и пароль. Пароль не должен быть виден в теле главной функции,
но должен быть способ проверить, что пароль введен верно. Выведи информацию о релевантности пароля в консоль.*/
fun main() {
    val user = User("admin", "1234")
    println(user.checkPassword("1235"))
}

class User(
    private val login: String,
    private val password: String,
) {
    fun checkPassword(pass: String): Boolean = password == pass
}