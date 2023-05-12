package lesson_3

import java.util.regex.Matcher
import java.util.regex.Pattern

/*Продолжаем работать над приложением “Шахматы”. Напиши программу для сервера, которая примет строку,
отправленную игроком (считаем эти данные уже известными и объявляем строку с данными: “D2-D4;0”.

Необходимо будет сделать обратное. Распарсить строку – разбить ее на 3 составляющих: откуда, куда и номер хода,
присвоить соответствующим переменным и распечатать по отдельности.
*/
fun main() {

    var valueFrom: String = "E2"
    var valueTo: String = "E4"
    var moveCount: Int = 0

    fun chessMove(from: String, to: String): String {
        moveCount++
        return "[$valueFrom-$valueTo;$moveCount]"
    }

    println(chessMove(valueFrom, valueTo))

    // игрок делает ход
    valueFrom = "D2"
    valueTo = "D4"

    // сервер получил ход игрока
    val movePlayerServer = chessMove(valueFrom, valueTo)

    // используем регулярное выражение, единственная идея чтобы перехватить 10 ход и тд
    val regex = """([A-H][1-8])-([A-H][1-8]);(\d+)"""
    val pattern: Pattern = Pattern.compile(regex)
    val matcher: Matcher = pattern.matcher(movePlayerServer)

    if (matcher.find()) {
        val valueFromServer = matcher.group(1)
        val valueToServer = matcher.group(2)
        val moveCountServer = matcher.group(3)

        println(valueFromServer)
        println(valueToServer)
        println(moveCountServer)
    } else {
        println("так ходить нельзя")
    }
}
