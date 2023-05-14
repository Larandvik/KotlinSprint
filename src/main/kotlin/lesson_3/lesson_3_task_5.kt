package lesson_3

import lesson_3.MoveCount.Companion.moveCount
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

    println(getChessMove(valueFrom, valueTo))

    // игрок делает ход
    valueFrom = "D2"
    valueTo = "D4"

    // сервер получил ход игрока
    val movePlayer = getChessMove(valueFrom, valueTo)
    unparseChessMove(movePlayer)
}

// используем регулярное выражение, чтобы перехватить 10 ход и тд
fun unparseChessMove(move: String) {
    val regex = """([A-H][1-8])-([A-H][1-8]);(\d+)"""
    val pattern: Pattern = Pattern.compile(regex)
    val matcher: Matcher = pattern.matcher(move)

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

fun getChessMove(from: String, to: String): String {
    moveCount++
    return "[$from-$to;$moveCount]"
}

class MoveCount {
    companion object {
        var moveCount: Int = 0
    }
}

