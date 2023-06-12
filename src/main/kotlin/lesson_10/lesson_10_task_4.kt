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
    } while (continueGame())
    println("Вы выиграли $counterWinGame партий")
}

fun continueGame(): Boolean {
    var userAnswer: String
    do {
        println("Хотите бросить кости еще раз? Введите Да или Не")
        userAnswer = readln().lowercase()
    } while (userAnswer != "да" && userAnswer != "нет")
    return userAnswer == "да"
}

fun runGame() {
    println("Комьютер бросает кости")
    val throwComputer = getRollDiceMove()
    println("компьютер выбросил: $throwComputer")

    println("Ваша очередь бросать кости")
    val throwUser = getRollDiceMove()
    println("игрок выбросил: $throwUser")

    val computerSum = throwComputer.sum()
    val userSum = throwUser.sum()

    println(
        """
        комьютер выбросил: $computerSum
        игрок выбросил: $userSum
        ${getAWinner191(computerSum, userSum)}
    """.trimIndent()
    )
}

fun getAWinner191(computer: Int, user: Int): String =
    if (user > computer) {
        counterWinGame++
        "Победило человечество"
    } else if (user == computer) "Ничья"
    else "Победила машина"

fun getRollDiceMove(): List<Int> {
    val rollDice = mutableListOf<Int>()
    for (i in 0 until COUNT_ROLLDICE) {
        rollDice.add(varRollDice191.random())
    }
    return rollDice
}

const val COUNT_ROLLDICE = 2
val varRollDice191 = (0..6)
var counterWinGame = 0
