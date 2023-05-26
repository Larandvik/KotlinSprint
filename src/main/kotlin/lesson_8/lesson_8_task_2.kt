package lesson_8
/*Представь, что ты работаешь над приложением с рецептами.
Напиши код, который проверяет, есть ли нужный ингредиент в рецепте.

 – создай массив, в котором будет храниться список ингредиентов для определенного блюда;
 – далее через консоль запроси у пользователя информацию об ингредиенте, который он хочет найти;
 – произведи поиск элемента по массиву, используя цикл for;
 – если ингредиент в списке есть, выведи в консоль сообщение - “Ингредиент     [название] в рецепте есть”;
 – если нет, сообщать: “Такого ингредиента в рецепте нет”.*/
fun main() {
    val recipeIngredientsOfPancake = arrayOf("milk", "flour", "egg", "salt", "sugar", "butter")
    println("Какой ингредиент вы хотите найти?")
    val ingredientAsked = readln()

    for (ingredient in recipeIngredientsOfPancake) {
        if (ingredient == ingredientAsked) {
            println("Ингредиент $ingredient в рецепте есть")
            return
        }
    }
    println("Такого ингредиента в рецепте нет")
}