package lesson_4

/*Исследовательский корабль может отправляться в длительное плавание при следующих условиях:
нет повреждений корпуса, команда в количестве от минимального (55 чел) до рекомендуемого (70 чел) НЕ включительно,
провизии больше 50 ящиков и благоприятные или неблагоприятные метеоусловия.

Или можно отправляться с незначительными повреждениями корпуса и с рекомендуемым количеством людей в команде (70 человек).
Погода при этом может только благоприятная. Условия для провизии такие же.

Напиши программу, позволяющую определить, может ли корабль отправляться.

1. Считай с консоли данные для расчета возможности корабля покинуть порт. Проинициализируй этими данными исходные переменные.
Данные запрашивать через консоль:
 – есть ли повреждения корпуса. Записывать Boolean переменную.
 – текущая численность экипажа
 – текущее количество ящиков провизии
 – благоприятные ли метеоусловия. Записывать Boolean переменную.

2. Используя полученные данные, создать единое условие и распечатать результат в консоль.
*/
fun main() {

    println("Есть ли повреждения корабля?(true/false)")
    val isDamage = readln().toBoolean()
    println("Текущая численность экипажа?")
    val countCrew = readln().toInt()
    println("Текущее количество ящиков провизии?")
    val amountOfProvisions = readln().toInt()
    println("Благоприятные ли метеоусловия?(true/false)")
    val isFlyingWeather = readln().toBoolean()

    isReadyShip(isDamage, countCrew, amountOfProvisions, isFlyingWeather)
}

fun isReadyShip(isDamage: Boolean, countCrew: Int, amountOfProvisions: Int, isFlyingWeather: Boolean) {
    if ((!isDamage && countCrew in MIN_COUNT_CREW until REC_COUNT_CREW
                && amountOfProvisions > MIN_PROVISIONS && isFlyingWeather)
        || (isDamage && countCrew == REC_COUNT_CREW && isFlyingWeather && amountOfProvisions > MIN_PROVISIONS))
        println("Корабль готов к отправлению")
        else println("Корабль не готов к отправлению")
}

const val MIN_PROVISIONS = 50
const val MIN_COUNT_CREW = 55
const val REC_COUNT_CREW = 70
