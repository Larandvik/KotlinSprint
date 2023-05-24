package lesson_8
/*Напиши программу, которая должна создавать массив из определенного количества ингредиентов,
которые будет вводить пользователь. Элементы вводятся по одному.
Перед вводом элементов сначала запрашивается количество планируемых ингредиентов.*/
fun main() {

    println("Сколько будет ингредиентов?")
    val countIngredients = readln().toInt()
    val ingredientsOfReceipt = arrayOfNulls<String>(countIngredients)
    var counter = 0


    while (counter < ingredientsOfReceipt.size) {
        println("Введите ингредиент  №${counter + 1}:")
        ingredientsOfReceipt[counter] = readln()
        counter++
    }
    println("Ингредиенты для вашего рецепта:")
    for (ingredient in ingredientsOfReceipt) print("$ingredient ")
}