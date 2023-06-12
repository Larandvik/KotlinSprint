package lesson_17

/*Каждый раз, когда посылка прибывает в промежуточный пункт обработки, в программе меняется её местоположение.
Нужно написать класс посылки. Должно быть неизменяемое поле с номером и поле с текущим местоположением в виде строки.
Также должен быть счетчик перемещений, обновляющийся при перезаписи местоположения.
Сымитировать прибытие посылки в новый пункт обработки, протестировать изменение счетчика.
При реализации использовать сеттер.*/
fun main() {
    val package1 = Package(1234, "Москва")

    package1.currentLocation = "Владимир"
    println(package1.currentLocation)
    package1.currentLocation = "Воронеж"
    println(package1.currentLocation)
}

class Package(
    private val parcelNumber: Int,
    private var startLocation: String,
) {

    private var counterLocation: Int = 1

    var currentLocation: String
        get() = startLocation
        set(value) {
            startLocation = value
            counterLocation++
            println(counterLocation)
        }
}

