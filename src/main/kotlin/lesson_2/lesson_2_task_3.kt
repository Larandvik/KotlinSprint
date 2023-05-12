package lesson_2
/* Задача 3 к Уроку 2

Сайт с расписанием поездов получает данные с сервера. Сервер посылает время выезда и время в пути,
а время прибытия вычисляется из них.
Сервер прислал данные, что поезд выехал в 9:39 и будет в пути 457 минут.

 – Создай целочисленные переменные и проинициализируй их этими данными;
 – Напиши программу, которая обработает данные и подсчитает час и минуту прибытия поезда;
 – Выведи результат в консоль.
*/
fun main() {
    val departureTimeHour = 9
    val departureTimeMinute = 39
    val travelTime = 457

    var arrivalTimeHour: Int = departureTimeHour + travelTime / 60
    var arrivalTimeMinute: Int = departureTimeMinute + travelTime % 60

    if (arrivalTimeMinute >= 60) {
        val timeValue = arrivalTimeMinute / 60
        arrivalTimeMinute %= 60
        arrivalTimeHour += timeValue
    }

    if (arrivalTimeHour >= 24) {
        arrivalTimeHour -= 24
    }

    println(String.format("%02d:%02d", arrivalTimeHour, arrivalTimeMinute))

}
