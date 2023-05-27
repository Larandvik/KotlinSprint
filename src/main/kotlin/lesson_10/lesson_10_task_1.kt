package lesson_10

/*Напиши небольшую игру, в которой пользователь и компьютер по очереди бросают кости.
Побеждает выбросивший наибольшее число.

 – поочередно выводи сообщение о ходе игрока и компьютера (отображать кто бросил, какие значения на кубиках);
 – бросок костей вынеси в отдельную функцию, в которой генерируются 2 случайных числа от 1 до 6;
 – в отдельные переменные сохрани результат работы функции для игрока и компьютера;
 – после сравнения результатов, выведи соответствующее сообщение в консоль. Например: "Победило человечество" или "Победила машина".*/
fun main() {
    println("Комьютер бросает кости")
    val throwComputer = getListRollDiceMove()
    println("компьютер выбросил: $throwComputer")

    do {
        println("Ваша очередь бросать кости (нажмите enter)")
        val gamerMove = readln()
    } while (gamerMove.isNotEmpty())
    val throwUser = getListRollDiceMove()
    println("игрок выбросил: $throwUser")

    val computerSum = throwComputer.sum()
    val userSum = throwUser.sum()

    println("""
        комьютер выбросил: $computerSum
        игрок выбросил: $userSum
        ${getAWinner(computerSum, userSum)}
    """.trimIndent()
    )
}

fun getAWinner(computer: Int, user: Int) = if (computer > user) "Победила машина" else "Победило человечество"

fun getListRollDiceMove(): List<Int> {
    val rollDice = mutableListOf<Int>()
    for (i in 0 until COUNT_OF_DICE) {
        rollDice.add(varRollDice.random())
    }
    return rollDice
}

const val COUNT_OF_DICE = 2
val varRollDice = (0..6)