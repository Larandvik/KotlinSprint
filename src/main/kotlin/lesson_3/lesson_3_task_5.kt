package lesson_3
/*Продолжаем работать над приложением “Шахматы”. Напиши программу для сервера, которая примет строку,
отправленную игроком (считаем эти данные уже известными и объявляем строку с данными: “D2-D4;0”.

Необходимо будет сделать обратное. Распарсить строку – разбить ее на 3 составляющих: откуда, куда и номер хода,
присвоить соответствующим переменным и распечатать по отдельности.
*/
fun main() {

    var valueFrom: String = "E2"
    var valueTo: String = "E4"
    var moveCount: Int = 0

    println(getChessMove1(valueFrom, valueTo, ++moveCount))

    valueFrom = "D2"
    valueTo = "D4"

    parseServer(getChessMove1(valueFrom, valueTo, ++moveCount))

}

fun getChessMove1(from: String, to: String, moveCount: Int) = "[$from-$to;$moveCount]"

fun parseServer(move: String) {

    val regex = Regex("([A-Z].+)-([A-Z].+);(.*)]")
    val matchResult = regex.find(move)
    if (matchResult != null) {
        val (valueFrom, valueTo, moveCount) = matchResult.destructured
        println("""
            $valueFrom
            $valueTo
            $moveCount
        """.trimIndent())
    }
}
