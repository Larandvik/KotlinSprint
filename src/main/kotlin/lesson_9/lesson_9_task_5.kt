package lesson_9
/*Напиши программу, которая запрашивает у пользователя пять названий ингредиентов (каждый по отдельности).

 – результат должен исключать повторы;
 – список должен выводиться в алфавитном порядке;
 – все элементы списка выведены в одну строку, разделяя слова запятыми;
 – первое слово должно быть напечатано с заглавной буквы, в конце списка должна стоять точка.*/
fun main() {

    println("Введите 5 названий ингредиентов (каждый по отдельности):")
    val ingredients = mutableSetOf<String>()

    for (i in 0..4) {
        ingredients.add(readln())
    }
    val listIngredients = ingredients.toMutableList()
    listIngredients.sort()
    listIngredients[0] = listIngredients[0].replaceFirstChar { it.uppercaseChar() }

    val resultForPrint = listIngredients.joinToString(", ", postfix = "." )
    println(resultForPrint)
}