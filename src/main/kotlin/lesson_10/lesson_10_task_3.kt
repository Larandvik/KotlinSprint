package lesson_10
/*Напиши программу, которая генерирует пароли.
Пароль должен состоять из чередующихся цифр и специальных символов. Например, #5%6”2.

 – пользователь сам задает длину пароля;
 – для генерации пароля должна быть отдельная функция,
   принимающая целочисленное значение длины пароля и возвращающая готовый пароль;
 – пароль должен содержать цифры от 0 до 9,
   специальные символы: !"#$%&'()*+,-./
   и пробел (всего 16 спецсимволов).*/
fun main() {
    println("Какой длины сделать пароль?")
    val userPassLength = readln().toInt()
    println("Ваш новый пароль: ${generatePassword(userPassLength)}")
}

fun generatePassword(userPassLength: Int): StringBuilder {
    val password = StringBuilder()
    val symbols = (' '..'/')
    val numbers = (0 .. 9)

    for (i in 0 until  userPassLength) {
        if (i % 2 == 0) {
            password.append(symbols.random())
        } else password.append(numbers.random())
    }
    return password
}
