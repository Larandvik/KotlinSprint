package lesson_10
/*Собери в одно целое регистрацию пользователя, проверку логина (минимум 4 символа),
генерацию пароля для него и авторизацию по коду из смс – программа должна “высылать” код из четырех цифр
(случайное число от 1000 до 9999). Пользователь будет вводить этот код. Если код введён неверно, программа вышлет новый.

Алгоритм действий:
1. Регистрация
 – пользователь придумывает логин (длина должна быть более 4 символов);
 – программа генерирует пароль и отображает его пользователю;

2. Авторизация
 – программа предлагает авторизоваться, пользователь вводит логин и пароль;
 – если данные неверны, отображается ошибка и логин и пароль запрашиваются заново;
 – если данные верны, “высылается” сгенерированный код из 4 цифр и запрашивается у пользователя;
 – если код неверен – высылается новый, если верен – появляется сообщение об успешной авторизации.

Действия в программе должны быть распределены по соответствующим методам без дублирования кода.*/
fun main() {
    var userLogin: String

    do {
        println("Придумайте логин (не менее $MIN_COUNT_LOG символов):")
        userLogin = readln()
        if (!isValidateLength(userLogin)) println("Login должен быть не менее 5 символов")
    } while (!isValidateLength(userLogin))

    val userPass: String = getNewPassword()
    runAuthorization(userLogin, userPass)
}

fun runAuthorization(userLogin: String, userPass: String) {
    println("Для авторизации необходим логин и пароль")

    do {
        println("Введите логин:")
        val valueLogin = readln()
        println("Введите пароль:")
        val valuePass = readln()
        if (userLogin != valueLogin || userPass != valuePass) println("Неверный логин или пароль")
    } while (userLogin != valueLogin || userPass != valuePass)

    do {
        val authorizationCode = getAuthorizationCode()
        println("Ваш код для авторизации $authorizationCode \nВведите код для авторизации:")
        val userAuthorizationCode = readln().toInt()
        if (userAuthorizationCode != authorizationCode) println("Вы ввели неверный код")
    } while (userAuthorizationCode != authorizationCode)

    println("Поздравляем, вы успешно авторизовались!")
}

fun getNewPassword(): String {
    val listOptionsPass = ('1'..'9') + ('a'..'z') + ('A'..'Z')
    var userPassword = ""
    for (i in 0 until LENGTH_PASSWORD) userPassword += listOptionsPass.random()
    println("Ваш пароль : $userPassword")
    return userPassword
}

fun isValidateLength(logOrPass: String) = logOrPass.length >= MIN_COUNT_LOG

fun getAuthorizationCode(): Int = (1000..9999).random()

const val MIN_COUNT_LOG = 5
const val LENGTH_PASSWORD = 6