package lesson_11
/*Возьми класс User из первой задачи. Добавь к классу новое необязательное свойство bio и несколько методов.
Нам нужно иметь возможность посмотреть информацию о пользователе, заполнить описание профиля,
изменить пароль и отправить письмо на почту.

 – 1 метод должен выводить информацию о пользователе в консоль;
 – 2 метод должен считывать с консоли информацию о пользователе и сохранять в поле bio;
 – 3 метод изменения пароля сначала должен запросить текущий пароль, и, если он введен верно, запросить новый,
 изменить его и сообщить, что пароль изменен;
 – 4 метод будет принимать строку с текстом,
 который мы хотим “отправить” пользователю – метод должен печатать сообщение в консоль.

Далее создай объект, заполни информацию “о себе” (методом чтения с консоли) и измени пароль.
Затем, проверь изменения и отправь сообщения на почту (в качестве обращения использовать логин),
вызывая соответствующие методы.*/
class User2 (
    private var id: Int = 0,
    private var login: String,
    private var password: String,
    private var email: String,
    private var bio: String = "",
) {
    fun getInformationOfUser() {
        println("""
            Информация о пользователе:
            ID: $id
            Login: $login
            Password: $password
            Email: $email
            Bio: $bio
        """.trimIndent())
    }
    fun sendMessage(text: String) = println("Отправили сообщение пользователю $login: $text")

    fun setBio() {
        println("Расскажите немного о себе:")
        bio = readln()
    }

    fun changePassword() {
        println("Введите текущий пароль:")
        val oldPassword = readln()
        if (password == oldPassword) {
            println("Введите новый пароль:")
            password = readln()
            println("Пароль изменен, ваш новый пароль $password")
        } else println("старый пароль введён некорректно")
    }

    override fun toString() = "User(id=$id, login='$login', password='$password', email='$email', bio='$bio')"
}

fun main() {
    val user1 = User2(1, "batman", "qwerty123", "batman@gmail.com")
    user1.setBio()
    user1.changePassword()
    user1.getInformationOfUser()
    user1.sendMessage("Привет Бет, нужна твоя помощь!")
}