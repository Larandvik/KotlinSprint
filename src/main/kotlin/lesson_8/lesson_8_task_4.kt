package lesson_8
/*Представим, что мы получили массив ингредиентов.
Программа должна распечатать весь список ингредиентов,
затем заменить нужный ингредиент на новый по желанию пользователя.
После этого программа должна показать обновленный список.

 – создай массив со списком ингредиентов и напечатай его в консоль;
 – запроси у пользователя информацию об ингредиенте, который он хочет заменить;
 – если пользователь ввел ингредиент, которого нет в списке, вывести соответствующее сообщение;
 – если есть, запроси ингредиент, который пользователь хотел бы добавить;
 – выведи обновленный список с сообщением: “Готово! Вы сохранили следующий список: [список_ингредиентов]”.*/
fun main() {

    val recipeIngredientsOfPancake = arrayOf("milk", "flour", "egg", "salt", "sugar", "butter")
    for (ingredient in recipeIngredientsOfPancake) println(ingredient)

    println("Какой ингредиент хотите заменить?")
    val ingredientAsked = readln()
    if (recipeIngredientsOfPancake.contains(ingredientAsked)) {
        println("На какой ингредиент хотите поменять?")
    } else println("Такого ингредиента в рецепте нет")

    val newIngredient = readln()
    val indexIngredient = recipeIngredientsOfPancake.indexOf(ingredientAsked)
    recipeIngredientsOfPancake[indexIngredient] = newIngredient

    for (ingredient in recipeIngredientsOfPancake) println(ingredient)
}