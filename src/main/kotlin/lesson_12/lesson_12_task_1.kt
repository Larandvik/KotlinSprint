package lesson_12

/*Создай класс для программы, отслеживающей погоду.
Объекты класса будут хранить температуру днем и ночью, был ли дождь, атмосферное давление.
В этом задании нужно использовать пустой конструктор.

Создай два объекта, присвой им произвольные данные и выведи в консоль одним методом созданного класса.
 – в классе создай переменные и проинициализируй их какими-нибудь значениями;
 – затем в объектах подставь другие значения этим переменным.*/
fun main() {
    val weatherToday = WeatherTracker()
    weatherToday.temperatureDay = 21
    weatherToday.temperatureNight = 9
    weatherToday.isRainy = false
    weatherToday.atmosphericPressure = 733

    val weatherTomorrow = WeatherTracker()
    weatherTomorrow.temperatureDay = 25
    weatherTomorrow.temperatureNight = 10
    weatherTomorrow.isRainy = true
    weatherTomorrow.atmosphericPressure = 738

    weatherToday.printWeather()
    weatherTomorrow.printWeather()
}

class WeatherTracker() {

    var temperatureDay: Int = 0
    var temperatureNight: Int = 0
    var isRainy: Boolean = false
    var atmosphericPressure: Int = 0

    fun printWeather() {
        println("""
            погода днём: $temperatureDay
            погода ночью: $temperatureNight
            вероятность дождя: $isRainy
            атмосферное давление: $atmosphericPressure
        """.trimIndent())
    }
}
