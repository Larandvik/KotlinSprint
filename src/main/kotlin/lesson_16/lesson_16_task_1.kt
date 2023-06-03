package lesson_16
/*На игральном кубике может выпасть одно число от единицы до шести.
Создай класс кубика, в котором будет одно поле со случайным числом.
Единственный способ узнать это число – вызвать специальный метод, который напечатает число в консоль.
Затем создай экземпляр кубика и вызови метод.*/
fun main() {
    val dice = Dice161()
    dice.throwRollDice161()
}

class Dice161 {

    private fun setRandomRollDice161(): Int = (1..6).random()

    fun throwRollDice161() {
        println(setRandomRollDice161())
    }
}