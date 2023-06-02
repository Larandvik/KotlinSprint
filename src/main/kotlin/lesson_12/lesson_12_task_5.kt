package lesson_12
/*Продолжи усовершенствовать программу,
теперь она должна рассчитывать средние значения температур и давления, и считать количество дождливых дней.
Представь, что данные ты получаешь от датчиков и сымитируй их поведение с помощью random.

 – в функции main() создай список и добавь в него с помощью цикла 10 объектов класса,
 передав в конструкторы случайные значения;
 – для расчета среднего значения температуры создай переменные;
 – пройдись циклом по элементам созданного списка и вычисли средние значения температур,
 а также количество дождливых дней
 –  выведи результаты в консоль.
 На выходе должны получиться средние значения по температуре днем,
 ночью и по среднему атмосферному давлению.*/
val temperature = (5..30)
val isRainy = listOf(true, false)
val atmospheric = (733..738)
const val counterDays = 10

fun main() {
    var sumTemperatureDay: Double = 0.0
    var sumTemperatureNight: Double = 0.0
    var sumAtmospheric: Double = 0.0
    var counterRainyDays: Int = 0

    val days10 = mutableListOf<WeatherTracker4>()
    for (day in 0 until counterDays) {
        days10.add(WeatherTracker4(temperature.random(), temperature.random(), isRainy.random(), atmospheric.random()))
        sumTemperatureDay += days10[day].temperatureDay
        sumTemperatureNight += days10[day].temperatureNight
        sumAtmospheric += days10[day].atmosphericPressure
        if (days10[day].isRainy) counterRainyDays++
    }
    println("""
        средняя температура днём: ${sumTemperatureDay / counterDays}
        средняя температура ночью: ${sumTemperatureNight / counterDays}
        среднее атмосферное давление: ${sumAtmospheric / counterDays}
        количество дождливых дней: $counterRainyDays
        количество солнечных дней: ${counterDays - counterRainyDays}
    """.trimIndent())

}

class WeatherTracker4 (
    val temperatureDay: Int,
    val temperatureNight: Int,
    val isRainy: Boolean = false,
    val atmosphericPressure: Int,
) {
    init {
        printWeather4()
    }

    fun printWeather4() {
        println("""
            погода днём: $temperatureDay
            погода ночью: $temperatureNight
            вероятность дождя: $isRainy
            атмосферное давление: $atmosphericPressure
            
        """.trimIndent())
    }
}