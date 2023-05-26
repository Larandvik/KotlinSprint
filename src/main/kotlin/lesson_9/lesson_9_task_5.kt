package lesson_9
/*Напиши программу, которая запрашивает у пользователя пять названий ингредиентов (каждый по отдельности).

 – результат должен исключать повторы;
 – список должен выводиться в алфавитном порядке;
 – все элементы списка выведены в одну строку, разделяя слова запятыми;
 – первое слово должно быть напечатано с заглавной буквы, в конце списка должна стоять точка.*/
fun main() {

    println("Введите 5 названий ингредиентов (каждый по отдельности):")
    val ingredients = mutableListOf<String>()

    while (ingredients.size < 5) {
        val ingredient = readln()
        if (!ingredients.contains(ingredient))
        ingredients.add(ingredient)
    }

    ingredients.sort()
    ingredients[0] = ingredients[0].replaceFirstChar { it.uppercaseChar() }
    val resultForPrint = ingredients.joinToString(", ", postfix = "." )

    println(resultForPrint)
}