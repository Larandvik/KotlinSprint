package lesson_15

/*В компьютерной игре есть грузовые и легковые автомобили.
Напиши интерфейсы, обеспечивающие передвижение машин, перевозку пассажиров и перевозку грузов.
Грузовые машины могут перевозить одного пассажира и 2 тонны груза, легковые – трех пассажиров.
Сообщения о действиях выведи в консоль.
Создай классы и несколько объектов. Вызови их методы, «перевезя» таким образом 6 человек и 2 тонны груза.*/
fun main() {
    val car1 = Car155("Mustang")
    car1.drive()
    val car2 = Car155("Chevy")
    car2.drive()
    val truck155 = Truck155("Truck")
    truck155.drive()

    truck155.transportPassengers(1)
    truck155.transportCargo(2)
    car1.transportPassengers(3)
    car2.transportPassengers(2)
}

interface Drivable155 {
    fun drive()
}

interface CargoCarrier155 {
    fun transportCargo(countWeight: Int)
}

interface PassengerCarrier155 {
    fun transportPassengers(countPassenger: Int) {
        println("перевозит $countPassenger пассажиров")
    }
}

abstract class Machine155(val name: String) : Drivable155 {
    override fun drive() {
        println("$name едет")
    }
}

class Car155(name: String) : Machine155(name), PassengerCarrier155 {

    override fun transportPassengers(countPassenger: Int) {
        println("$name перевозит $countPassenger пассажиров")
    }
}

class Truck155(name: String) : Machine155(name), PassengerCarrier155, CargoCarrier155 {
    override fun transportPassengers(countPassenger: Int) {
        println("$name перевозит $countPassenger пассажиров")
    }

    override fun transportCargo(countWeight: Int) {
        println("$name перевозит $countWeight тонн груза")
    }
}