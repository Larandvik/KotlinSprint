package lesson_18

/*В программе хранятся данные о посылках. Нужно написать иерархию классов, описывающих коробки.
Чтобы рассчитывать упаковку для посылок, в классе должен быть метод, возвращающий площадь поверхности посылки.
Если посылка прямоугольная, она должна создаваться с длиной, шириной и высотой.
Если посылка – куб, то только с длиной ребра.*/

fun main() {
    val parcel1 = RectangularParcel(10.0, 5.0, 7.0)
    val parcel2 = CubicParcel(10.0)

    println(parcel1.getAreaParcel())
    println(parcel2.getAreaParcel())
}

abstract class Parcel {
    abstract fun getAreaParcel(): Double
}

class RectangularParcel(
    private val length: Double,
    private val width: Double,
    private val height: Double,
) : Parcel() {

    override fun getAreaParcel(): Double {
        return 2 * (length * width + length * height + width * height)
    }
}

class CubicParcel(
    private val sideLength: Double,
) : Parcel() {

    override fun getAreaParcel(): Double {
        return 6 * Math.sqrt(sideLength)
    }
}
