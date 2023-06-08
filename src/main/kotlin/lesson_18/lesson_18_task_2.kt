package lesson_18

/*В игре используются игральные кости с разным количеством граней: 4, 6 и 8.
Опиши их, используя полиморфизм, создав несколько классов.
У каждой кости должен быть метод, печатающий в консоль выпавшее число.*/

fun main() {
    val dice1: Dice182 = FourSidedDice182()
    val dice2: Dice182 = SixSidedDice182()
    val dice3: Dice182 = EightSidedDice182()

    dice1.rollDice()
    dice2.rollDice()
    dice3.rollDice()
}

open class Dice182 {

    open val randomDice = 0

    open fun rollDice() {
        println("Выпало число: $randomDice")
    }
}

class FourSidedDice182() : Dice182() {
    override val randomDice: Int
        get() = (1..4).random()
}

class SixSidedDice182() : Dice182() {
    override val randomDice: Int
        get() = (1..6).random()
}

class EightSidedDice182() : Dice182() {
    override val randomDice: Int
        get() = (1..8).random()
}
