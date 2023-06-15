package lesson_19

/*В компьютерной игре танк может подбирать разные виды патронов.
Патроны различаются силой удара. Синие – 5 единиц, зеленые – 10, красные – 20.
 – создай enum класс для патронов и класс танка.
 У танка должны быть методы вооружения новым типом патронов и выстрела.
 При выстреле в консоль должен выводиться нанесенный урон;
 – создай экземпляр танка и “произведи” несколько выстрелов разными патронами;
 – в решении должен использоваться enum.*/

fun main() {
    val tank = Tank("T34")
    tank.takeNewBullets(Bullets.BLUE)
    tank.fire()

    tank.takeNewBullets(Bullets.RED)
    tank.fire()
}

class Tank(private val name: String, private var tankBullets: Int = 1) {

    fun fire() {
        println("танк $name стреляет и наносит урон $tankBullets")
    }

    fun takeNewBullets(bullets: Bullets) {
        println("вы получили новое вооружение с уроном ${bullets.shotForce}")
        tankBullets = bullets.shotForce
    }
}

enum class Bullets(val shotForce: Int) {
    BLUE(5),
    GREEN(10),
    RED(20),
}