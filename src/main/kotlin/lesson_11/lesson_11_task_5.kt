package lesson_11

/*Реализовать класс работы форума (Forum), использующий созданные классы пользователей из 1 и 2 задачи.

Примени паттерн “Фабрика”:

 – напрямую объекты не создаются. Пользователи добавляются на форум методом newUser() класса Forum;
 – сообщения добавляются на форум методом newMessage(authorId: Int, ...) класса Forum;
 – id-шники новых объектов, а также подстановка авторов для сообщений реализована внутри класса Forum;
 – у класса Forum реализуй метод printThread(),
 печатающий в консоль последовательно сообщения добавленные ранее в формате:
автор: сообщение
автор: сообщение

В функции main() создай экземпляр Forum и продемонстрируй его работу,
добавив двух пользователей и по два сообщения от каждого пользователя.*/

fun main() {

}

class Forum115 {

    private var lastUserId: Int = 0
    private val users: MutableList<User115> = mutableListOf()
    private val messages: MutableList<Message115> = mutableListOf()

    fun newUser115(login: String, password: String, email: String, bio: String = ""): User115 {
        val newUser = User115(login, password, email, bio, generateUserId())
        users.add(newUser)
        return newUser
    }

    private fun generateUserId(): Int = lastUserId++

    fun newMessage115() {

    }

    fun printThread115() {

    }
}

class Message115 {

}

class User115(
    private var login: String,
    private var password: String,
    private var email: String,
    private var bio: String = "",
    private val id: Int,

    ) {

    fun getInformationOfUser115() {
        println(
            """
            Информация о пользователе:
            Login: $login
            Password: $password
            Email: $email
            Bio: $bio
        """.trimIndent()
        )
    }

    fun sendMessage115(text: String) = println("Отправили сообщение пользователю $login: $text")

    fun setBio115() {
        println("Расскажите немного о себе:")
        bio = readln()
    }

    fun changePassword115() {
        println("Введите текущий пароль:")
        val oldPassword = readln()
        if (password == oldPassword) {
            println("Введите новый пароль:")
            password = readln()
            println("Пароль изменен, ваш новый пароль $password")
        } else println("старый пароль введён некорректно")
    }

    override fun toString() = "User(login='$login', password='$password', email='$email', bio='$bio')"
}