package lesson_16
/*Создать класс, описывающий заказ в интернет-магазине.
В заказе должны быть номер заказа и статус готовности.
Номер заказа должен быть недоступен для изменения.

Создай метод, который меняет статус заказа.
Поменять статус заказа можно только отправив заявку менеджеру.
Имитируй это действие отдельной функцией.
Она будет принимать новый статус и обращаться к внутреннему методу класса для изменения статуса.*/
fun main() {
    val order1 = Order(1, "В работе")
    println(order1)
    println()

    order1.closeStatusOrder()
    println(order1)
}

class Order(
    private val numberOrder: Int,
    private var statusOrder: String,
) {
    private fun setStatusOrder(newStatus: String) {
        statusOrder = newStatus
    }

    fun closeStatusOrder() {
        println("Запрос изменить статус заказа на \"испольнено\"")
        setStatusOrder("исполнено")
    }

    override fun toString(): String {
        return "Номер заказа: $numberOrder, статус заказа: $statusOrder"
    }
}