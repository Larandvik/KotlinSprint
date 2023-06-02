package lesson_15

/*На форуме есть два вида пользователей – обычные пользователи и администраторы.
Пользователи могут читать форум и писать сообщения.
Администраторы могут ещё и удалять сообщения и пользователей.
Напиши классы пользователей и администраторов, используя абстрактный класс.
У абстрактного класса должны быть соответствующие общие поля и методы.
Действия на форуме отобрази сообщениями в консоль.*/
fun main() {
    val user1 = User15("Andrei")
    user1.readForum()
    user1.writeMessage("пнх")

    val admin = Administrator("Zloy")
    admin.readForum()
    admin.removeMessage()
    admin.removeUser(user1)
}

abstract class Person(
    val name: String,
) {

    fun readForum() {
        println("$name читает форум")
    }

    fun writeMessage(message: String) {
        println("$name пишет сообщение: $message")
    }
}

class User15(name: String) : Person(name)

class Administrator(name: String) : Person(name) {

    fun removeUser(user: User15) {
        println("$name удаляет пользователя: ${user.name}")
    }

    fun removeMessage() {
        println("$name удаляет сообщение")
    }
}