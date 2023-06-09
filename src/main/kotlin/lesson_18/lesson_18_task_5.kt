package lesson_18
/*В приложении есть экран. Мы можем рисовать в нем разные объекты, указывая координаты (x, y) и сам объект.
Объектами выступают круг, квадрат и точка. Координаты могут быть как Int, так и Float.
Реализуй классы точки, квадрата и круга, а также класс Screen со всеми перегруженными методами draw(...).*/

fun main() {
    val circle = Circle("круг", 10.0)
    val square = Square("квадрат", 5.0)
    val point = Point("точка")

    val screen1 = Screen(circle)
    screen1.draw(5, 5.0F)

    val screen2 = Screen(square)
    screen2.draw(2, 2)

    val screen3 = Screen(point)
    screen3.draw(3.0F, 3.5F)
}

open class Figure(open val name: String)

class Circle(name: String, private val radius: Double) : Figure(name)

class Square(name: String, private val sideLength: Double) : Figure(name)

class Point(name: String) : Figure(name)

class Screen(private val figure: Figure) {

    fun draw(x: Int, y: Int) {
        println("рисуем ${figure.name} с координаторами x = $x , y = $y")
    }

    fun draw(x: Float, y: Int) {
        println("рисуем ${figure.name} с координаторами x = $x , y = $y")
    }

    fun draw(x: Int, y: Float) {
        println("рисуем ${figure.name} с координаторами x = $x , y = $y")
    }

    fun draw(x: Float, y: Float) {
        println("рисуем ${figure.name} с координаторами x = $x , y = $y")
    }
}
