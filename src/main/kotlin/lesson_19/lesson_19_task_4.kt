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
    tank.takeNewBullets(takeBullets(Bullets.BLUE))
    tank.fire()

    tank.takeNewBullets(takeBullets(Bullets.RED))
    tank.fire()
}

class Tank(private val name: String, private var bullets: Int = 1) {

    fun fire() {
        println("танк $name стреляет и наносит урон $bullets")
    }

    fun takeNewBullets(takeBullets: Int) {
        println("вы получили новое вооружение с уроном $takeBullets")
        bullets = takeBullets
    }
}

enum class Bullets {
    BLUE,
    GREEN,
    RED,
}

fun takeBullets(bullets: Bullets) : Int {
    return when (bullets) {
        Bullets.BLUE -> 5
        Bullets.GREEN -> 10
        Bullets.RED -> 20
    }
}