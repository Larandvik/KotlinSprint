package lesson_16
/*Создай класс, описывающий круг.
У него должны быть методы, вычисляющие длину окружности и площадь круга, используя радиус.
Число Pi должно быть равным 3,14 и защищенным от изменений.
Радиус передается через конструктор и не виден из внешнего по отношению к классу кода.
Создай объект, вызови у него методы для расчета окружности и площади и выведи данные в консоль.*/
fun main() {
    val circle = Circle(10.0)
    println(circle.getCircumference())
    println(circle.getArea())
}

class Circle(
    private val radius: Double,
    private val pi: Double = (String.format("%.2f", Math.PI)).replace(',','.').toDouble()
) {

    fun getCircumference() : Double = 2 * pi * radius

    fun getArea() : Double = pi * Math.sqrt(radius)
}
