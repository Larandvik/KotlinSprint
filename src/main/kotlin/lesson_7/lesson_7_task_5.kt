package lesson_7
/*Создай программу, которая генерирует более сложные пароли.

 – пароль должен содержать цифры, строчные и заглавные буквы;
 – цифры и буквы должны располагаться в случайном порядке;
 – длина пароля должна задаваться пользователем.*/
fun main() {

    val optionsPass = ('1'..'9') + ('a'..'z') + ('A'..'Z')

    println("Какой длины создать пароль?")
    val userValueForPass = readln().toInt()
    var userPassword = ""

    for (i in 0 until userValueForPass) userPassword += optionsPass.random()
    print(userPassword)
}