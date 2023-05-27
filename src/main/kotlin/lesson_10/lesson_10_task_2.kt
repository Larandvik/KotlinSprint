package lesson_10
/*Для регистрации в приложении пользователь придумывает логин и пароль.
И пароль, и логин должны содержать в себе хотя бы 4 символа.
Если всё верно, программа выводит приветственное сообщение.

 – логин и пароль должны считываться с консоли;
 – проверку длины логина или пароля вынеси в отдельную функцию, которая валидирует длину пароля;
 – если пароль меньше 4 символов – вывести сообщение: "Логин или пароль недостаточно длинные".*/
fun main() {
    var userLogin: String
    var userPassword: String
    do {
        println("\nПридумайте логин (не менее 4 символов):")
        userLogin = readLine().orEmpty()
        println("Придумайте пароль (не менее 4 символов):")
        userPassword = readLine().orEmpty()
        if (!validateLength(userLogin) && !validateLength(userPassword)) {
            println("Логин или пароль недостаточно длинные")
        }
    } while (!validateLength(userLogin) && !validateLength(userPassword))
    println("$userLogin, регистрация прошла успешно")
}

fun validateLength(logOrPass: String) = logOrPass.length >= MIN_LOG_AND_PASS

const val MIN_LOG_AND_PASS = 4
