package lesson_8
/*Скопируй предыдущее задание.
Нужно изменить код, чтобы проверить, есть ли ингредиент в рецепте,
но не используя циклы для поиска.*/
fun main() {
    val recipeIngredientsOfPancake = arrayOf("milk", "flour", "egg", "salt", "sugar", "butter")
    println("Какой ингредиент вы хотите найти?")
    val ingredientAsked = readln()

    if (recipeIngredientsOfPancake.contains(ingredientAsked)) {
        println("Ингредиент $ingredientAsked в рецепте есть")
    } else println("Такого ингредиента в рецепте нет")
}