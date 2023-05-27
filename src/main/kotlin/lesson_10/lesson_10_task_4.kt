package lesson_10
/*Усовершенствуй игру, где пользователь и компьютер по очереди бросают кости.
Побеждает выбросивший наибольшее число. Теперь дай возможность пользователю играть до тех пор пока ему не надоест.
В конце программа должна вывести сколько партий он выиграл.

 – логика бросков должна быть реализована по примеру из задачи 1;
 – после первого раунда программа задает вопрос: “Хотите бросить кости еще раз Введите Да или Нет”;
 – программа в зависимости от ответа запускает новый раунд
   или заканчивает игру с выводом количества выйгрышных партий человека;
 – в программе должно быть минимум 2 метода (для проведения раунда и для генерации значений брошенных кубиков).*/
fun main() {
    do {
        runGame()
    } while (answerUser == "да")
    if (answerUser == "нет") println("Вы выиграли $counterWinGame партий")
}

fun runGame() {
    println("Комьютер бросает кости")
    val throwComputer = getRollDiceMove()
    println("компьютер выбросил: $throwComputer")

    do {
        println("Ваша очередь бросать кости (нажмите enter)")
        val gamerMove = readln()
    } while (gamerMove != "")
    val throwUser = getRollDiceMove()
    println("игрок выбросил: $throwUser")

    val computerSum = throwComputer.sum()
    val userSum = throwUser.sum()

    println("""
        комьютер выбросил: $computerSum
        игрок выбросил: $userSum
        ${getAWinner(computerSum, userSum)}
        Хотите бросить кости еще раз? Введите Да или Нет
    """.trimIndent()
    )
    answerUser = readln()
}

fun getAWinner(computer: Int, user: Int): String {
    val result: String
    result = if (computer > user) "Победила машина"
    else {
        counterWinGame++
        "Победило человечество"
    }
    return result
}

fun getRollDiceMove(): List<Int> {
    val rollDice = mutableListOf<Int>()
    for (i in 0 until countRollDice) {
        rollDice.add(varRollDice.random())
    }
    return rollDice
}

const val countRollDice = 2
val varRollDice = (0..6)
var counterWinGame = 0
var answerUser: String = ""