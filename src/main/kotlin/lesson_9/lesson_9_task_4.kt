package lesson_9
/*Напиши программу, которая один раз запрашивает у пользователя пять названий ингредиентов блюда в одной строке,
разделяя их запятыми. Результат распечатать в алфавитном порядке.

 – запроси у пользователя 5 ингредиентов, перечисленных через запятую и сохрани их в список с 5 отдельными элементами;
 – отсортируй полученный список по алфавиту и выведи его в консоль.*/
fun main() {
    println("Введите пять названий ингредиентов блюда в одной строке, разделяя их запятыми")
    val ingredients = (readln().split(",")).map { it.trim() }
    val sortedIngredients = ingredients.sorted()
    sortedIngredients.forEach { println(it) }
}


