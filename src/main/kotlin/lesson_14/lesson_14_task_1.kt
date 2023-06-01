package lesson_14

/*В компьютерной игре есть три типа кораблей: стандартные, грузовые и ледоколы.
У всех кораблей свои параметры: название, скорость и т. д.
У грузовых скорость меньше, а грузоподъемность больше.
У ледоколов ниже и скорость и вместительность, но они могут колоть лёд.

 – создай класс, стандартный корабль;
 – затем создай экземпляр этого класса и вызови его методы: с какой скоростью движется, сколько перевозит ящиков груза;
 – выведи информацию о свойствах кораблей в консоль.*/
fun main() {
    val stShip = StandardShip("Стандартный")
    stShip.runfullAdead()
    stShip.getSpeed()
    stShip.getCargoCapacity()
    stShip.isShipIceBreaker()
    println(stShip)
    println()

    val crShip = CargoShip("Грузовой")
    crShip.runfullAdead()
    crShip.getSpeed()
    crShip.getCargoCapacity()
    crShip.isShipIceBreaker()
    println(crShip)
    println()

    val iceShip = IcebreakerShip("Ленин")
    iceShip.runfullAdead()
    iceShip.getSpeed()
    iceShip.getCargoCapacity()
    iceShip.isShipIceBreaker()
    println(iceShip)
}

open class StandardShip(
    val name: String,
    val speed: Int = 100,
    val cargoCapacity: Int = 1000,
    val icebreakingCapability: Boolean = false,
) {
    fun runfullAdead() {
        println("$name: полный вперед")
    }

    fun getSpeed() {
        println("скорость корабля $name = $speed")
    }

    fun getCargoCapacity() {
        println("корабль $name перевозит $cargoCapacity тонн груза")
    }

    fun isShipIceBreaker() {
        if (icebreakingCapability) println("корабль $name может ходить по льду")
    }

    override fun toString(): String {
        return "(name='$name', " +
                "speed=$speed, " +
                "cargoCapacity=$cargoCapacity, " +
                "icebreakingCapability=$icebreakingCapability)"
    }
}

class CargoShip(
    name: String,
) : StandardShip(name, speed = 50, cargoCapacity = 5000)

class IcebreakerShip(
    name: String,
) : StandardShip(name, speed = 50, cargoCapacity = 500)