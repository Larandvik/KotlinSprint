package lesson_7
/*Создай программу, которая генерирует шестизначные пароли.
Пусть пароль будет состоять из чередующихся цифр и строчных букв латинского алфавита (без специальных символов).
Например, k5p6m2.

 – для каждого символа необходимо создать отдельную переменную;
 – вывести сгенерированный пароль в консоль;
 – подсказка: использовать метод, который может генерировать рандомное число из заданного диапазона.*/
fun main() {
    val firstSign = ('a'..'z').random()
    val secondSign = (1..9).random()
    val thirdSign = ('a'..'z').random()
    val fourthSign = (1..9).random()
    val fifthSign = ('a'..'z').random()
    val sixthSing = (1..9).random()

    println("$firstSign$secondSign$thirdSign$fourthSign$fifthSign$sixthSing")
}