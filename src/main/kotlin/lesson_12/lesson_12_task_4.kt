package lesson_12

/*Измени программу таким образом, чтобы информация о погоде выводилась в консоль сразу при создании объекта.*/
fun main() {
    val weatherToday = WeatherTracker3(21, 9, false, 733)
    val weatherTomorrow = WeatherTracker3(25, 10, true, 738)
}

class WeatherTracker3(
    val temperatureDay: Int,
    val temperatureNight: Int,
    val isRainy: Boolean = false,
    val atmosphericPressure: Int,
) {
    init {
        printWeather2()
    }

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