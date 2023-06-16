package lesson_19

/*В интернет-магазине товары делятся на несколько категорий: одежда, канцелярские товары и разное.
 – создай enum класс с категориями;
 – создай метод, который примет тип категории и вернет текстовое название категории для пользователя;
 – создай класс, описывающий товар (с полями название, id, категория),
 в классе должен быть метод, который выводит инфо о товаре. Вызови его для нескольких созданных товаров;
 – для вывода информации о товаре, для категории используй метод определения категории.*/

fun main() {
    val product1 = Product("носки", 1, Categories.CLOTHES)

    println(product1)
}

class Product(
    private val name: String,
    private val id: Int,
    private val category: Categories,
) {

    override fun toString(): String {
        return """
            id товара: $id
            наименование: $name
            категория: ${category.categoryName}
        """.trimIndent()
    }
}

enum class Categories(val categoryName: String) {
    CLOTHES("одежда"),
    STATIONERY("канцелярские товары"),
    MISCELLANEOUS("разное"),
}
