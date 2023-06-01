package lesson_14

/*Преобразуй (скопируй в файл с этой задачей с новым названием) класс из прошлой задачи
в родительский и напиши два подкласса, представляющие грузовой корабль и ледокол.
Создай по одному экземпляру каждого класса и вызови их методы.
Придумай для каждого подкласса по 1-2 специализированного свойства.

 – добавь метод для ледокола, что он может колоть лед;
 – выведи в консоль информацию с названием кораблей, с какой скоростью движутся,     сколько перевозят грузов, и что ледокол колет лед.*/
fun main() {
    val stShip = StandardShip2("Стандартный")
    stShip.runfullAdead2()
    stShip.getSpeed2()
    stShip.getCargoCapacity2()
    stShip.isShipIceBreaker2()
    println(stShip)
    println()

    val crShip = CargoShip2("Грузовой", "танкер")
    crShip.runfullAdead2()
    crShip.getSpeed2()
    crShip.getCargoCapacity2()
    crShip.isShipIceBreaker2()
    println(crShip)
    println()

    val iceShip = IcebreakerShip2("Ленин", 345, -60)
    iceShip.runfullAdead2()
    iceShip.getSpeed2()
    iceShip.getCargoCapacity2()
    iceShip.isShipIceBreaker2()
    println(iceShip)
}

open class StandardShip2(
    val name: String,
    val speed: Int = 100,
    val cargoCapacity: Int = 1000,
    val icebreakingCapability: Boolean = false,
) {
    fun runfullAdead2() {
        println("$name: полный вперед")
    }

    fun getSpeed2() {
        println("скорость корабля $name = $speed")
    }

    fun getCargoCapacity2() {
        println("корабль $name перевозит $cargoCapacity тонн груза")
    }

    fun isShipIceBreaker2() {
        if (icebreakingCapability) println("корабль $name может ходить по льду")
    }

    override fun toString(): String {
        return "(название: '$name', " +
                "скорость: $speed, " +
                "грузоподъемность: $cargoCapacity, " +
                "может ходить по льду: $icebreakingCapability)"
    }
}

class CargoShip2(
    name: String,
    val type: String,
) : StandardShip2(name, speed = 50, cargoCapacity = 5000) {
    override fun toString(): String {
        return super.toString() + " (тип: '$type')"
    }
}

class IcebreakerShip2(
    name: String,
    val rangeReserve: Int,
    val minTemperature: Int,
) : StandardShip2(name, speed = 50, cargoCapacity = 500, icebreakingCapability = true) {
    override fun toString(): String {
        return super.toString() + " (максимальная дистанция: $rangeReserve, минимальная температура: $minTemperature)"
    }
}