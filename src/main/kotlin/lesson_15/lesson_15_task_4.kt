package lesson_15
/*На сайте музыкального магазина есть товары двух категорий: инструменты и комплектующие к ним.
Для инструментов есть возможность найти соответствующие комплектующие.
У всех товаров есть название и количество единиц на складе.
Напиши классы для категорий товаров. В качестве поиска – отобрази сообщение «Выполняется поиск».
Метод поиска реализуй через интерфейс.*/
fun main() {
    val guitar = MusicInstrument("Fender", 5)
    val strings = MusicPart("Струны", 100)
    guitar.searchPart()
}

abstract class Goods(
    val name: String,
    val quantity: Int,
)

class MusicInstrument(name: String, quantity: Int) : Goods(name, quantity), SearchAble {

    init {
        println("добавили в базу гитары")
    }

    override fun searchPart() {
        println("Выполняется поиск")
    }
}

class MusicPart(name: String, quantity: Int) : Goods(name, quantity) {

    init {
        println("добавили в базу струны")
    }
}

interface SearchAble {
    fun searchPart()
}