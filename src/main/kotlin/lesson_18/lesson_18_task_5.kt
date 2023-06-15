package lesson_18
/*В приложении есть экран. Мы можем рисовать в нем разные объекты, указывая координаты (x, y) и сам объект.
Объектами выступают круг, квадрат и точка. Координаты могут быть как Int, так и Float.
Реализуй классы точки, квадрата и круга, а также класс Screen со всеми перегруженными методами draw(...).*/

fun main() {
    val screen1 = Screen()

    val circle = Circle("круг", 10.0)
    val square = Square("квадрат", 5.0)
    val point = Point("точка")

    screen1.draw(circle, 5, 5.0F)
    screen1.draw(square, 2, 2)
    screen1.draw(point, 3.0F, 3.5F)
}

open class Figure(open val name: String)

class Circle(name: String, private val radius: Double) : Figure(name)

class Square(name: String, private val sideLength: Double) : Figure(name)

class Point(name: String) : Figure(name)

class Screen {

    fun draw(figure: Figure, x: Int, y: Int) {
        println("рисуем ${figure.name} с координаторами x = $x , y = $y")
    }

    fun draw(figure: Figure, x: Float, y: Int) {
        println("рисуем ${figure.name} с координаторами x = $x , y = $y")
    }

    fun draw(figure: Figure, x: Int, y: Float) {
        println("рисуем ${figure.name} с координаторами x = $x , y = $y")
    }

    fun draw(figure: Figure, x: Float, y: Float) {
        println("рисуем ${figure.name} с координаторами x = $x , y = $y")
    }
}
