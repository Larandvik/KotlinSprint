package lesson_17
/*Нужно написать класс для корабля в мобильной игре.
У корабля есть имя, средняя скорость и порт приписки.
Имя корабля менять нельзя, при попытке перезаписать имя в консоль должно выводиться предупреждение.
Создать экземпляр класса и протестировать работу.*/
fun main() {
    val ship = Ship()
    println(ship.name)
    println()

    ship.name = "новый"
}

class Ship(
    name: String = "Nautilus",
    private val averageSpeed: Int = 100,
    private val shipPort: String = "Ocean",
) {
    var name: String = "Nautilus"
        set(value) { println("Имя корабля менять нельзя") }
}