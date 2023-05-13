package lesson_3

import lesson_3.MoveCount.Companion.moveCount

/*В приложении шахматы, ходы отправляются на сервер в виде строки формата [откуда-куда;номер хода].
Игрок начал партию ходом из E2 в E4. Все данные (откуда, куда, номер хода)
инициализировать и хранить в отдельных переменных.

 – Напиши код, который сформирует строку для отправки, а затем выведет ее в консоль.
 Нужно "собрать" единую строку из объявленных переменных и сохранить в новую переменную (или сразу распечатывать).
 – Далее этим переменным нужно присвоить новые данные и вывести в консоль следующий ход.
 Определить, какое значение будет в переменной "куда" для фигуры, стоящей на D2 и
 продвинувшейся на одну клетку вперед.
 */
fun main() {

    var valueFrom: String = "E2"
    var valueTo: String = "E4"

    println(getChessMove(valueFrom, valueTo))

    valueFrom = "D2"
    valueTo = "D4"

    println(getChessMove(valueFrom, valueTo))
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