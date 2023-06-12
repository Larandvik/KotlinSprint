package lesson_18

/*CRM (система управления взаимоотношениями с клиентами) обрабатывает заказы в интернет-магазине.
Заказ содержит информацию: номер заказа и товары.
Если товар один, он хранится в виде строки, если несколько – в виде списка строк.

По запросу нужно печатать в консоль сообщение
«Заказан товар: [название_товара]» или
«Заказаны следующие товары: [название_товара], … [название_товара]».
Создай 2 объекта заказа и вызови у них метод вывода информации и заказе. Реши задачу, используя полиморфизм.*/
fun main() {
    val singleOrder: Order181 = SingleOrder181(1, "носки")
    singleOrder.printOrderInfo()

    val multipleOrder: Order181 = MultipleOrder181(2, listOf("носки", "майка", "футболка"))
    multipleOrder.printOrderInfo()
}

abstract class Order181 {
    open fun printOrderInfo() {
        println()
    }
}

class SingleOrder181(
    numberOrder: Int,
    item: String,
) : Order181() {

    private val item = item

    override fun printOrderInfo() {
        println("Заказан товар: $item")
    }
}

class MultipleOrder181(
    numberOrder: Int,
    items: List<String>,
) : Order181() {

    private val items = items

    override fun printOrderInfo() {
        println("Заказаны следующие товары: $items")
    }
}