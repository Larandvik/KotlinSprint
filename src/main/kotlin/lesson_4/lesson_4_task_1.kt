package lesson_4

/*На сайте ресторана есть онлайн бронирование. Бронирование доступно, когда есть свободные столики.
Всего в ресторане 13 столов и их количество всегда неизменно. На сегодня забронированы все столики.
А на завтра осталось еще 4 свободных.

Напиши программу, которая сообщает информацию о бронировании в момент запроса,
путем сравнения данных о свободных столах с данными о столах в ресторане.

 – Создать переменные с количеством забронированных столов на сегодня и на завтра;
 – Вывести в консоль сообщение о доступности столиков в одном println();
 – Каждое сообщение с новой строки (НЕ использовать многострочный вывод (“”” “””));
 – Формат сообщений такой: [Доступность столиков на сегодня: true/false], [Доступность столиков на завтра: true/false].*/
fun main() {
    val countOfTablesReservedToday = 13
    val countOfTablesReservedTomorrow = 9

    println("[Доступность столиков на сегодня: ${isFreeTables(countOfTablesReservedToday)}]" +
            "\n[Доступность столиков на завтра: ${isFreeTables(countOfTablesReservedTomorrow)}]")
}

fun isFreeTables(countOfTablesReserved: Int): Boolean {
    return countOfTablesReserved < CountAllTables.COUNT_ALL_TABLES
}

class CountAllTables {
    companion object {
        const val  COUNT_ALL_TABLES: Int = 13
    }
}
