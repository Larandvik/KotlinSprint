package lesson_3
/*Девушка по имени Андреева Татьяна Сергеевна в 22 года вышла замуж за Сидорова, и поменяла фамилию.
О ней есть запись в одном из государственных приложений. Приложение отслеживает изменения персональных данных граждан.

Выведи в консоль данные на момент когда ей было 20 и на момент когда ей было 22 в формате [ФИО, возраст].
Все части ФИО и возраст изначально хранятся в отдельных переменных.*/
fun main() {

    var age: UByte = 20u
    val firstName: String = "Татьяна"
    var lastName: String = "Андреева"
    val patronymic: String = "Сергеевна"

    println("[$lastName $firstName $patronymic, $age]")

    age = 22u
    lastName = "Сидорова"

    println("[$lastName $firstName $patronymic, $age]")
}
