package lesson_20

/*В разрабатываемом приложении мы реализуем список элементов. Изначально он представлен списком строк.
При помощи map преобразуй его в список лямбд, каждая из которых печатает в консоль: “Нажат элемент [название_элемента]”.

“Нажми” каждый четный элемент списка.*/

fun main() {
    val listElement: List<String> = mutableListOf("ноль", "один", "два", "три", "четыре", "пять", "шесть")

    val mappedList: List<() -> Unit> = listElement.map { element ->
        { println("Нажат элемент $element") }
    }

    for (i in mappedList.indices) {
        if(i % 2 == 0) mappedList[i]()
    }
}