package lesson_12

/*Усовершенствуй класс Day (создай в файле нового урока такой же класс с измененным названием).
Перепиши его, используя сокращенную запись (без полей внутри тела класса).
Переменной, хранящей информацию о дожде, установи значение по умолчанию.
Информацию о погоде по дням выведи в консоль отдельным методом класса.*/
fun main() {
    val weatherToday = WeatherTracker3(21, 9, false, 733)
    val weatherTomorrow = WeatherTracker3(25, 10, true, 738)

    weatherToday.printWeather2()
    weatherTomorrow.printWeather2()
}

class WeatherTracker3(
    val temperatureDay: Int,
    val temperatureNight: Int,
    val isRainy: Boolean = false,
    val atmosphericPressure: Int,
) {
    fun printWeather2() {
        println(
            """
            погода днём: $temperatureDay
            погода ночью: $temperatureNight
            вероятность дождя: $isRainy
            атмосферное давление: $atmosphericPressure
        """.trimIndent()
        )
    }
}