package lesson_11
/*Создай класс, который будет хранить данные пользователя.
В свойствах должна храниться информация об уникальном идентификаторе, логине, пароле и почте.
Названием может быть, например, User.
Создай два экземпляра класса с произвольными данными и выведи их в консоль.*/

class User11 (
    private val id: Int,
    private val login: String,
    private val password: String,
    private val email: String,
) {
    override fun toString() = "User(id=$id, login='$login', password='$password', email='$email')"
}

fun main() {
    val user1 = User11(1, "batman", "qwerty123", "qwerty@gmail.com")
    val user2 = User11(2, "robin", "qwerty321", "robin@gmail.com")

    println(user1)
    println(user2)
}