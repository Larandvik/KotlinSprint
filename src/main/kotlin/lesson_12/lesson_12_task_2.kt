package lesson_12
/*Измени класс из прошлого задания
(скопируй в файл с новым уроком и новым названием класса для избежания конфликтов).
Используй первичный конструктор, затем так же создай 3 объекта и выведи информацию о них.
Поля должны быть объявлены и проинициализированы в теле класса.*/
fun main() {
    val weatherToday = WeatherTracker2(21,9,false,733)
    val weatherTomorrow = WeatherTracker2(25,10,true,738)

    weatherToday.printWeather2()
    weatherTomorrow.printWeather2()
}

class WeatherTracker2 (
    _temperatureDay: Int,
    _temperatureNight: Int,
    _isRainy: Boolean,
    _atmosphericPressure: Int,
) {
    var temperatureDay = _temperatureDay
    var temperatureNight = _temperatureNight
    var isRainy = _isRainy
    var atmosphericPressure = _atmosphericPressure

    fun printWeather2() {
        println("""
            погода днём: $temperatureDay
            погода ночью: $temperatureNight
            вероятность дождя: $isRainy
            атмосферное давление: $atmosphericPressure
        """.trimIndent())
    }
}