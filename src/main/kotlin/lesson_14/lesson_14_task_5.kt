package lesson_14

/*Напиши программу, которая будет описывать геометрические фигуры: круг, прямоугольник и треугольник.
Все фигуры имеют свой цвет, а также свои индивидуальные параметры:
у круга это радиус окружности;
у прямоугольника – ширина и высота;
у треугольника – длины каждой стороны.

 – создай абстрактный класс Figure с полем color;
 – у класса Figure определи два абстрактных метода:
 реализация первого метода должна возвращать площадь фигуры,
 а реализация второго – возвращать ее периметр;
 – создай 3 класса наследника для фигур  Circle, Rectangle  и Triangle  с соответствующими полями;
 – в этих же классах, реализуй методы для каждой из геометрических фигур
 (формулы для вычисления площади и периметра можно нагуглить);
 – после этого создай по 2 объекта с различными цветами (красный, черный, зеленый) и произвольными размерами для каждой фигуры;
 – наконец, создай 2 метода: первый, принимая на вход список геометрических фигур, должен вернуть сумму периметров красных фигур;
 второй, также принимая на вход список, должен вернуть сумму площадей красных фигур;
 – вызови эти два метода с массивом созданных объектов фигур  и выведи результат в консоль.*/
const val COLOR_RED = "red"
const val COLOR_BLACK = "black"
const val COLOR_GREEN = "green"

fun main() {
    val circle = Circle(COLOR_RED, 5.0)
    val rectangle = Rectangle(COLOR_BLACK, 20.0, 10.0)
    val triangle = Triangle(COLOR_GREEN, 5.0, 3.0, 7.0)
    println(getSumPerimeterAllRedFigures(listOf(circle, rectangle, triangle)))
    println(getSumAreaAllRedFigures(listOf(circle, rectangle, triangle)))
}

fun getSumAreaAllRedFigures(list: List<Figure>): Double {
    var sum = 0.0
    for (figure in list) {
        if (figure.color == COLOR_RED) sum += figure.getFigureArea()
    }
    return sum
}

fun getSumPerimeterAllRedFigures(list: List<Figure>): Double {
    var sum = 0.0
    for (figure in list) {
        if (figure.color == COLOR_RED) sum += figure.getFigurePerimeter()
    }
    return sum
}

abstract class Figure(val color: String) {
    abstract fun getFigureArea(): Double
    abstract fun getFigurePerimeter(): Double
}

class Circle(
    color: String,
    val radius: Double,
) : Figure(color) {
    override fun getFigureArea(): Double = Math.PI * Math.sqrt(radius)

    override fun getFigurePerimeter(): Double = 2 * Math.PI * radius
}

class Rectangle(
    color: String,
    val width: Double,
    val height: Double,
) : Figure(color) {
    override fun getFigureArea(): Double = width * height

    override fun getFigurePerimeter(): Double = 2 * (width + height)
}

class Triangle(
    color: String,
    val lengthA: Double,
    val lengthB: Double,
    val lengthC: Double,
) : Figure(color) {
    override fun getFigureArea(): Double {
        val semiPerimeter = getFigurePerimeter() / 2
        return Math.sqrt(semiPerimeter * (semiPerimeter - lengthA) * (semiPerimeter - lengthB) * (semiPerimeter - lengthC))
    }

    override fun getFigurePerimeter(): Double = lengthA + lengthB + lengthC
}